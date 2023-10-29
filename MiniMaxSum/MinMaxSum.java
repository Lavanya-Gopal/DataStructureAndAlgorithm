import java.io.*;
import java.util.*;

class Result {
    public static List<Long> miniMaxSum(List<Integer> arr) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {

                if (j == i) {
                    continue;
                }
                sum += arr.get(j);

            }
            max = Math.max(max, sum);
            min = Math.min(min, sum);

        }
        List<Long> temp = Arrays.asList(max, min);
        return temp;

    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new
        // InputStreamReader(System.in));

        // List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
        // "").split(" "))
        // .map(Integer::parseInt)
        // .collect(toList());

        List<Integer> temp = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(Result.miniMaxSum(temp));

        // bufferedReader.close();
    }
}
