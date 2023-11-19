package o10_30_Encapsulation_Ex.shopping;

public class Validator {

    private Validator() {
    }

    public static void validateString(String str){
        if(str.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public static void validateMoney(double money){
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }

    }


}
