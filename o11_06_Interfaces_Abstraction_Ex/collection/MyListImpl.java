package o11_06_Interfaces_Abstraction_Ex.collection;

public class MyListImpl extends Collection implements MyList {
    @Override
    public String remove() {
        return super.removeFirst();
    }

    @Override
    public int add(String item) {
        super.addFirst(item);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
