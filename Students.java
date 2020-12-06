package students;

import java.util.Scanner;

public class Students {

    //Reading the students grades
    public static void inputGrades(int[] grades) {
        //Define an object of scanner to input the grades
        Scanner input = new Scanner(System.in);
        //Create a For loop for reading the array (grades) elements sequentially
        for (int i = 0; i < grades.length; i++) {
            //Define the student number (starts from 1, not 0)
            int stNum = i + 1;
            //Prompts the user to input student grades 
            System.out.print("Enter the grade for student number (" + (stNum) + "): ");
            //Reading the grade for student
            grades[i] = input.nextInt();
        }
    }

    //Printing the students grades
    public static void printGrades(int[] grades) {

        //Create a For loop for printing the array of grades sequentially
        for (int i = 0; i < grades.length; i++) {
            //printing the array element 
            System.out.println(grades[i]);
        }
    }

    //Calculate the average of grades
    public static double averageGrades(int[] grades) {
        //Define the sum of grades(Assume that it is zero at the beginning)
        int sum = 0;
        //Create a For loop to calculate the summation
        for (int i = 0; i < grades.length; i++) {
            //Adding every grade to the summation
            sum += grades[i];
        }
        //Define the average of grades (equal to summation / number of grades)
        double average = (double) sum / grades.length;
        return average;
    }

    //Calculate the maximum of grades (Top grade)
    public static int maxGrades(int[] grades) {
        //Assume that the maximim is zero at the beginning
        int max = 0;
        //Create a For loop to calculate the maximum
        for (int i = 0; i < grades.length; i++) {
            //If the current garde is greater than the maximum
            if (grades[i] > max) //So the maximum will be the current grade
            {
                max = grades[i];
            }
        }
        return max;
    }

    //The main method
    public static void main(String[] args) {
        //Prompts the user to input the number of students
        System.out.print("Enter the number of students: ");
        //Define an object of scanner to input the number of students
        Scanner input = new Scanner(System.in);
        //Define and read the number of students
        int numStudents = input.nextInt();
        //Define the list of grades (array of integers)
        int[] grades = new int[numStudents];
        //Reading the grades
        inputGrades(grades);
        System.out.println("\nThe students grades are:");
        //Printing the grades
        printGrades(grades);
        //Printing the average of grades 
        System.out.println("\nThe averege of grades is: " + averageGrades(grades));
        //Printing the top grade 
        System.out.println("\nThe top grade is: " + maxGrades(grades));
    }

}
