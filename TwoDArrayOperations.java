package com.learn.java8;

public class TwoDArrayOperations {

	public static void main(String[] args) {
		
		//double array1[][] ={{4.0,5.0,6.0},{1.0,2.0,3.0}};
		TwoDArrayOperations twoArray = new TwoDArrayOperations();
		//System.out.println(twoArray.getTotal(array1));
		
		double[][] studentTestScores = { { 65.5, 54.43, 23.54, 99.5 },
				{ 33.4, 22.55, 54.66, 11.12 } };

		// Process the double array.
		System.out.println("Total : " + twoArray.getTotal(studentTestScores));
		System.out.println("Average : " + twoArray.getAverage(studentTestScores));

		System.out.println("Total of row 0 : "
				+ twoArray.getRowTotal(studentTestScores, 0));
		System.out.println("Total of row 1 : "
				+ twoArray.getRowTotal(studentTestScores, 1));

		System.out.println("Total of col 0 : "
				+ twoArray.getColTotal(studentTestScores, 0));
		System.out.println("Total of col 1 : "
				+ twoArray.getColTotal(studentTestScores, 1));

		System.out.println("Highest in row 0 : "
				+ twoArray.getHighestInRow(studentTestScores, 0));
		System.out.println("Highest in row 1 : "
				+ twoArray.getHighestInRow(studentTestScores, 1));

		System.out.println("Lowest in row 0 : "
				+ twoArray.getLowestInRow(studentTestScores, 0));
		System.out.println("Lowest in row 1 : "
				+ twoArray.getLowestInRow(studentTestScores, 1));

	}

	public double getTotal(double array1[][] ) {
		double total = 0;

		for(int i = 0; i<array1.length; i++) {
			for(int j = 0; j<array1[i].length; j++){
				total = total + array1[i][j];
			}
		}
		return total;
	}

	public  int getCount(double array1[][]) {

		int total =0;
		for(int row = 0; row<array1.length; row++) {
			total = total + array1[row].length;
		}

		return total;
	}

	public double getAverage(double[][] array) {

		return getTotal(array)/getCount(array);

	}

	public double getRowTotal(double array[][], int row) {

		double total = 0;

		for(int col=0; col<array.length; col++) {
			total = total+array[row][col];
		}
		return total;
	}

	public double getColTotal(double array[][], int col) {
		double total = 0;

		for(int row=0; row<array.length; row++){
			total = total+array[col][row];

		}
		return total;
	}

	public double getHighestInRow(double array[][], int row) {

		double highest = array[row][0];

		for(int col =1; col<array[row].length; col++) {

			if(array[row][col]>highest) {

				highest = array[row][col];
			}

		}

		return highest;
	}

	public double getLowestInRow(double array[][], int row){

		double lowest = array[row][0];

		for(int col = 1; col<array[row].length; col++) {
			if(array[row][col]>lowest){

				lowest = array[row][col];
			}
		}
		return lowest;
	}

}
