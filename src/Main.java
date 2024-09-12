import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double productPrice;
        double salesTax = 0.05;
        double finalPrice;

        System.out.println("What is the price of your item");
        Scanner scan = new Scanner(System.in);
        productPrice = Double.parseDouble(scan.nextLine());

        finalPrice = productPrice + (productPrice * salesTax);
        System.out.println("Your product with tax is $" + finalPrice);
    }

}
