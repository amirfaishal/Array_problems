public class all_neg_num_oneside {
    public static void main(String[] args) {
        int arr[]={1,-2,3,-8,2,-5,-1};
        int i,j,k,temp;
        for(k=0;k<arr.length-1;k++){
        for(i=0;i<arr.length-1;i++){
        for(j=i+1;j<=i+1;j++){
            if(arr[i]>0 && arr[j]<0){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
            else{
                continue;
            }
        }}}
                
            
        

        for( i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
            
        
    }
}
