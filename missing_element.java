import java.util.Scanner;

public class missing_element {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,3,7,8};
        int i,element,check=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the element to be searched: \n");
        element=obj.nextInt();
        for(i=0;i<arr.length;i++){
            if(arr[i]==element){
                check=1;
            }
        }
        if(check!=0){
            System.out.println(element +" is present");
        }
        else{
            System.out.println(element + " is missing");
        }
    }
}
