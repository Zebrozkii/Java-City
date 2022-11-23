package com.j_Zebroski.buildings;

/**
 * Utility Building extends Building
 */
public class Utility extends Building {
	/**
	 * @param UTILITY_CAPACITY
	 * @param UTILITY_COST
	 * @param PAYS_TAXES
	 */
	private static final int CAPACITY=600;
	private static final int COST=1000;
	private static final boolean PAYS_TAXES=false;

	
	public Utility() {
		super(COST,"Utility",CAPACITY,PAYS_TAXES);
	}
}
