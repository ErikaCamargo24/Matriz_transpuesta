package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public void displayMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> readMatrixInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }

        return matrix;
    }
}