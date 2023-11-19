package o11_03_Interfaces_Abstraction.hello2;

public class Bulgarian extends BasePerson {


    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
