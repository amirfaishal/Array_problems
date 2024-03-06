public class move_all_zeros_oneside {
    public static void main(String[] args) {
        int arr[]={1,0,2,4,0,0,0,2,3,0,4,0,5,0};
        int numbers[]=new int[arr.length];
        int zeros[]=new int[arr.length];
        int newsize=0;
        int zerosize=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                numbers[newsize]=arr[i];
                newsize++;
            }else{
                zeros[zerosize]=arr[i];
                zerosize++;
            }
            
        }
        for( int i=0;i<newsize;i++){
            
            System.out.print(numbers[i]+",");        //printing all the values 
        }
        for( int i=0;i<zerosize;i++){
            
            System.out.print(zeros[newsize+i]+",");        //printing all the values 
        }
        
    }
}
