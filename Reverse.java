public class Reverse
{
    public static void main(String[] args) {
        int  arr[] ={1,2,3,5,6,7};
        int right= arr.length-1;

        for(int i=0;i<(arr.length)/2;i++){
            int temp = arr[i];
            arr[i]=arr[right];
            arr[right]=temp;
            right--;

        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}