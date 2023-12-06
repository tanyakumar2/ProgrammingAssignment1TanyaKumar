import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Section 1: Create variables from primary types
        System.out.println("Section1:");
        int intVar = 9;
        double doubleVar = 8.3;
        String stringVar = "Hello, World!";
        boolean boolVar = true;

        System.out.println("intVar: " + intVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("stringVar: " + stringVar);
        System.out.println("boolVar: " + boolVar + "\n");


        // Section 2: Operations with numbers
        System.out.println("Section2:");
        System.out.println("Addition: " + (intVar + doubleVar));
        System.out.println("Subtraction: " + (intVar - doubleVar));
        System.out.println("Multiplication: " + (intVar * doubleVar));
        System.out.println("Division: " + (intVar / doubleVar));
        System.out.println("Modulo: " + (intVar % 2 + "\n")); // Modulo operation with an integer variable


        // Section 3: Conditional Statements
        System.out.println("Section3:");
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("You're an adult \n");
        } else if (age > 13) {
            System.out.println("Hey, you're at least a teenager! \n");
        } else if (age > 0) {
            System.out.println("You're alive \n");
        } else {
            System.out.println("Impressive, not even born yet already using a computer \n");
        }


        // Section 4: Loops
        System.out.println("Section4:");
        System.out.println("Printing numbers 1 to 10 with a For Loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 

        // Using while loop to print numbers from 1 to 10
        System.out.println("Printing numbers 1 to 10 wit a While Loop:");
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("\n"); 


        // Section 5: Methods
        System.out.println("Section5:");
        int year = 2023;
        if (year % 4 ==0) {
            System.out.println("It's a leap year \n");
        } else {
            System.out.println("Not a leap year \n");
        }

        // Section 6: Create a class named Student
        System.out.println("Section6:");
        Student newStudent = new Student();

        int studentAge = newStudent.ages(16);
        String welcomeLetterName = newStudent.name("student");
        String teachersName = newStudent.teacherName("teacher's name");
        double gpa = newStudent.GPA(4.0);

        if (studentAge >= 18) {
            System.out.println("Senior");
        } else if (studentAge >= 15) {
            System.out.println("Junior");
        } else if (studentAge >= 12) {
            System.out.println("Sophomore");
        } else {
            System.out.println("Freshman");
        }
        
        System.out.println("Welcome, " + welcomeLetterName + ", to IA");
    }   
}

 class Student {
            // Properties
            public int ages(int x) {
                return x;
            }
            public String name(String y) {
                return y;
            }
            public String teacherName(String z) {
                return z;
            }
            public double GPA(Double b) {
                return b;
            }
 }