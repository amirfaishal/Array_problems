public class max_consecutive_ones {
    public static void main(String[] args) {
        int count=0;
        int arr[]={1,0,1,0,1,0,1,1,1,1,1,0,0,1};
        int max[]=new int[100];
        int newsize=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==1){
                count++;
                
            } else{
            max[newsize]=count;
            newsize++;
            count=0;
            }
            if(i==arr.length-1){
                max[newsize]=count;
            newsize++;
            }
        }

        int maximum=max[0]; 
        for (int i=0;i<newsize;i++){      //find the max element of the array
            if(max[i]>maximum){   //condition to check for max
                maximum=max[i];
                
            }
        }
        System.out.println("The max consecutive ones is "+ maximum);
    }
}
