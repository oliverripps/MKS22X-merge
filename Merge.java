import java.util.*;
import java.io.*;

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
     int l = 0;
	   int r = 0;
	   int i = 0;

	   while(l<lohalf.length && r<hihalf.length && i<data.length){
       if(lohalf[l]<=hihalf[r){
         data[i]=lohalf[l];
         l++;
         i++;
       }
       if(l<lohalf.length && r<hihalf.length && i<data.length && lohalf[l]>hihalf[r]){
         data[i]=hihalf[r];
         r++;
         i++;
       }
     }
     while(r<hihalf.length && i<data.length){
       data[i]=right[r];
       r++;
       i++;
     }


	}




}
