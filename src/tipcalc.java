import java.util.Scanner;
public class tipcalc {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //User input here
    System.out.print("Please input your total bill: $");
    double bill = s.nextDouble();
    System.out.println();
    System.out.print("Please input your tip percentage: ");
    int tipPercent = s.nextInt();
    System.out.println();
    System.out.print("How many people are in your group?: ");
    int personCount = s.nextInt();
    System.out.println();
    System.out.println();
    //Calculations
    double tipAmount = (bill/100)*tipPercent;
    double tipPerPerson = tipAmount/personCount;
    double billTotal = bill + tipAmount;
    double billSplit = billTotal/personCount;
    //Display
    System.out.println("Total bill: $" + Math.round(billTotal*100.0)/100.0);
    System.out.println("Total tip: $" + Math.round(tipAmount*100.0)/100.0);
    System.out.println("");
    System.out.println("Total per person: $" + Math.round(billSplit*100.0)/100.0);
    System.out.println("Tip per person: $" + Math.round(tipPerPerson*100.0)/100.0);




    }
}
