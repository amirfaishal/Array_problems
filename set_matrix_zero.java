public class set_matrix_zero {
    public static void main(String[] args) {
        int [][]arr={{1,1,1},{1,1,1},{1,1,0}};
        int row=3,col=3,i,j,k,l,temp=0,valuei=0,valuej=0;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(arr[i][j]==0){
                   valuei=i;
                   valuej=j;
                    temp=1;
                    break;
                }
                
            }
            if(temp==1){
                break;
            }
        }
        if(temp==1){
            for(k=0;k<col;k++){
                arr[valuei][k]=0;
            }
            for(l=0;l<row;l++){
                arr[l][valuej]=0;
            }
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr[i][j]);
    }
    System.out.println();}
}}
