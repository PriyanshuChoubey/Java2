import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A,B;
        System.out.println("Enter A and B:");
        A=sc.nextInt();
        B=sc.nextInt();
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("Swaped numbers are:");
        System.out.println("A="+A+" B="+B);
    }
}
