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

     //while neither has finished merging
	   while(l<lohalf.length && r<hihalf.length && i<data.length){
       //if lohalf one is bigger, put that in for data and incriment
       if(lohalf[l]<=hihalf[r){
         data[i]=lohalf[l];
         l++;
         i++;
       }
       //if hihalf one is bigger, put that in for data and incriment
       if(l<lohalf.length && r<hihalf.length && i<data.length && lohalf[l]>hihalf[r]){
         data[i]=hihalf[r];
         r++;
         i++;
       }
     }
     //once one of them has fully merged, if upperhalf still isnt merged, merge everything
     while(r<hihalf.length && i<data.length){
       data[i]=hihalfr];
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
