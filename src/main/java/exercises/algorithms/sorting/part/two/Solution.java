package exercises.algorithms.sorting.part.two;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here

        //Check number by number of the input array
        for(int i=1; i<arr.size(); i++){
            for(int j=0; j<i; j++){
                if(arr.get(i) < arr.get(j)){
                    arr.add(j, arr.get(i));
                    arr.remove(i+1);
                    break;
                }
            }

            printList(arr);
        }

    }

    private static void printList(List<Integer> arr){
        for (Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        insertionSort2(n, arr);

        bufferedReader.close();
    }
}
