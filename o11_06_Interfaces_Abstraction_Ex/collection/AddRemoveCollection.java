package o11_06_Interfaces_Abstraction_Ex.collection;

public class  AddRemoveCollection extends Collection implements AddRemovable{


    @Override
    public String remove() {
        return super.removeLast();
    }

    @Override
    public int add(String item) {
        super.addFirst(item);
        return 0;
    }
}
