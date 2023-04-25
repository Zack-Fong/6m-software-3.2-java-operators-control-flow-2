enum TransportMode {
    TAXI, TRAIN, BUS, WALK
}

enum Zodiac {
    RAT, OX, TIGER, RABBIT, DRAGON, SNAKE, HORSE, GOAT, MONKEY, ROOSTER, DOG, PIG
}

public class ControlAssignment {
    public static void main(String args[]) {
        // Task 1. Determine if a number is divisible by 3, 5 or both.
        int numToTest = 995;
        boolean isDivisible;
        // Add code here
        isDivisible = numToTest % 3 == 0 || numToTest % 5 == 0 ? true : false;
        System.out.println("numToTest " + numToTest + ": " + (isDivisible ? "is divisible" : "is not divisible"));

        /*
         * Task 2. Given a sample budget, determine what to ride given the following
         * conditions:
         * - if budget is greater than 100, ride a taxi
         * - if budget is between 50 to 100, ride train
         * - if budget is between 20 to 49, ride bus
         * - if budget is between 0 to 19, walk
         * 
         * Reference: What is enum? https://www.w3schools.com/java/java_enums.asp
         */
        float budget = 72.7f;
        int budgetInt = budget > 100 ? (int) (Math.ceil(budget)) : (int) (Math.round(budget));

        TransportMode mode = TransportMode.WALK;
        // Add code here
        if (budgetInt > 100) {
            mode = TransportMode.TAXI;
        } else if (budgetInt >= 50) {
            mode = TransportMode.TRAIN;
        } else if (budgetInt >= 20) {
            mode = TransportMode.BUS;
        }

        System.out.println("Budget: " + budgetInt + " Mode of Transport: " + mode);
        /*
         * Task 3. Use a switch case to determine the zodiac animal given a number from
         * 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
         * 
         * Code Challenge: Delcare and use enum for your zodiac
         * 
         */

        int animalNumber = 7;
        String zodiacString = "";

        // Add code here
        switch (animalNumber) {
            case 1:
                zodiacString = Zodiac.RAT.toString();
                break;
            case 2:
                zodiacString = Zodiac.OX.toString();
                break;
            case 3:
                zodiacString = Zodiac.TIGER.toString();
                break;
            case 4:
                zodiacString = Zodiac.RABBIT.toString();
                break;
            case 5:
                zodiacString = Zodiac.DRAGON.toString();
                break;
            case 6:
                zodiacString = Zodiac.SNAKE.toString();
                break;
            case 7:
                zodiacString = Zodiac.HORSE.toString();
                break;
            case 8:
                zodiacString = Zodiac.GOAT.toString();
                break;
            case 9:
                zodiacString = Zodiac.MONKEY.toString();
                break;
            case 10:
                zodiacString = Zodiac.ROOSTER.toString();
                break;
            case 11:
                zodiacString = Zodiac.DOG.toString();
                break;
            case 12:
                zodiacString = Zodiac.PIG.toString();
                break;
            default:
                zodiacString = "Invalid animalNumber";
        }

        System.out.println("Selected Zodiac: " + zodiacString);
    }
}
