class maj_elemnt_occur_half{
    public static void main(String[] args) {
        int arr[]={4,4,4,4,2,1,1};
        
        int newsize=0;
        int newarr[]=new int[100];
        int i,count,temp=0;
        for(i=temp;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                count++;
                temp=j;
                }
            newarr[arr[i]]=count;
            newsize++;
            }

        }
        for (i=0;i<newsize;i++){      //find the max element of the array
            if(newarr[i]>(arr.length/2)){
                System.out.println("The majority element occuring more than half its length is "+i);
            }
        }
    
    }
}