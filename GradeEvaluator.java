
import java.util.Scanner;

public class GradeEvaluator
{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in); //creating the object of the scanner class
        
    System.out.println("Enter the grade");
    double grade= sc.nextDouble();
    
    String abc= (grade >=40 ) ? "Pass " : "Fail";
    
    System.out.println(abc);
    }
}