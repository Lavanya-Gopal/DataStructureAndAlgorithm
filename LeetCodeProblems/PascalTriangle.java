package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String args[]) {
        List<List<Integer>> pascal = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if (j == 0|| j == i) {
                    list.add(1);
                } else {
                   List<Integer> prev = pascal.get(i-1);
                   list.add(prev.get(j-1)+prev.get(j));
                }
                // list.contains(list)
                // if(list.size()>1){
                // int prev = list.get(j-1)+j;
                // list.add(prev);

                // }

            }
            pascal.add(list);

        }
        System.out.println(pascal);

    }

}
