import java.util.Scanner;

public class Example19 {
    public static void main(String[] argv) {
        float price;
        double discount;
        double total;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write price");
        price = inputValue.nextFloat();

        if(price <6) {
            discount = 0;
        } else if (price < 60) {
            discount = price * 0.05;
        }else {
            discount = price * 0.1;
        }

        total = price - discount;
        System.out.println("The final price is: " +total);

    }
}
