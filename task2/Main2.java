package task2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 int sum = 0;

	        System.out.print("Enter the number of marks: ");
	        int numGrades = scanner.nextInt();

	        int[] grades = new int[numGrades]; // Create an array to store the grades

	        // Loop to input grades
	        for (int i = 0; i < numGrades; i++) {
	            System.out.print("Enter mark " + (i + 1) + ": ");
	            grades[i] = scanner.nextInt();
	            sum += grades[i];
	        }
	        double average = (double) sum / numGrades;
	        
	        char letterGrade;
	        if (average >= 90) {
	            letterGrade = 'A';
	        } else if (average >= 80) {
	            letterGrade = 'B';
	        } else if (average >= 70) {
	            letterGrade = 'C';
	        } else if (average >= 60) {
	            letterGrade = 'D';
	        } else {
	            letterGrade = 'F';
	        }
	        System.out.println("sum of markes: " + sum);
	        System.out.println("Average of markes: " + average);
	        System.out.println("Letter grade: " + letterGrade);
	}

}
