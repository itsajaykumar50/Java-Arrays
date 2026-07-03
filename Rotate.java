import java.util.Arrays;

public class Rotate{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        int k =3;
        rotate(arr,3);
       System.out.println(Arrays.toString(arr));
     }

     public static void rotate(int arr[],int k){

        int n = arr.length;
        
        //reverse whole array //
        reverse(arr,0,n-1);
    
        //reverse the first kth elements//
        reverse(arr,0,k-1);

        //reverse the remaining elements

        reverse(arr,k,n-1);
    }

    public static void reverse(int arr[],int n,int k){
        while(n<k){
        int temp=arr[n];
        arr[n]=arr[k];
        arr[k]=temp;
          n++;
         k--;
        }

    }

}