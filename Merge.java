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
    if(data.length<x){
      insertionsort(data);
    }
    else{
    mergesort(data, 0, data.length);
  }
  }
  public static void mergesort(int[] data, int lo, int hi){
    int check=lo+1;
    if(check>= hi) {
       return;
     }

     int mid=(hi-2)/2+lo;

     //Creating subarrays
     int[] lohalf = Arrays.copyOfRange(data, lo, (hi - lo)/2);
     int[] hihalf = Arrays.copyOfRange(data,(hi - lo)/2, hi);

     //int[] lohalf = Arrays.copyOfRange(data, lo, mid);
     //int[] hihalf = Arrays.copyOfRange(data,mid+1, hi);

     //mergesort on each sub array
     mergesort(lohalf, 0, lohalf.length);
     mergesort(hihalf, 0, hihalf.length);
     //System.out.println("HI");

     int l = 0;
	   int r = 0;
	   int i = 0;


     //System.out.print("Low Half:");
     System.out.println(Arrays.toString(data));
     //System.out.print("High Half:");
     //System.out.println(Arrays.toString(hihalf));
     //while neither has finished merging
	   while(l<lohalf.length && r<hihalf.length && i<data.length){
       //if lohalf one is bigger, put that in for data and incriment
       if(lohalf[l]<=hihalf[r]){
         data[i]=lohalf[l];

         l++;
         i++;
       }
       //if hihalf one is bigger, put that in for data and incriment
       //if(l<lohalf.length && r<hihalf.length && i<data.length && lohalf[l]>hihalf[r]){
       else{
         data[i]=hihalf[r];
         r++;
         i++;
       }
     }
     //once one of them has fully merged, if upperhalf still isnt merged, merge everything
     while(r<hihalf.length && i<data.length){
       data[i]=hihalf[r];
       r++;
       i++;
     }
     //if lower half is not fully merged, merge everything
     while(l<hihalf.length && i<data.length){
       data[i] = hihalf[l];
       l++;
       i++;
     }

	}





}
