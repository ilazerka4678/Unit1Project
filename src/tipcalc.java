import java.util.Scanner;
public class tipcalc {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //User input here
    System.out.print("Please input your total bill: ");
    int bill = s.nextInt();
    System.out.println();
    System.out.print("Please input your tip percentage: ");
    int tipPercent = s.nextInt();
    System.out.println();
    System.out.print("How many people are in your group?: ");
    int personCount = s.nextInt();
    System.out.println();
    System.out.println();
    //Calculations
    double tipAmount = (bill/100.0)*tipPercent;
    double tipPerPerson = tipAmount/personCount;
    double billTotal = bill + tipAmount;
    double billSplit = billTotal/personCount;
    //Display
    System.out.println("Total bill: " + billTotal);


    }
}
