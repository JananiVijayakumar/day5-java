import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("enter the 4 digit year : ");
		Scanner sc = new Scanner(System.in);
	    int Year = sc.nextInt();
				if ((Year <= 1000) || (Year >=9999)){
			System.out.println(Year+ "is not a 4 digit year");
		}
		else{
			if((Year % 4 == 0) && (Year %400 == 0) && (Year % 100 != 0)){
				System.out.println(Year+ " is a leap year");
			}
			else {
				System.out.println(Year+ " is not a leap year");
			}
		}
	}
}
