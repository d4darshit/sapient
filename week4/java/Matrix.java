package week4.java;

import java.util.Scanner;

public class Matrix {

	private int row,column;
	private Scanner sc = null;
	int matrix[][];
	
	public Matrix(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}
	
	public Matrix(Matrix m) {
		matrix = m.matrix;
	}
	
	public Matrix() {
		row = 3;
		column = 3;
		matrix = new int[row][column];
	}
	public void readMatrix() {
		System.out.println("Enter elements in row wise fashion:\n");
		sc = new Scanner(System.in);
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j] = sc.nextInt();
			}
				
		}
		sc.close();		
	}
	public void displayMatrix() {
		System.out.println("Matrix is :\n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
				
		}
	}
	public Matrix addMatrix (Matrix m) {
		if(this.row==m.row && this.column==m.column) {
		
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					this.matrix[i][j]+=m.matrix[i][j];
				}	
			}
		}
		else {
			System.out.println("Addition is not possible");
			return null;
		}
		return this;
			
	}
	public boolean checkScalar() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i!=j && matrix[i][j]==0)
					continue;
				else
					return false;
				
			}
		}
		for(int i=1;i<row;i++)
		{
			if(matrix[i][i]==matrix[0][0])
				continue;
			else
				return false;
		}
		return true;
	}
	public Matrix multiplication(Matrix m) {
		if(this.column==m.row) {
			Matrix result = new Matrix(this.row,m.column);
			for (int i = 0; i < this.row; i++) { 
	            for (int j = 0; j < m.column; j++) { 
	                for (int k = 0; k < m.row; k++) 
	                    result.matrix[i][j] += this.matrix[i][k] * m.matrix[k][j]; 
	            } 
	        }
			return result;	
		}
		else {
			System.out.println("Cannot multiply two matrix of different size");
			return null;
		}
		
	}
	
	
}
