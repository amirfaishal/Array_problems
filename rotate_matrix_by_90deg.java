public class rotate_matrix_by_90deg {
    public static void main(String[] args) {
        int arr[][]={
        {1,2,3},{4,5,6},{7,8,9}
        };
        int rotate[][]=new int[3][3];

        int i,j;
        for(i=0;i<3;i++){
            int temp=0;
            for(j=2;j>=0;j--){
                rotate[i][temp]=arr[j][i];
                temp++;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(rotate[i][j]);
    }
    System.out.println();}
    }
}
