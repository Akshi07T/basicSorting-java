public class bubbleSort {
    // public static void bubbleSorting(int arr[]){

    //     for(int i = 0; i<arr.length-1; i++){
    //         for(int j = 0; j<arr.length-1-i; j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }
    
    // public static void printarr(int arr[]){
    // for(int i =0; i<arr.length; i++){
    //     System.out.print(arr[i]+" ");
    // }
    // System.out.println();

    public static void sortedarray(int arr[]){
        for(int i =0; i<arr.length-1; i++){
            boolean is_sorted = false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    is_sorted = true;
                }
                                    
            }
            //no swapping happened, array is sorted
            if(is_sorted ) return;
            System.out.println(is_sorted);
        
        }
         
    }

    
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        
        sortedarray(arr);
        System.out.println("array is sorted");
        
        // bubbleSorting(arr);
        // printarr(arr);

    }
}
