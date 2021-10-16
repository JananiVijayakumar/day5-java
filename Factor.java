import java.util.*;
public class Factor {
    public static void main(String args[]){
        int Num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        Num = sc.nextInt();

        for(int i = 2; i*i< Num; i++) {
            while(Num%i == 0) {
                System.out.println(" " +i);
                Num = Num/i;
            }
        }
        if(Num >2) {
            System.out.println(Num);
        }
	    }
}