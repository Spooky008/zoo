import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin(); // new penguin object

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop;

        // for menu choice
        int menuChoice;

        do {
            int animalChoice = animalChoiceMenu(keyboard);
            switch (animalChoice) {
                case 1:
                    // Tiger
                    do {
                        System.out.println("The animal which is chosen is : "
                                + tigerObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter speed:");
                                tigerObject.setSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume newline

                                System.out.println("Enter number of stripes");
                                tigerObject.setNumberOfStrips(keyboard.nextInt());
                                keyboard.nextLine(); // consume newline

                                System.out.println("Enter sound level of roar");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());
                                keyboard.nextLine(); // consume newline

                                break;

                            case 2:
                                System.out.println("Name: " + tigerObject.getNameOfAnimal()
                                        + "\nNumber of stripes: " + tigerObject.getNumberOfStrips()
                                        + "\nSpeed: " + tigerObject.getSpeed()
                                        + "\nSound level of roar: " + tigerObject.getSoundLevelOfRoar());
                                break;
                            case 3:
                                // movement for tiger (walk)
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Invalid choice");

                        }
                        System.out.println("Continue with this animal ? " +
                                "(Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                        keyboard.nextLine(); // consume newline
                    } while (continueInnerLoop == 1);
                    break;

                case 2:
                    // Dolphin
                    do {
                        System.out.println("The animal which is chosen is : "
                                + dolphinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter color for dolphin:");
                                String color = keyboard.next();
                                keyboard.nextLine(); // consume newline
                                dolphinObject.setColorOfDolphin(color);

                                System.out.println("Enter swimming speed");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume newline
                                break;

                            case 2:
                                System.out.println("Name: " + dolphinObject.getNameOfAnimal()
                                        + "\nColor of dolphin: " + dolphinObject.getColorOfDolphin()
                                        + "\nSwimming speed: " +
                                        dolphinObject.getSwimmingSpeed());

                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Invalid input");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                        keyboard.nextLine(); // consume newline
                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    // Penguin
                    do {
                        System.out.println("The animal which is chosen is : "
                                + penguinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:
                                // set properties - asking for waddling and swimming speeds
                                System.out.println("Enter waddling speed for penguin:");
                                // assumes Penguin has setWaddlingSpeed(int)
                                penguinObject.setWalkSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume newline

                                System.out.println("Enter swimming speed for penguin:");
                                // assumes Penguin has setSwimmingSpeed(int)
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume newline
                                break;

                            case 2:
                                // display properties - assumes getters exist
                                System.out.println("Name: " + penguinObject.getNameOfAnimal()
                                        + "\nWalking speed: " + penguinObject.getWalkSpeed()
                                        + "\nSwimming speed: " + penguinObject.getSwimSpeed());
                                break;

                            case 3:
                                // movement: must ask whether walking or swimming first
                                System.out.println("Choose movement for the penguin:");
                                System.out.println("1. Walking");
                                System.out.println("2. Swimming");
                                int moveChoice = keyboard.nextInt();
                                keyboard.nextLine(); // consume newline
                                if (moveChoice == 1) {
                                    penguinObject.walking();  // calls walking()
                                } else if (moveChoice == 2) {
                                    penguinObject.swimming(); // calls swimming()
                                } else {
                                    System.out.println("Invalid movement choice.");
                                }
                                break;

                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                                break;
                        }

                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                        keyboard.nextLine(); // consume newline
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();
            keyboard.nextLine(); // consume newline

        } while (continueOuterLoop == 1);

        keyboard.close();
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin"); // added penguin option
        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        keyboard.nextLine(); // consume newline
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        keyboard.nextLine(); // consume newline
        return choiceGivenByUser;
    }
}
