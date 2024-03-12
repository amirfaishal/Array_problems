public class longest_consecutive_sequence {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,5,100};
        int n=arr.length;
        int i,j,k,count=1,longest=1,last=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++){
            for( j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                k=arr[i];                //sortng the further array present to get the smallest number
                arr[i]=arr[j];
                arr[j]=k;
                }
            }
        }
        for(i=0;i<n;i++){
            
        if(arr[i]-1==last){
            count++;
            last=arr[i];
        }
        else if(arr[i]!=last){
            count=1;
            last=arr[i];
        }
        longest=Math.max(longest,count);
        }

        System.out.println(longest);
    }
}
