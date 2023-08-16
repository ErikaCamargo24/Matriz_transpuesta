import java.util.List;
import model.Matrix;
import view.View;

public class Controller {
    private Matrix model;
    private View view;

    public Controller(Matrix model, View view) {
        this.model = model;
        this.view = view;
    }

    public void calculateAndDisplayTranspose() {
        List<List<Integer>> matrix = model.getMatrix();
        List<List<Integer>> transpose = model.calculateTranspose();

        view.displayMatrix(matrix);
        System.out.println("Transposed Matrix:");
        view.displayMatrix(transpose);
    }

    public static void main(String[] args) {
        View view = new View();
        List<List<Integer>> inputData = view.readMatrixInput();
        Matrix model = new Matrix(inputData);
        Controller controller = new Controller(model, view);
        controller.calculateAndDisplayTranspose();
    }
}