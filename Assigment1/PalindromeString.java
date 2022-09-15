import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String name=sc.next();
        int l=name.length();

        String rev=" ";
        for (int i=0;i<l;i++)
        {
            rev=name.charAt(i)+rev;
        }
        System.out.println("Reversed string= "+rev);
        int comp=name.compareTo(rev);
//        System.out.println(comp);
        if(comp==-1)
            System.out.println(name+" is a Palindrome.");
        else
            System.out.println(name+" is not a Palindrome.");
    }
}
