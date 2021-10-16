import java.util.Scanner;
public class HarmonicNum {
    public static double Num=0;
    public static void main(String[] args) {
		System.out.println("Enter any Number : ");
        Scanner sc =new Scanner(System.in);
        double N = sc.nextInt();
		        for (double i=1;i<=N;i++){
            Num=Num+(1/i);
        }
        System.out.println("the value for given n is : " + Num);
    }
}