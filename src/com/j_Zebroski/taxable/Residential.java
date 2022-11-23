package com.j_Zebroski.taxable;
import com.j_Zebroski.buildings.Building;

/**
 * Creates Residential Building extends Building
 */
public class Residential extends Building {
	/**
	 * @param CAPACITY
	 * @param COST
	 * @param PAYS_TAXES
	 */

	public static final int CAPACITY=325;
	private static final int COST = 200;
	private static final boolean PAY_TAXES=true;
	public Residential() {
		super(COST,"Residential", CAPACITY,PAY_TAXES);
	}
}
