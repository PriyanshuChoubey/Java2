import java.beans.Introspector;
import java.util.Scanner;

public class Convert_Int_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integral value:");
        int num=sc.nextInt();
        System.out.println("Enter a string:");
        String name=sc.next();

        //here we are typecasting
        int nameInt=Integer.parseInt(name);
        String numString= String.valueOf(num);
        System.out.println("Converted into String:"+numString);
        System.out.println("Converted into Int:"+nameInt);

    }
}
