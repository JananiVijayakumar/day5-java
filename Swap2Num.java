import java.util.*;  
class Swap2Num {  
    public static void main(String[] args) {  
       int a, b, c;   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of a :");  
       a = sc.nextInt();  
	   System.out.println("Enter the value of b :");
       b = sc.nextInt();  
       System.out.println("before swapping 2 numbers: "+a +"  "+ b);  
       c = a;  
       a = b;  
       b = c;  
       System.out.println("After swapping 2 numbers: "+a +"   " + b);  
       System.out.println( );  
    }    
}  