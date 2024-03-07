import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,8,9,1,7};
        int i,element,temp=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the element to be searched: \n");
        element=obj.nextInt();
        for(i=0;i<arr.length;i++){
            if(arr[i]==element){
                temp=1;
                System.out.println("The element "+ element +" is found at "+ i+"th index");
                break;
            }
        }
        if(temp!=1){
            System.out.println("Element "+ element +" is not found ");
        }
    }
}
