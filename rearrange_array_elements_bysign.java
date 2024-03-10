public class rearrange_array_elements_bysign {
    public static void main(String[] args) {
        int arr[]={1,2,-3,-1,-2,3};
        int k=0,j=0;
        int rearranged[]=new int[100];
        int positive[]=new int[arr.length];
        int negative[]=new int[arr.length];
        int possize=0,negsize=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative[negsize]=arr[i];
                negsize++;
            }
            else{
                positive[possize]=arr[i];
                possize++;
            }
        }
        
        while(possize>0){
            rearranged[k]=positive[j];
            j++;
            k+=2;
            possize--;

        }
        int s=1,a=0;
        while(negsize>0){
            rearranged[s]=negative[a];
            a++;
            s+=2;
            negsize--;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(rearranged[i]+", ");
        }
    }
}
