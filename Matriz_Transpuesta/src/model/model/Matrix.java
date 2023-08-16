package model;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
    private List<List<Integer>> matrix;

    public Matrix(List<List<Integer>> data) {
        this.matrix = data;
    }

    public List<List<Integer>> getMatrix() {
        return matrix;
    }

    public List<List<Integer>> calculateTranspose() {
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        List<List<Integer>> transpose = new ArrayList<>();

        for (int j = 0; j < cols; j++) {
            List<Integer> column = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                column.add(matrix.get(i).get(j));
            }
            transpose.add(column);
        }

        return transpose;
    }
}