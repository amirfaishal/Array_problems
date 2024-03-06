public class remove_duplicate {
    
    public static void main(String[]args){
        int arr[]={1,2,2,3,2,4,4,5};
        int newarr[]=new int[arr.length];
        int i,j,temp;
        int newSize = 0;
        for ( i = 0; i < arr.length; i++) {
             temp = 0; // Variable to indicate if an element is a duplicate
            for ( j = 0; j < newSize; j++) {
                if (arr[i] == newarr[j]) {
                    temp = 1; // If the element is found in newarr, set temp to 1
                    break;
                }
            }
            if (temp == 0) {
                newarr[newSize] = arr[i]; // add non-duplicate element to newarr
                newSize++; // increment the size of the new array
            }}
        
        
            

        for( i=0;i<newarr.length;i++){
            System.out.println("Unique elements are :");
            System.out.println(newarr[i]);
        }
    }
    
}
