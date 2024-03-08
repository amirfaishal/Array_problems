import java.util.Scanner;
import java.util.*;
class longest_subarray_of_sum{
    public static void main(String[]args){
        int len=0,i,j,sum,k;
        int a[]={1,2,3,4,5,6};
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number whose subarray is to be found");
        k=obj.nextInt();
        for(i=0;i<a.length;i++){
            sum=0;
            for(j=i;j<a.length;j++){
                sum+=a[j];
                if(sum>k){
                    break;
                }
                if(sum==k){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        System.out.println("The length of the longest subarray is "+len);
    }
}