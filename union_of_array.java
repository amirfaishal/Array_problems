/**
 * union_of_array
 */
public class union_of_array {

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={2,3,4,4,5,11,12};
        
        int i,k,newsize=0,temp;
        int union[]=new int[100];
        for(i=0;i<arr1.length;i++){
            temp=0;
            for(k=0;k<arr1.length;k++){
            if(arr1[i]==union[k]){
                temp=1;
            }
            }
            if(temp==1){
                continue;
            }else{
                union[newsize]=arr1[i];
                newsize++;
            }
        }

        for(i=0;i<arr2.length;i++){
            temp=0;
            for(k=0;k<newsize;k++){
            if(arr2[i]==union[k]){
                temp=1;
            }
            }
            if(temp==1){
                continue;
            }else{
                union[newsize]=arr2[i];
                newsize++;
            }
        }


            for(  i=0;i<newsize;i++){
            
                System.out.print(union[i]+",");        //printing all the values 
            }
        }
    }
