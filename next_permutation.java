public class next_permutation {
    public static void main(String[] args) {
        int arr[]={3,1,2};
        int sortindex=0;
        int i,index=-1;
        int n=arr.length;
        for(i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;          //finding the break point index
                break;
            }
        }
        if(index==-1){
            for(i=n-1;i>=0;i--){           //get the reverse of the array since no breakpoint
                System.out.print(arr[i]+" ");
                
            }
            
        }
if(index!=-1){
        for(i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];          //get the smallest among the numbers and swap with the index
                arr[i]=arr[index];
                arr[index]=temp;
                sortindex=index+1;       //get the position just after the index
                break;
            }
        }}
        int k;
        for(i=sortindex;i<arr.length;i++){
            for(int j=sortindex;j<arr.length;j++){
                if(arr[i]<arr[j]){
                k=arr[i];                //sortng the further array present to get the smallest number
                arr[i]=arr[j];
                arr[j]=k;

                }
            }
        }
        
if(index!=-1){
        for(i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
    }
}}
