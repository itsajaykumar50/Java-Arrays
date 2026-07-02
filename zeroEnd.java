public class zeroEnd {
    public static void main(String[] args) {
         
        int arr[]={1,0,5,0,0,6,4};
          int result[]= moveEnd(arr);
          for(int i:result){
            System.out.print(i+" ");
          }
    }

    public static int[] moveEnd(int arr[]){
     
        //Bruite force approach //
        
       int arr1[]= new int[arr.length];
        int k=0;
        for(int i: arr){
            if(i!= 0){
                arr1[k]=i;
                k++;
            }
        }
        return arr1;

    }
}
