public class check_sorted {
    public static void main(String[] args) {
        int arr[]={1,2,2,5,4};
        int temp=-1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<=i;j++){
                if(arr[j+1]>=arr[i])
                {
                    temp=1;
                }
                else{
                temp=0;
                }
            }
            if(temp==0){
                break;
            }
        }
        if(temp==1){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
        
    }
}
