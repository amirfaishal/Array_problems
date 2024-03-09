public class sort_array_0_1_2 {
    public static void main(String[] args) {
        int arr[]={1,0,2,1,2,0,0,1,0,1,0,2};
        int newarr[]={0,0,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                newarr[arr[i]]++;
            }
            else if(arr[i]==1){
                newarr[arr[i]]++;
            }
            else{
                newarr[arr[i]]++;
            }
        }
        for(int i=0;i<3;i++){
        while(newarr[i]>0){
            System.out.println(i);
            newarr[i]--;
        }
    }
}}
