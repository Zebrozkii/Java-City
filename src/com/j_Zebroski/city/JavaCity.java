
package com.j_Zebroski.city;
import java.util.Scanner;

import com.j_Zebroski.buildings.Utility;
import com.j_Zebroski.publicService.Education;
import com.j_Zebroski.taxable.Commercial;
import com.j_Zebroski.taxable.Industrial;
import com.j_Zebroski.taxable.Residential;

public class JavaCity {
	/**
	 * 
	 * @author Jimmy Zebroski
	 */
	/**
	 * This  is the main method for for building our objects
	 * and outputs the city object which is holding all our buildings
	 * We require the user to enter numbers based off the type of buildings
	 * they wish to add to there city.
	 * We create a new city for each start of the program and the user enters numbers between
	 * 1 and 4 which provided different options.
	 * @param args
	 * @return city
	 * */
	public static void main(String[] args) {
		System.out.println("---Lets Build------");
		City city = new City();
		
		Scanner sc = new Scanner(System.in);
		
		String play="";
		
		String newLine = System.lineSeparator();
		String option = new StringBuilder()
		.append("Choose an option").append(newLine)
		.append("Build Utility:1").append(newLine)
		.append("Build Residential:2").append(newLine)
		.append("Build Business: 3").append(newLine)
		.append("Build Industrial:4").append(newLine)
		.append("Build Education: 5:").append(newLine)
		.append("Collect Taxes: 6:").append(newLine)
		.append("Quit Game: 7").append(newLine).toString();
		
		/**
		 * This switch statement handles the pricing and tracking of our buildings
		 * in the city. We pay for new buildings and it keeps the game going until the number
		 * 7 is input by the user
		 * @param continuePlay
		 */

		boolean continuePlay=true;
		while(continuePlay) {
			System.out.println(option);
			play=sc.nextLine().toLowerCase();
			switch(play) {
			case"1":
				city.purchase(new Utility());
					break;
			case"2":
				city.purchase(new Residential());
				break;
			case"3":
				city.purchase(new Commercial());
				break;
			case"4":
				city.purchase(new Industrial());
				break;
			case"5":
				city.purchase(new Education());
				break;
			case"6":
				break;
			case"7":
				continuePlay=false;
				break;
			default:
				System.out.println("Please Enter a correct input");
			}
		System.out.println(city);
		city.collectTaxes();
		city.payOperatingCosts();
		}
		System.out.println("Thanks for playing. This is your city");
		System.out.println(city);
		sc.close();
	}

}
