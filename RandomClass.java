package JavaHomeWork;
import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create instance of Random class
		Random randomNUm = new Random();
		for ( int i = 0;i < 5;i++) {
			int Showme = randomNUm.nextInt(100)+ 1;
			System.out.print("Generated grade #" + (i + 1) + ": " + Showme + "%");
			
			//if statements 
			if (Showme >= 90) {
				System.out.print("letter grade:A");
			}else if (Showme >= 80) {
				System.out.print("letter grade:B");
			}else if (Showme >= 70) {
				System.out.print("Letter grade: C");
			}else if (Showme >= 60) {
				System.out.print("Letter grade:D");
			} else {
				System.out.print("Letter grade:F");
			}
			
			// Print empty line
			System.out.print("");
		
		
			
		}
		 
	
       
        	
        }
}
