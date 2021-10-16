import java.util.*;
public class OddOrEven {
	public static void main (String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		n = sc.nextInt();
		if (n%2==1){
			System.out.println("it is a odd number number");
		}
		else {
			System.out.println("it is a Even number");
		}
	}
} 