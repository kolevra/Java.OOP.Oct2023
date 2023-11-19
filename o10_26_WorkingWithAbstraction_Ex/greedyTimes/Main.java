
package o10_26_WorkingWithAbstraction_Ex.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] itemsArr = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> bagMap = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long money = 0;

        for (int i = 0; i < itemsArr.length; i += 2) {
            String name = itemsArr[i];
            long count = Long.parseLong(itemsArr[i + 1]);

            String currentItem = "";

            if (name.length() == 3) {
                currentItem = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                currentItem = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                currentItem = "Gold";
            }

            if (currentItem.equals("") || isBagCapacityEnough(bagCapacity, bagMap, count)) {
                continue;
            }

            switch (currentItem) {
                case "Gem":
                    if (!bagMap.containsKey(currentItem)) {
                        if (bagMap.containsKey("Gold")) {
                            if (count > bagMap.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bagMap.get(currentItem).values().stream().mapToLong(e -> e).sum() + count > bagMap.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bagMap.containsKey(currentItem)) {
                        if (bagMap.containsKey("Gem")) {
                            if (count > bagMap.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bagMap.get(currentItem).values().stream().mapToLong(e -> e).sum() + count > bagMap.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bagMap.containsKey(currentItem)) {
                bagMap.put((currentItem), new LinkedHashMap<>());
            }

            if (!bagMap.get(currentItem).containsKey(name)) {
                bagMap.get(currentItem).put(name, 0L);
            }


            bagMap.get(currentItem).put(name, bagMap.get(currentItem).get(name) + count);
            if (currentItem.equals("Gold")) {
                gold += count;
            } else if (currentItem.equals("Gem")) {
                gems += count;
            } else if (currentItem.equals("Cash")) {
                money += count;
            }
        }


        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : bagMap.entrySet()) {
            Long sumValues = entry.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", entry.getKey(), sumValues);

            entry.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean isBagCapacityEnough(long bagCapacity, LinkedHashMap<String, LinkedHashMap<String, Long>> bagMap, long count) {
        return bagCapacity < bagMap.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count;
    }
}