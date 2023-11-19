package o11_06_Interfaces_Abstraction_Ex.collection;

public class AddCollection extends Collection implements Addable{


    @Override
    public int add(String item) {
        super.addItems(item);
        return super.getItems().size() - 1;
    }
}
