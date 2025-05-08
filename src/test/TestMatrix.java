package test;

import domain.Matrix;

public class TestMatrix{
    public static void main(String[] args){
        Matrix m = new Matrix(3, 5);
        System.out.println(m.matrixToString());
    }
}