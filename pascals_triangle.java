public class pascals_triangle {
    public static void main(String[] args) {
        int i,j,value=0;
        for(i=1;i<=6;i++){
            for(j=1;j<=i;j++){
                if(i==1 || j==1){
                    value=1;
                }
                else{
                    value=value*(i-j+1)/(j-1);
                }
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
