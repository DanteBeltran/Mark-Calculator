import java.text.DecimalFormat;
import java.util.Scanner;	//program uses class Scanner
	/**  This program Calculates the total mark of your class by adding everything together
	 *   Author:   Dante Beltran
	 *   CST8110 Introduction to Computer Programming
	 */
	public class MarkCalculator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// creating  an object of scanner class
			Scanner input = new Scanner (System.in);
			double number = 0;  //for lab mark
			double number2 = 0; //for test mark
			double number3 = 0; //for assignment mark
			double number4 = 0; //for midterm mark
			double number5 = 0; //for final mark
			// tells the user welcome
			System.out.println("Welcome To CST8110 Mark Calculator");
			// prompting the user to enter all there marks for the course
			
			System.out.println("Enter your Lab mark out of 10:"); 
			try {
			number = input.nextDouble();
			// the users input must be between the min and max value, if not the user will be prompted to reset the calculator
			if (number<0 | number>10) 
				{
				System.out.println("Invalid entry, please reset the calculator." );
				System.exit(0);
				}
			
			} catch (java.util.InputMismatchException e) {
				System.out.println("Invalid entry, please reset the calculator." );
				System.exit(0);
			}
			
			

		
			System.out.println("Enter your Quiz/Test mark out of 10:"); 
			number2 = input.nextDouble();
			
			if (number2<0 | number2>10)
			{
				System.out.println("Invalid entry, please reset the calculator." );
				System.exit(0);
			}
				
			
			
				System.out.println("Enter your Assignment mark out of 20:");
			try {
				number3 = input.nextDouble();
				if (number3<0 | number3>20)
				{
					System.out.println("Invalid entry, please reset the calculator." );
					System.exit(0);
				}
			
			} catch (java.util.InputMismatchException e) {
				System.out.println("Invalid entry, please reset the calculator." );
				System.exit(0);
			}
			
			
			
			System.out.println("Enter your Midterm mark out of 20:"); 
			try {
			number4 = input.nextDouble();
			if (number4<0 | number4>20)
				{
				System.out.println("Invalid entry, please reset the calculator." );
				System.exit(0);
			
				}
			
			} catch (java.util.InputMismatchException e) {
				System.out.println("Invalid entry, please reset the calculator." );
				System.exit(0);	
				
			}
		
			
			
			System.out.println("Enter your Final Exam mark out of 40:"); 
			try {
			number5 = input.nextDouble();
			if (number5<0 | number5>40)
				
				{
				System.out.println("Invalid entry, please reset the calculator." );
				System.exit(0);
				}
				
			} catch (java.util.InputMismatchException e) {
				System.out.println("Invalid entry, please reset the calculator." );
				System.exit(0);
				
			}
			
			
			
			
			
			//calculates all the marks and does the proper math
			double QuizesAndTests = number2/10*10; 
			double Midterm = number4/20*20; 
			double FinalExam = number5/40*40; 
			double Labs = number/10*10;
			double Assignments = number3/20*20;
			double TheoryGrade = QuizesAndTests+Midterm+FinalExam;
			double TheoryGradeCalculated = TheoryGrade*100/70;
			double PracticalGrade = Labs+Assignments;
			double PracticalGradeCalculated = PracticalGrade*100/30;
			double FinalGrade = QuizesAndTests+Midterm+FinalExam+Labs+Assignments;
			//sets the decimal format to 2 decimal places
			DecimalFormat form = new DecimalFormat ("#.##");
			
			//tells the user there calculated marks
			System.out.println ("Theory grade is: " + form.format (TheoryGradeCalculated)+ " %");
			System.out.println ("Practical grade is: " + form.format (PracticalGradeCalculated)+" %"); 
			System.out.println ("Final grade is: " + form.format(FinalGrade)+" %");
			//}
			
		}//end of main

	}//end of class


