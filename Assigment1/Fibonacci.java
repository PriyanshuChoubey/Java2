import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,n3;
        System.out.println("Enter N:");
        int N=sc.nextInt();
        System.out.print("Fibonacci series= "+n1+" "+n2);
        for(int i=2;i<N;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
