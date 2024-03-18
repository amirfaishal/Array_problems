public class three_sum {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,4};
        int newarr[]=new int[100];
        int newsize=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    
                    newarr[newsize]=arr[i];
                    newarr[newsize+1]=arr[j];
                    newarr[newsize+2]=arr[k];
                    newsize+=3;
                }
                }
            }
        }
        for(int  i=0;i<newsize;i++){
            if((i)%3==0){
                System.out.println();
            }
            System.out.print(newarr[i]+",");
        }
    }
}