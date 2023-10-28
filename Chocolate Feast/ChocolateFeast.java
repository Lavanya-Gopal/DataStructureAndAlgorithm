import java.io.IOException;

class Result {

    public static int chocolateFeast(int n, int c, int m) {

        int wrapperBank = 0;

        int consumedChocolate = 0;
        int newChocolate = 0;
        consumedChocolate += Math.round(n / c);
        wrapperBank = consumedChocolate;

        consumedChocolate += Math.round(wrapperBank / m);
        newChocolate = wrapperBank / m;
        wrapperBank = wrapperBank % m;
        if (wrapperBank > 0 && newChocolate > 0) {
            consumedChocolate += (wrapperBank + newChocolate) / m;

        }
        return consumedChocolate;
    }

}

public class ChocolateFeast {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new
        // InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        // int t = Integer.parseInt(bufferedReader.readLine().trim());

        // IntStream.range(0, t).forEach(tItr -> {

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$",
        // "").split(" ");

        // int n = Integer.parseInt(firstMultipleInput[0]);

        // int c = Integer.parseInt(firstMultipleInput[1]);

        // int m = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.chocolateFeast(50255, 138, 17328);
        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

    }

    // bufferedReader.close();
    // bufferedWriter.close();
}
