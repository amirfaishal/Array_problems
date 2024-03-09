import java.util.*;
public class two_sum {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6};
        int j,i,target,temp=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the target:");
        target=obj.nextInt();
        for(i=0;i<arr.length;i++){
            for(j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                temp=1;
                }
            }
        }
        if(temp!=1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
