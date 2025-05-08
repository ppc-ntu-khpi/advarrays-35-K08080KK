package domain;

public class Matrix{
    private int size;
    private int startNumber;
    private int[][] matrix;

    public Matrix(int size, int startNumber){
        this.size = size;
        this.startNumber = startNumber;
        this.matrix = new int[size][size];
        fillMatrix();
    }
    
    private void fillMatrix(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = startNumber;
                startNumber++;
            }
        }
    }

    public String matrixToString(){
        StringBuilder sb = new StringBuilder();
        for(int[] row: matrix){
            for(int val: row){
                sb.append(val).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public int[][] getMatrix(){
        return matrix;
    }
}