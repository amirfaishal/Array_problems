public class spiral_matrix{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int top=0,left=0,right=3,bottom=3,i;
        

        while(top<=bottom && left<=right){
            for(i=left;i<=right;i++){
                System.err.print(arr[top][i]+", ");
            }
            top++;
            for(i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+", ");
            }
            right--;
            if(top<=bottom){
                for(i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]+", ");
                }
                bottom--;
            }
            
            if(left<=right){
                for(i=bottom;i>=top;i--)
                {
                    System.out.print(arr[i][left]+", ");
                }
                left++;
            }
         }

    }
}