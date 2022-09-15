import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String p=sc.nextLine();
        String up=p.toUpperCase();
        int len=up.length();
        System.out.println("Your string is: "+up);
        System.out.println("Reversed string:");
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(up.charAt(i));
        }
    }
}
