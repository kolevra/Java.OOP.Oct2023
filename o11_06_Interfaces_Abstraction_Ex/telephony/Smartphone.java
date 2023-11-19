package o11_06_Interfaces_Abstraction_Ex.telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String site : this.urls) {

            boolean isStringValid = true;

            for (int i = 0; i < site.length(); i++) {
                if (Character.isDigit(site.charAt(i))) {
                    sb.append("Invalid URL!");
                    isStringValid = false;
                    break;
                }
            }
            if (isStringValid) {
                sb.append("Browsing: ").append(site).append("!");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();

    }

    @Override
    public String call() {

        StringBuilder sb = new StringBuilder();

        for (String number : this.numbers) {

            boolean isStringValid = true;

            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    sb.append("Invalid number!");
                    isStringValid = false;
                    break;
                }
            }
            if (isStringValid) {
                sb.append("Calling... ").append(number);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();

    }

}
