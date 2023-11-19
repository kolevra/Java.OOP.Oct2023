package o10_26_WorkingWithAbstraction_Ex.trafficLights;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }


    public  void changeColor(){
        switch (this.color){
            case RED:
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
        }
    }

    public String getColor() {
        return this.color.name();
    }
}
