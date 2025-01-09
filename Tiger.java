public class Tiger extends Animal implements Eat, Walk {

    private String nameOfAnimal = "Tiger";
    private int weight = 0;
    private int height = 0;
    private int age = 0;
    private int soundLevelOfRoar = 0;
    private int numberOfStripes = 0;
    private int speed = 0;

    // Getters and Setters
    public Tiger() {
        super("Tiger");
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }


    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }


    public int getWeight() {
        return this.weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public int getAge() {
        return this.age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return this.soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public int getNumberOfStripes() {
        return this.numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }




    public void eatingFood() {
        System.out.println("Tiger: I am eating meat");
    }


    public void eatingCompleted() {

        System.out.println("Tiger: I have eaten meat");
    }

    public void walking() {

        System.out.println("Tiger: I am walking at the speed " + this.speed + "mph");
    }
}

