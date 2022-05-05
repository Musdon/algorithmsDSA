package questions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0){
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i=0; i<numRows; i++){
            List<Integer> prevRows = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j=1; j<i; j++){
                row.add(prevRows.get(j-1) + prevRows.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
