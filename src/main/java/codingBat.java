public class codingBat {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

        public boolean sleepIn (boolean weekday,boolean vacation) {
            if (!weekday || vacation) {
                return true;
            }
            return false;
        }

    }

    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble
    // if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        public boolean monkeyTrouble (boolean aSmile, bSmile) {
            if (aSmile && bSmile || !aSmile && bSmile) {
                return true;
            }
            return false;
        }


    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    
}


