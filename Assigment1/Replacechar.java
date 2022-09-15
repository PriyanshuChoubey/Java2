import java.util.Scanner;

public class Replacechar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String x=sc.nextLine();
        System.out.println("Enter the charecter to replace: ");
        char c=sc.next().charAt(0);
        System.out.println("Enter the charecter to insert:");
        char newC=sc.next().charAt(0);
        int l=x.length();
        for(int i=0;i<l;i++){

            x=x.replace(c,newC);

        }
        System.out.println("Replaced string: "+x);
    }
}
