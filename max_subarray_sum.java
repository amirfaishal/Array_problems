public class max_subarray_sum {
    public static void main(String[]args){
        
            int i,j,sum,newsum=0;
            int arr[]={-2,1,-3,4,-1,2,1,-5,4};
            for(i=0;i<arr.length;i++){
                sum=0;
                for(j=i;j<arr.length;j++){
                    sum+=arr[j];
                    newsum=Math.max(sum,newsum);
                }
                
            }
            System.out.println("The largest sum is "+ newsum);
    }
}
