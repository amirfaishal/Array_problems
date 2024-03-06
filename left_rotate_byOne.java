public class left_rotate_byOne {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};
        int temp=arr[0];              //storing the first element
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];          //shitfing by one value towards left
        }
        arr[arr.length-1]=temp;      //setting the last element as the first element 
        
        for( int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+",");        //printing all the values 
        }
    }
}