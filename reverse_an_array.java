import java.util.*;
public class reverse_an_array {
    public static void main(String[] args) {
        
        int n,i;
        int arr[]=new int[100];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of elements:");
        n=obj.nextInt();
        for( i=0;i<n;i++){
            System.out.println("Enter the "+i+ "th element");
            arr[i]=obj.nextInt();
        }
        int length=arr.length;
        System.out.println("The reverse string is :");
        for(int j=length-1;j>=0;j--){
            System.out.print(arr[j]+"   ");
        }
        
    }
}
