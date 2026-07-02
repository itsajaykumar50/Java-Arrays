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
        
    //    int arr1[]= new int[arr.length];
    //     int k=0;
    //     for(int i: arr){
    //         if(i!= 0){
    //             arr1[k]=i;
    //             k++;
    //         }
    //     }
    //     return arr1;
    //   }

    //OPTIMAL APROAch //

    int k=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
           int  temp=arr[i];
             arr[i]=arr[k];
             arr[k]=temp;
            k++;
        }
     }
      return arr;
   }
}