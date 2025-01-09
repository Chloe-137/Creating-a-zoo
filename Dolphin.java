public class Dolphin extends Animal implements Eat, Swim {

    private String colorOfDolphin = "blue";
    private int swimmingSpeed = 0;


public Dolphin(){
    super("Dolphin");
}


    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public String getColorOfDolphin() { return this.colorOfDolphin; }

    public int getSwimmingSpeed() {
        return this.swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }


    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish");
    }

    public void swimming(){
        System.out.println("Dolphin1: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }
}
