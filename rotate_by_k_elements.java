import java.util.Scanner;

public class rotate_by_k_elements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k;
        System.out.println("Enter by how many elements you want to rotate:");
        Scanner obj=new Scanner(System.in);
        k=obj.nextInt();
        int shift[]=new int[arr.length];
        int newsize=0;
        for(int i=0;i<k;i++){
            shift[i]=arr[i];
            newsize++;
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i]; 
                             //shitfing by one value towards left
        }
        for(int i=0;i<newsize;i++){
            arr[arr.length - k + i]=shift[i];      //adding elements from position k
            
        }
        for( int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+",");        //printing all the values 
        }
    }
}
