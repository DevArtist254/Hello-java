public class SecClass {
    public static void main(String[] args) {
        boolean hey = false;

        System.out.println(hey);
        System.out.println("Hello, Kevin");

        //Logical && operator
        int topScore = 200;
        //What is your logic code asking until the condition is reached
        //if(topScore >= 100) System.out.println("You got the top score");

        //&& if both statements is true, it will run if one of the statement is false it won't run
        int lvlScore = 1200;
        int highScore = 10000;

        if((topScore <= highScore) && (topScore >= lvlScore)){
            System.out.println("You can move to the next level");
        }else {
            System.out.println("Try again");
        }

        //Always strive for meaning for our logic by starting with what we are comparing to,
        // to what we are comparing against

        //Or || Requires only one statement to be true
         if((topScore > 90) || (topScore < 500)) System.out.println("This will return true if given any range");

        if((topScore > 90) && (topScore < 500)) System.out.println("This will return true if given any range");

        //The Not operator is used to test a question with a negative sense behind it
        boolean isCar = true;

        if(!isCar) System.out.println("Please use a car for this tour");

        //The ternary operator allows us to store values use our qn logic
        String makeOfCar = "Volks";
        boolean isDomestic = makeOfCar != "Volks";

        if (isDomestic) System.out.println("Your car is not for this country");
    }
}
