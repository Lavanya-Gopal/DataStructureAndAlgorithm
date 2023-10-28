import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int alice = 0;
        int bob = 0;
        for (int i = 0; i <= 2; i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (b.get(i) > a.get(i)) {
                bob++;
            }
        }
        List<Integer> res = Arrays.asList(alice, bob);
        return res;

    }

}

public class CompareTheTriplets {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new
        // InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        // List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
        // "").split(" "))
        // .map(Integer::parseInt)
        // .collect(toList());

        // List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
        // "").split(" "))
        // .map(Integer::parseInt)
        // .collect(toList());
        List<Integer> a = Arrays.asList(1, 3, 5);
        List<Integer> b = Arrays.asList(1, 3, 3);

        List<Integer> result = Result.compareTriplets(a, b);
        System.out.println(result);

        // bufferedWriter.write(
        // result.stream()
        // .map(Object::toString)
        // .collect(joining(" "))
        // + "\n"
        // );

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}