package o11_06_Interfaces_Abstraction_Ex.birthday;

public class Robot implements Identifiable{

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
