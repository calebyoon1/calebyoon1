/** 
 * Author: Caleb Yoon <calebyoon1@gmail.com>
 * Date: March 1, 2016
 * 
 *	Application ArrayStats
 *	This programs will make  random 300 numbers between 0 and 100
 *	and sort these 300 numbers and make use of separate array to count 
 *	the simple statistic of how many numbers were between five categories
 *	1~20, 21~40, 41~50, 61~80, 81~100. Print out the sorted array of numbers,
 *	and simple bar graph of above five categories.
 */
import java.util.Arrays;
import java.util.Random;

public class hw3 {
	
	//Instance Variables
	
	private static int sortedNumbers[] = new int[301];
	private static int numOne = 1;
	
	/*This will generates 300 random numbers from 1~100. After 
	 * generating it will put them in an array then sorts them
	 * and prints them out.
	 */
	
	public static void randomOnetoHundredSorted() {

		int startNum = 1;
		int maxNum = 100;
		int minNum = 1;
		
		Random randomGen = new Random();
		
		for (startNum = 1; startNum < sortedNumbers.length; startNum++)
		{
			sortedNumbers[startNum] = randomGen.nextInt(maxNum - minNum) + minNum;
		}
		Arrays.sort(sortedNumbers);
		System.out.println(Arrays.toString(sortedNumbers));
	}
	
	/*This method will counts number within the array if they are 
	 * with in range 1~20 and prints stars * accordance to that number
	 */
	
	public static void countNumbersOnetoTwenty() {
		int counterOne = 0;
		int numStart = 1;
		int numTwenty = 20;
		for(numOne = 1; numOne <sortedNumbers.length; numOne ++)
		{
			if (sortedNumbers[numOne] <= numTwenty && sortedNumbers[numOne] >= numStart)
			{
				counterOne ++;	
			}
		}
		System.out.print(" 1 - 20: ");
		
		int counterValue = counterOne;
		
		while(counterOne >0)
		{
			char myStars = '*';
			System.out.print(myStars);
			counterOne--;
		}
		System.out.print(" " + counterValue);
	}
	
	/*This method will counts number within the Array if they are
	 * with in range 21~40 and prints stars * accordance to that number
	 */
	
	public static void countNumbersTwentyonetoForty() {
		int counterTwo = 0;
		int numTwentyone = 21;
		int numForty = 40;
		for(numOne = 1; numOne <sortedNumbers.length; numOne ++)
		{
			if (sortedNumbers[numOne] <= numForty && sortedNumbers[numOne] >= numTwentyone)
			{
				counterTwo ++;	
			}
		}
		System.out.print(" 21 - 40: ");
		
		int CounterTwoValue = counterTwo;
		
		while(counterTwo >0)
		{
			char myStars = '*';
			System.out.print(myStars);
			counterTwo--;
		}
		System.out.print(" " + CounterTwoValue);
	}
	
	/*This method will counts number within the Array if they are
	 * with in range 41~60 and prints stars * accordance to that number
	 */
	
	public static void countNumbersFortyonetoSixty() {
		int counterThree = 0;
		int numFortyone = 41;
		int numSixty = 60;
		for(numOne = 1; numOne <sortedNumbers.length; numOne ++)
		{
			if (sortedNumbers[numOne] <= numSixty && sortedNumbers[numOne] >= numFortyone)
			{
				counterThree ++;	
			}
		}
		System.out.print(" 41 - 60: ");
		
		int CounterThreeValue = counterThree;
		
		while(counterThree >0)
		{
			char myStars = '*';
			System.out.print(myStars);
			counterThree--;
		}
		System.out.print(" " + CounterThreeValue);
	}
	
	/*This method will counts number within the Array if they are
	 * with in range 61~80 and prints stars * accordance to that number
	 */
	
	public static void countNumbersSixtyonetoEighty() {
		int counterFour = 0;
		int numSixtyone = 61;
		int numEighty = 80;
		for(numOne = 1; numOne <sortedNumbers.length; numOne ++)
		{
			if (sortedNumbers[numOne] <= numEighty && sortedNumbers[numOne] >= numSixtyone)
			{
				counterFour ++;	
			}
		}
		System.out.print(" 61 - 80: ");
		
		int CounterFourValue = counterFour;
		
		while(counterFour >0)
		{
			char myStars = '*';
			System.out.print(myStars);
			counterFour--;
		}
		System.out.print(" " + CounterFourValue);
	}
	
	/*This method will counts number within the Array if they are
	 * with in range 81~100 and prints stars * accordance to that number
	 */
	
	public static void countNumbersEightyonetoHundred() {
		int counterFive = 0;
		int numEightyone = 81;
		int numHundred = 100;
		for(numOne = 1; numOne <sortedNumbers.length; numOne ++)
		{
			if (sortedNumbers[numOne] <= numHundred && sortedNumbers[numOne] >= numEightyone)
			{
				counterFive ++;	
			}
		}
		System.out.print(" 81 - 100: ");
		
		int CounterFiveValue = counterFive;
		
		while(counterFive >0)
		{
			char myStars = '*';
			System.out.print(myStars);
			counterFive--;
		}
		System.out.print(" " + CounterFiveValue);
	}
	//Main method that invokes all methods
	
	public static void main(String args[]) {
		randomOnetoHundredSorted();
		countNumbersOnetoTwenty(); 
		System.out.println();
		countNumbersTwentyonetoForty();
		System.out.println();
		countNumbersFortyonetoSixty();
		System.out.println();
		countNumbersSixtyonetoEighty();
		System.out.println();
		countNumbersEightyonetoHundred();
	}
}