import java.util.*;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend number : ");
        double dividend = sc.nextDouble();
		System.out.println("Enter the divisor number : ");
        double divisor = sc.nextDouble();
        double quotient,remainder;
        quotient = dividend/divisor;
        System.out.println("Quotient of the numbers is :" + quotient);
		remainder = dividend%divisor;
		remainder = dividend%divisor;
        System.out.println("Remainder of the numbers is : " + remainder);


    }
}