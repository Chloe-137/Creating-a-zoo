import java.util.Scanner;

import static java.lang.System.*;

public static void main(String[] args) {

    Tiger tigerObject = new Tiger();
    Dolphin dolphinObject = new Dolphin();
    Penguin penguinObject = new Penguin();

    // for getting input
    Scanner keyboard = new Scanner(in);

    // for loop continuation - 1 represents true
    int continueOuterLoop;
    int continueInnerLoop = 1;

    // for menu choice
    int menuChoice = 1;


    do {
        switch (animalChoiceMenu(keyboard)) {
            case 1:
                do {
                    out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                    // get menu choice

                    switch (menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject)) {
                        case 1:
                            System.out.println("Enter Tiger name: ");
                            tigerObject.setNameOfAnimal(keyboard.next());
                            System.out.println("Enter weight: ");
                            tigerObject.setWeight(keyboard.nextInt());
                            System.out.println("Enter height: ");
                            tigerObject.setHeight(keyboard.nextInt());
                            System.out.println("Enter age: ");
                            tigerObject.setAge(keyboard.nextInt());
                            System.out.println("Enter speed: ");
                            tigerObject.setSpeed(keyboard.nextInt());
                            System.out.println("Enter sound level of roar: ");
                            tigerObject.setSoundLevelOfRoar(keyboard.nextInt());
                            System.out.println("Enter number of stripes: ");
                            tigerObject.setNumberOfStripes(keyboard.nextInt());
                            break;
                        case 2:
                            System.out.println("Tiger name: " + tigerObject.getNameOfAnimal());
                            System.out.println("Tiger weight: " + tigerObject.getWeight());
                            System.out.println("Tiger height: " + tigerObject.getHeight());
                            System.out.println("Tiger age: " + tigerObject.getAge());
                            System.out.println("Tiger speed: " + tigerObject.getSpeed() + " mph");
                            System.out.println("Tiger level of roar: " + tigerObject.getSoundLevelOfRoar());
                            System.out.println("Tiger number of stripes: " + tigerObject.getNumberOfStripes());
                            break;
                        case 3:
                            tigerObject.walking();
                            break;
                        case 4:
                            tigerObject.eatingFood();
                            break;
                        default:
                            out.println("Not supported");

                    }
                    out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                    continueInnerLoop = keyboard.nextInt();
                } while (continueInnerLoop == 1);

                break;
            case 2:
                do {
                    out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                    // get menu choice
                    switch (menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject)) {
                        case 1:
                            System.out.println("Enter Dolphin name: ");
                            dolphinObject.setNameOfAnimal(keyboard.next());
                            System.out.println("Enter weight: ");
                            dolphinObject.setWeight(keyboard.nextInt());
                            System.out.println("Enter height: ");
                            dolphinObject.setHeight(keyboard.nextInt());
                            System.out.println("Enter age: ");
                            dolphinObject.setAge(keyboard.nextInt());
                            System.out.println("Enter animal color: ");
                            dolphinObject.setColorOfDolphin(keyboard.next());
                            System.out.println("Enter swimming speed: ");
                            dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                            break;
                        case 2:
                            System.out.println("Dolphin name: " + dolphinObject.getNameOfAnimal());
                            System.out.println("Dolphin weight: " + dolphinObject.getWeight());
                            System.out.println("Dolphin height: " + dolphinObject.getHeight());
                            System.out.println("Dolphin age: " + dolphinObject.getAge());
                            System.out.println("Dolphin color: " + dolphinObject.getColorOfDolphin());
                            System.out.println("Dolphin swimming speed: " + dolphinObject.getSwimmingSpeed() + " nautical miles per hour");
                            break;
                        case 3:
                            dolphinObject.swimming();
                            break;
                        case 4:
                            dolphinObject.eatingFood();
                            dolphinObject.eatingCompleted();
                            break;
                        default:
                            out.println("Not supported");
                    }
                    out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                    continueInnerLoop = keyboard.nextInt();
                } while (continueInnerLoop == 1);
                break;
            case 3:
                do {
                    out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                    switch (menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject)) {
                        case 1:
                            System.out.println("Enter Penguin name: ");
                            penguinObject.setNameOfAnimal(keyboard.next());
                            System.out.println("Enter weight: ");
                            penguinObject.setWeight(keyboard.nextInt());
                            System.out.println("Enter height: ");
                            penguinObject.setHeight(keyboard.nextInt());
                            System.out.println("Enter age: ");
                            penguinObject.setAge(keyboard.nextInt());
                            break;
                        case 2:
                            System.out.println("Penguin name: " + penguinObject.getNameOfAnimal());
                            System.out.println("Penguin weight: " + penguinObject.getWeight());
                            System.out.println("Penguin height: " + penguinObject.getHeight());
                            System.out.println("Penguin age: " + penguinObject.getAge());
                            break;
                        case 3:
                            int swimmingChoice = isSwimmingOrNot(keyboard);
                            if (swimmingChoice == 1) {
                                penguinObject.setSwimming(true);
                                out.println("Enter swimming speed: ");
                                penguinObject.setSwimmingSpeed(keyboard.nextInt());
                                penguinObject.swimming();
                            } else if (swimmingChoice == 2) {
                                penguinObject.setSwimming(false);
                                out.println("Enter walking speed: ");
                                penguinObject.setSpeed(keyboard.nextInt());
                                penguinObject.walking();
                            } else {
                                out.println("Invalid choice, please select 1 or 2");
                            }
                            break;
                        case 4:
                            penguinObject.eatingFood();
                            penguinObject.eatingCompleted();
                            break;
                        default:
                            out.println("Sorry no such option available.");
                            break;
                    }
                    out.println("Continue with this animal? (Enter 1 for yes / 2 for no): ");
                    continueOuterLoop = keyboard.nextInt();

                } while (continueOuterLoop == 1);
                break;
            default:
                out.println("Sorry, no such animal available");
        }
        out.println("Continue main Zoo menu? (Enter 1 for yes / 2 for no):");
        continueOuterLoop = keyboard.nextInt();
    } while (continueOuterLoop == 1);
}


private static int isSwimmingOrNot(Scanner keyboard) {
    int choiceGivenByUser;

    out.println("Is the Penguin Swimming?");
    out.println("1. Yes");
    out.println("2. No");

    choiceGivenByUser = keyboard.nextInt();
    return choiceGivenByUser;
}

private static int animalChoiceMenu(Scanner keyboard) {
    int choiceGivenByUser;

    out.println("******* ZOO ANIMAL choice menu ******");
    out.println("1. Tiger");
    out.println("2. Dolphin");
    out.println("3. Penguin");

    out.println("Enter choice of animal:");
    choiceGivenByUser = keyboard.nextInt();
    return choiceGivenByUser;
}

private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
    int choiceGivenByUser;

    out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
    out.println("1. Set properties");
    out.println("2. Display properties");
    out.println("3. Display movement");
    out.println("4. Display eating");

    out.println("Enter choice (1-4):");
    choiceGivenByUser = keyboard.nextInt();
    return choiceGivenByUser;

}



