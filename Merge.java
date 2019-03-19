public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesort(data, 0, data.length);
  }
  public static void mergesort(int[] data, int low, int hi){
    int check=low+1;
    if(check>= hi) {
       return;
     }
    //Creating subarrays
     int[] lohalf = Arrays.copyOfRange(data, lo, (hi - lo)/2);
     int[] hihalf = Arrays.copyOfRange(data,(hi - lo)/2, hi);
     //mergesort on each sub array
     mergesort(lohalf, 0, lohalf.length);
     mergesort(hihalf, 0, hihalf.length);


  }



}
