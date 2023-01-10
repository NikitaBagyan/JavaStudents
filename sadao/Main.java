package sadao;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Matrix matrix = new Matrix(3, 2);

        System.out.println(matrix.getH());
        System.out.println(matrix.getW());
        //matrix.pprint();

        Matrix n = new Matrix(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6}
                });
        n.pprint();
        matrix.sum(8);
        matrix.pprint();
        n.sum(matrix);
        n.pprint();
    }
}
