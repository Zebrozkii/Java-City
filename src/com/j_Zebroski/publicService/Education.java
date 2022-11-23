package com.j_Zebroski.publicService;
import com.j_Zebroski.buildings.Building;
import com.j_Zebroski.city.CityFunctions;

/**
 * Education building extends building object
 * Implements CityFunctions
 */
public class Education extends Building implements CityFunctions {
		
	/**
	 * @param CAPACITY
	 * @param COST
	 * @param PAYS_TAXES
	 * @param OPERATING_COST
	 */
		public static final int CAPACITY = 1000;
		private static final int COST=500;
		private static final boolean PAYS_TAXES =true;
		private static final int OPERATING_COST=100;
		
		public Education() {
			super(COST,"Education",CAPACITY, PAYS_TAXES);
		}

		@Override
		public int getOperatingCost() {
			
			return OPERATING_COST;
		}
}
