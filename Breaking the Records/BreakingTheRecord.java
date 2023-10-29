
import java.util.*;

class Result {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = 0;
        int max = 0;
        int maxRecord = scores.get(0);
        int minRecord = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maxRecord) {
                maxRecord = scores.get(i);
                max++;
            } else if (scores.get(i) < minRecord) {
                minRecord = scores.get(i);
                min++;
            }
        }

        List<Integer> res = Arrays.asList(max, min);
        return res;

    }

}

public class BreakingTheRecord {
    public static void main(String[] args) {
        // BufferedReader bufferedReader = new BufferedReader(new
        // InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // List<Integer> scores =
        // Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        // .map(Integer::parseInt)
        // .collect(toList());
        List<Integer> scores = Arrays.asList(12, 24, 10, 24, 50);
        List<Integer> result = Result.breakingRecords(scores);
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
