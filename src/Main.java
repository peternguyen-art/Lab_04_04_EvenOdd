public class Main {
    public static void main(String[] args) {
        int numToExamine = 34;
        System.out.println("This program defines if a integer is odd or even");
        if (numToExamine % 2 == 0){
            System.out.println("Your number is even");
        }
        else if (numToExamine % 2 != 0)
        {
            System.out.println("Your number is odd");
        }
        else {
            System.out.println("Please enter an integer");
        }
    }
}