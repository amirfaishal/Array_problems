import java .util.*;
public class count_subarray_sum_k {
    public static void main(String[] args) {
        int len=0,count=0,i,j,sum,k;                 //this program can find answer for both negative and positive 
        int a[]={1,2,3};
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number whose subarray is to be found");
        k=obj.nextInt();
        for(i=0;i<a.length;i++){
            sum=0;
            for(j=i;j<a.length;j++){
                sum+=a[j];
                if(Math.abs(sum)>k){
                    break;
                }
                if(Math.abs(sum)==k){
                    count++;
                }
            }
        }
        System.out.println("The total number of subarray with sum "+k+" is "+count);
    }
}
