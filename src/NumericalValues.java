import java.util.Scanner;

/**
 * Name:Cameron
 * Teacher:Mr.Hardman
 * Assignment 5, Program # 1
 * Date Last Modified: 11/22/2016
 */

/**
 * @author c.toy
 *
 */
public class NumericalValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNum =0;
		int[] values = new int[5];
		int minimum = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("\nPlease enter 5 numerical values: ");
		
		for(int i = 0; i < values.length; i++){
			System.out.print("Please enter 5 values: ");
			values[i] = userInput.nextInt();
		}
		
		minimum = values[0];
		
		int i = 0;
		if(values[i] > minimum){

			}
		
		System.out.println("The maximum value is: " + values);{
		
			
			
			
			
			}
		
		userInput.close();

	}

}
