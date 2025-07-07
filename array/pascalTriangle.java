
import java.util.*;

public class pascalTriangle {

    // another method to generate Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for (int j = 1; j < i; j++) {
                int prev = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(prev);
            }
            if (i > 0) {
                row.add(1); // har row ka last element bhi 1 hota hai (except 0th row)
            }
            result.add(row);

        }
        return result;
    }

    // public List<List<Integer>> generate(int numRows){  //  Most Efficient Method
    //     List<List<Integer>> result = new ArrayList<>();
    //     for(int i=0;i<numRows;i++){
    //         List<Integer> row = new ArrayList<>();
    //         long val =1;
    //         row.add((int) val);
    //         for(int j=1;j<=i;j++){
    //             val = val * (i-j+1)/j;
    //             row.add((int) val);
    //         }
    //         result.add(row);
    //     }
    //     return result;
    // }
    public static void main(String[] args) {
        pascalTriangle pt = new pascalTriangle();
        int numRows = 5; // Example input
        List<List<Integer>> triangle = pt.generate(numRows);

        // Print the generated Pascal's Triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
