package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a double variable with a value of 20
        double valueTwenty = 20.00d;
        double valueEighty = 80.00d;
        double totalValue = (valueEighty+valueTwenty)*100.00d;
        double remainderValue = totalValue % 40.00d;
        boolean isZero = (remainderValue == 0) ? true : false;
        if(!isZero){
            System.out.println("Got Some Remainder");
        }

    }
}
