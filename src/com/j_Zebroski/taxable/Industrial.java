package com.j_Zebroski.taxable;
import com.j_Zebroski.buildings.Building;

/**
 * Creates Industrial Building extends Building
 */
public class Industrial extends Building {
	/**
	 * @param CAPACITY
	 * @param COST
	 * @param PAYS_TAXES
	 */
	public static final int CAPACITY=325;
	private static final int COST = 200;
	private static final boolean PAY_TAXES=true;
	
	public Industrial() {
		super(COST,"Industrial", CAPACITY,PAY_TAXES);
	}
}
