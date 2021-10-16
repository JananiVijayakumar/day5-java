import java.util.*;
public class PowerOf2 {
    public static int Num = 1;
    public static void main(String[] args) {
		System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N>=0 && N<31){
            for (int j=1;j<=N;j++){
                Num= Num*2;
            }
            System.out.println("power of 2 is : " + Num);
        }
    }
}