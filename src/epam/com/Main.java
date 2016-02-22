package epam.com;

import java.util.Arrays;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {

    public static void main(String[] args) {


        int[] arr = {1,2,4,5,6,7,8,55,33,44,55,44,33};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int searchVal = 33;
        int retVal = Arrays.binarySearch(arr,searchVal);
        System.out.println("index 33 is"  + retVal);
    }
}
