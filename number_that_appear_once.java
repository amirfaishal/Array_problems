public class number_that_appear_once {
    public static void main(String []args){
        int arr[]={1,1,5,5,6};
        int element=0,count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                element=arr[i];
                break;
            }
        }
        System.out.println("The number appearing once is "+ element);
    }
}
