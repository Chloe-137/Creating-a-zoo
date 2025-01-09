public class Penguin extends Animal implements Walk, Swim, Eat {

    private boolean isSwimming = false;
    private int speed = 0;
    private int swimmingSpeed = 0;


    public Penguin() {
        super("Penguin");
    }

    public boolean isSwimming() {
        return this.isSwimming;
    }

    public void setSwimming(boolean swimming) {
        this.isSwimming = swimming;
    }


    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Error: Walk speed cannot be negative");
        }
    }

    public int getSwimmingSpeed() {
        return this.swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        if (swimmingSpeed >= 0) {
            this.swimmingSpeed = swimmingSpeed;
        } else {
            System.out.println("Error: Swim speed cannot be negative");
        }
    }


    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish");
    }


    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish");
    }


    public void walking() {
        if (!this.isSwimming) {
            System.out.println("Penguin is walking at a speed of " + this.speed + " mph");
        } else {
            System.out.println("Penguin is not walking right now");
        }
    }


    public void swimming() {
        if (this.isSwimming) {
            System.out.println("Penguin is swimming at " + swimmingSpeed + " nautical miles per hour.");
        } else {
            System.out.println("Penguin is not swimming right now.");
        }
    }

}
