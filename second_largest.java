public class second_largest {
    public static void main(String[] args) {
        int arr[]={1,5,8,4,6,78,45,3};
        int max1;
        int max2;
        max1=arr[0];
        max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
            
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==max1){
                continue;
            }
            else{
                if(arr[j]>max2){
                    max2=arr[j];
                }
            }
        }
        System.out.println("the largest number is "+ max1);
        System.out.println("the second largest number is "+ max2);
    }
}
