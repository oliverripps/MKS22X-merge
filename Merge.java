public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){


  }
  public static void mergesort(int[] data, int low, int hi){
    /*Pseudocode:
    mergesort(data,lo,hi):
    if lo >= hi :
      return
    mergesort left side
    mergesort right side
    merge*/
    //RECREATING Pseudocode
    int middle=(hi-low)/2;
    if(low>=hi){
      return;
    }
    mergesort(data,0,middle);
    mergesort(data,middle+1,data.length-1);
    
  }



}
