import java.util.Vector;

public class Matrix {
    private float[][] components;

    public Matrix(float[][] components) {
        this.components = components;
    }

    public Matrix(LAVector[] rows) {
        components = new float[rows.length][rows[0].getSize()];
        for (int i = 0; i < components.length; i++) {
            for (int j = 0; j < rows[0].getSize(); j++) {
                components[i][j] = rows[i].getComponent(j);
            }
        }
    }

    public Matrix(int columns, int rows) {
        components = new float[rows][columns];
    }

    public Matrix(int size, float diagElement) {
        components = new float[size][size];
        for (int i = 0; i < size; i++) {
            components[i][i] = diagElement;
        }
    }

    public float[] getRows(int index) {
        return components[index];
    }

    public float[] getColumns(int index) {
        float[] column = new float[components.length];
        for (int i = 0; i < components.length; i++) {
            column[i] = components[i][index];
        }
        return column;
    }


    public LAVector multRVector(LAVector vector) {
        if (components[0].length == vector.getSize()){
            LAVector multVector = new LAVector(components.length);
            for (int i = 0; i < multVector.getSize(); i++) {
                for (int j = 0; j < components[0].length; j++) {
                    multVector.setComponent(multVector.getComponent(i)+components[i][j]*vector.getComponent(j),i);
                }

            }
            return multVector;
        } else {
            return null;
        }
    }

    public LAVector multLVector(LAVector vector) {
        if (vector.getSize() == components.length) {
            LAVector multVector = new LAVector(components[0].length);
            for (int i = 0; i < multVector.getSize(); i++) {
                for (int j = 0; j < vector.getSize(); j++) {
                    multVector.setComponent(multVector.getComponent(i)+ vector.getComponent(j)*components[j][i],i);
                }

            }
            return multVector;
        } else {
            return null;
        }
    }

    public Matrix transp() {
        Matrix transp = new Matrix(getComponents().length,getRows(0).length);
        for (int i = 0; i < transp.getComponents().length; i++) {
            for (int j = 0; j < transp.getRows(0).length; j++) {
                transp.setComponent(i,j,getComponent(j,i));
            }
        }
        return transp;
    }

    public Matrix multRMatrix(Matrix other) {
        if (getRows(0).length == other.getComponents().length) {
            Matrix mult = new Matrix(other.getRows(0).length,getComponents().length);
            for (int i = 0; i < mult.getComponents().length; i++) {
                for (int j = 0; j < mult.getRows(0).length; j++) {
                    for (int k = 0; k < getRows(0).length; k++) {
                        mult.setComponent(i,j,mult.getComponent(i,j)+getComponent(i,k)*other.getComponent(k,j));
                        System.out.println(mult.getComponent(i,j));
                    }
                }
            }
            return mult;
        } else {
            return null;
        }
    }

    public Matrix multLMatrix(Matrix other) {
        if (other.getRows(0).length == getComponents().length) {
            Matrix mult = new Matrix(getRows(0).length,other.getComponents().length);
            for (int i = 0; i < mult.getComponents().length; i++) {
                for (int j = 0; j < mult.getRows(0).length; j++) {
                    for (int k = 0; k < other.getRows(0).length; k++) {
                        mult.setComponent(i,j,mult.getComponent(i,j)+other.getComponent(i,k)*getComponent(k,j));
                        System.out.println(mult.getComponent(i,j));
                    }
                }
            }
            return mult;
        } else {
            return null;
        }
    }

    public float determinant() {
        int n = components.length;
        if (n != components[0].length) {
            return -100000;
        }
        return determinantRecursive(components);
    }

    private float determinantRecursive(float[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            float det = 0;
            for (int i = 0; i < n; i++) {
                float[][] submatrix = getSubmatrix(matrix, i, 0);
                det += (float) Math.pow(-1, i) * matrix[i][0] * determinantRecursive(submatrix);
            }
            return det;
        }
    }

    private float[][] getSubmatrix(float[][] matrix, int excludedRow, int excludedColumn) {
        int n = matrix.length;
        float[][] submatrix = new float[n - 1][n - 1];
        int subRow = 0;
        for (int i = 0; i < n; i++) {
            if (i == excludedRow) continue;
            int subCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == excludedColumn) continue;
                submatrix[subRow][subCol] = matrix[i][j];
                subCol++;
            }
            subRow++;
        }
        return submatrix;
    }



    public void setComponents(float[][] components) {
        this.components = components;
    }

    public float[][] getComponents() {
        return components;
    }

    public void setComponent(int indexrow,int indexColumn, float value) {
        components[indexrow][indexColumn] = value;
    }

    public float getComponent(int indexrow,int indexColumn) {
        return components[indexrow][indexColumn];
    }

    public String toString() {
        String print = "";
        for (int i = 0; i < components.length; i++) {
            print+="|";
            for (int j = 0; j < components[0].length; j++) {
                print += " "+components[i][j]+" ";
            }
            print+="|\n";
        }
        return print;
    }
}

