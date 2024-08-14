import java.util.Scanner;
public class Student_Grade_Calce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks in 5 subjects");

        System.out.println("Enter your marks in English");
        float mark1 = sc.nextFloat();

        System.out.println("Enter your marks in Maths");
        float mark2 = sc.nextFloat();
        
        System.out.println("Enter your marks in Hindi");
        float mark3 = sc.nextFloat();
        
        System.out.println("Enter your marks in Social Science");
        float mark4 = sc.nextFloat();
        
        System.out.println("Enter your marks in Science");
        float mark5 = sc.nextFloat();
        sc.close();
        float Total_Marks = mark1 + mark2 + mark3 + mark4 + mark5;
        
        System.out.println(" Total marks obtained are: " + Total_Marks);
        
        float avg_per = (Total_Marks) / 5;
        System.out.println("Average percentage of the total marks is : " + avg_per);

        if (avg_per >= 90) {
            System.out.println("Your Grade is A+");
        } 
        else if (avg_per >= 80 && avg_per < 90) {
            System.out.println("Your Grade is A");
        }
         else if (avg_per >= 70 && avg_per < 80) {
            System.out.println("Your Grade is B+");
        }
         else if (avg_per >= 60 && avg_per < 70) {
            System.out.println("Your Grade is C");
        }
         else if (avg_per >= 50 && avg_per < 60) {
            System.out.println("Your Grade is C+");
        }
         else if (avg_per >= 40 && avg_per < 50) {
            System.out.println("Your Grade is D+");
        }
         else if (avg_per >= 30 && avg_per < 40) {
            System.out.println("Your Grade is D");
        }
         else{
            System.out.println("Your Grade is E");
        }
    }
}
