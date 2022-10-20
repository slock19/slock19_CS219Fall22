package ArrayExamples;

import java.util.Arrays;

public class SelectionSort {

    // Return the index of the smallest item in the array


    public static int smallest_loc(int start, int [] aoi){
        int curr_min = aoi[start];
        int small_loc = start;
        for (int i = 1+ start; i < aoi.length; i++){
            if (aoi[i] < curr_min){
                curr_min = aoi[i];
                small_loc = i;
            }
        }
        return small_loc;
    }

    public static int [] sort(int [] aoi){
        for (int i = 0; i < aoi.length; i++){
            int j = smallest_loc(i, aoi);
            int temp = aoi[i];
            aoi[i] = aoi[j];
            aoi[j] = temp;
        }
        return aoi;
    }


    public static void main(String[] args) {
        System.out.println(smallest_loc(0,new int[] {4,1,9,-1,6}) == 3);
        System.out.println(smallest_loc(4,new int[] {4,1,9,-1,6}) == 4);

        int [] aoi = {4,1,9,2,-1,6};
        System.out.println(Arrays.toString(sort(aoi)));
    }

}
