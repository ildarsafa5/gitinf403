import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(new float[][] {{2,5,3},{1,-2,-1},{1,3,4}});
        System.out.println(matrix);
        LAVector vector = new LAVector(new float[] {4,3,2});
        float multvector = vector.mulltVector(new LAVector(new float[] {1,2}));
        System.out.println(multvector);
        System.out.println();
        System.out.println(vector);
        System.out.println();
        Matrix transp = matrix.transp();
        System.out.println(transp);
        System.out.println();
        LAVector multR = matrix.multRVector(vector);
        System.out.println(multR);
        System.out.println();
        LAVector multL = matrix.multLVector(vector);
        System.out.println(multL);
        System.out.println();
        System.out.println(matrix.determinant());

    }



}
