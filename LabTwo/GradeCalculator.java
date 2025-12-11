import java.util.Scanner; 
 
public class GradeCalculator { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
 
        System.out.print("Enter your exam marks: ");         int marks = input.nextInt(); 
         if (marks >= 80 && marks <= 100) {             System.out.println("Grade: A+"); 
        } else if (marks >= 70) { 
            System.out.println("Grade: A"); 
        } else if (marks >= 60) { 
            System.out.println("Grade: A-"); 
        } else if (marks >= 50) { 
            System.out.println("Grade: B"); 
        } else if (marks >= 40) { 
            System.out.println("Grade: C"); 
        } else if (marks >= 33) { 
            System.out.println("Grade: D"); 
        } else if (marks < 33 && marks >= 0) { 
            System.out.println("Grade: F"); 
        } else { 
            System.out.println("Invalid input! Marks should be between 0 and 100."); 
        } 
 
        input.close(); 
    } 
} 
} 
