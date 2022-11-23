package com.j_Zebroski.taxable;
import com.j_Zebroski.buildings.Building;

/**
 * Creates Commercial Building extends Building
 */
public class Commercial extends Building {
	
	/**
	 * @param CAPACITY
	 * @param COST
	 * @param PAYS_TAXES
	 */
	public static final int CAPACITY = 250;
	private static final int COST=200;
	private static final boolean PAYS_TAXES =true;
	public Commercial() {
		super(COST,"Commercial",CAPACITY, PAYS_TAXES);
	}
}
