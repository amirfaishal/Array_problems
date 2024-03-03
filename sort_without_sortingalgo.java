public class sort_without_sortingalgo {
    public static void main(String []args){

        // sorting the array having 3 elements without sorting algorithm
        int a[]={2,1,0};
        int sorted[]={0,0,0};
        if((a[0]<a[1])&&(a[0]>a[2])){
            sorted[0]=a[2];
            sorted[1]=a[0];
            sorted[2]=a[1];
            }
        else if((a[0]>a[1])&&(a[0]<a[2])){
        sorted[0]=a[1];
        sorted[1]=a[0];
        sorted[2]=a[2];
        }
        else if((a[0]>a[1])&&(a[0]>a[2])){
        
            sorted[2]=a[0];
            if(a[1]>a[2]){
                sorted[0]=a[2];
                sorted[1]=a[1];
            }
            else{
                sorted[0]=a[1];
                sorted[1]=a[2];
            }
            
        }
        else{
            sorted[0]=a[0];
            if(a[1]>a[2]){
                sorted[1]=a[2];
                sorted[2]=a[1];
            }
            else{
                sorted[1]=a[1];
                sorted[2]=a[2];
            }
        }

    
    for(int i=0;i<3;i++){
        System.out.println(sorted[i]);
    }
    }
}
