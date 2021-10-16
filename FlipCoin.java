import java.util.*;
public class FlipCoin {
    public static int Head = 0;
    public static int Tail = 0;
    public static double HeadPercentage = 0;
    public static double TailPercentage = 0;
    public static void main(String[] args) {
        System.out.println("Enter the no of flip");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        for (int i=0;i<n;i++){
            Random r = new Random();
            double coin = r.nextInt(2);
            if (coin < 0.5){
                System.out.println("coin=Tails");
                Tail = 1 + Tail;
                System.out.println(+Tail);
            }
            else {
                System.out.println("coin=Head");
                Head = 1 + Head;
                System.out.println(+Head);
            }
        }
        HeadPercentage = (Head/n)*100;
        TailPercentage = (Tail/n)*100;
        System.out.println("Head_Percentage :" +HeadPercentage);
        System.out.println("Tail_Percentage :" +TailPercentage);

    }
}
