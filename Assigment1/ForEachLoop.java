//For each Loop is only use for iteration not for taking input in array
import java.util.Scanner;
public class ForEachLoop {
    public static void main(String[] args){
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the size of your Array:");
        int N=sd.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter the elements:");
        for(int i=0;i<N;i++){
            arr[i]=sd.nextInt();
        }
        System.out.println("Here is your array:");
        try
        {
            for(int item : arr){
                System.out.print(item+" ");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
//        System.out.println("Enter the item which you want to change and new item:");
//        int ch=sd.nextInt();
//        int newItem=sd.nextInt();
//        for(int item:arr){
//            if(item==ch)
//                item=newItem;
//        }
//        System.out.println("Modified array:");
//        for(int item:arr){
//            System.out.println(item+" ");
//        }
    }
}
