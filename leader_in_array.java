public class leader_in_array {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        int leader[]=new int[arr.length];
        int i,j,newsize=0;
        for(i=0;i<arr.length;i++){
            for( j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                break;
                }
            }
            
            if(i==arr.length-1){
                break;
            }
            else if(j==arr.length){
                leader[newsize]=arr[i];
                newsize++;
            }
            
        }
        for(i=0;i<newsize;i++){
            System.out.print(leader[i]+",");
        }
    }
}
