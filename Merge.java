import java.util.*;
import java.io.*;

public class Merge{
  public static void insertionSort(int arr[]) {
    int i, key, j;
    for (i = 1; i < arr.length; i++) {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data){
    int[] curr = new int[data.length];
    for(int i=0;i<data.length; i++){
      curr[i]=data[i];
    }

    /*if(data.length<x){
      insertionsort(data);
    }
    else{*/
    mergesort(data,curr, 0, data.length-1);
  //}
  }
  public static void mergesort(int[] data, int[] curr, int lo, int hi){
    int check=lo;
    if(check>= hi) {
       return;
     }

     int mid=lo +(hi-lo)/2;

     //Creating subarrays
     //int[] lohalf = Arrays.copyOfRange(data, lo, (hi - lo)/2);
     //int[] hihalf = Arrays.copyOfRange(data,(hi - lo)/2, hi);

     //int[] lohalf = Arrays.copyOfRange(data, lo, mid);
     //int[] hihalf = Arrays.copyOfRange(data,mid+1, hi);

     //mergesort on each sub array
     //mergesort(lohalf, 0, lohalf.length);
     //mergesort(hihalf, 0, hihalf.length);
     mergesort(curr,data, lo, mid);
     mergesort(curr,data,mid+1,hi);
     mergeFinal(data,curr,lo,mid,hi);
     //System.out.println("HI");
   }

   private static void mergeFinal(int[] data, int[] curr,int lo,int mid, int hi){

     int l = 0;
	   int r = 0;



     //System.out.print("Low Half:");
     //System.out.println(Arrays.toString(data));
     //System.out.print("High Half:");
     //System.out.println(Arrays.toString(hihalf));
     //while neither has finished merging
	   while(l<mid-lo+1 && r<hi-mid){
       int x=lo+l;
       //if lohalf one is bigger, put that in for data and incriment
       if(curr[x]<curr[mid+r+1]){
         data[x+r]=curr[x];
         l++;
       }
       //if hihalf one is bigger, put that in for data and incriment
       //if(l<lohalf.length && r<hihalf.length && i<data.length && lohalf[l]>hihalf[r]){
       else{
         data[x+r]=curr[mid+r+1];
         r++;
       }
     }
     //once one of them has fully merged, if upperhalf still isnt merged, merge everything
     while(l<mid-lo+1){
       data[lo+l+r]=curr[lo+l];
       l++;
     }
     //if lower half is not fully merged, merge everything
     while(r<hi-mid){
       data[lo+l+r] = curr[mid+r+1];
       r++;
     }

	}





}
