package exercises.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class InsertionSortPart1 {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // 2 4 6 8 3
        Integer size = arr.size();
        Integer lastValue = arr.get(size - 1);
        int i = -1;
        for (i = arr.size() - 2; i >= 0 && arr.get(i) > lastValue; i--) {
            updateArray(arr, i + 1, arr.get(i));
        }
        updateArray(arr, i + 1, lastValue);
    }

    private static void updateArray(List<Integer> arr, int position, Integer value) {
        arr.set(position, value);
        printArray(arr);
    }

    private static void printArray(List<Integer> arr) {
        for (Integer i : arr) {
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

        InsertionSortPart1.insertionSort1(n, arr);

        bufferedReader.close();
    }


}