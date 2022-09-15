import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int N=sc.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter the elements:");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        try{
            for(int i=0;i<=N;i++)
            {
                for(int k=i+1;k<N;k++)
                {
                    if(arr[i]>arr[k])
                    {
                        temp=arr[i];
                        arr[i]=arr[k];
                        arr[k]=temp;
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Here is your sorted array: ");
        for(int p=0;p<N;p++)
        {
            System.out.print(arr[p]+" ");
        }

    }
}
