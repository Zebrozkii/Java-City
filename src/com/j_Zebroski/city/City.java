package com.j_Zebroski.city;
import java.util.ArrayList;
import java.util.List;

import com.j_Zebroski.buildings.Building;
import com.j_Zebroski.buildings.Utility;
import com.j_Zebroski.publicService.Education;
import com.j_Zebroski.taxable.Residential;

/**
 * City Class
 * @param buildings
 * This creates the class city which stores all of our buildings we select into
 * a list
 * @returns city;
 */
public class City {
	
	private double taxRate=.07;
	private int supply;
	private int demands;
	private double cityBalance;
	private List<Building> buildings = new ArrayList<>();

	public City() {
		this.cityBalance=3000;
	}

	public List<Building> getBuildings() {
		return buildings;
	}


	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public int getSupply() {
		return supply;
	}

	public void setSupply(int supply) {
		this.supply = supply;
	}

	public int getDemands() {
		return demands;
	}

	public void setDemands(int demands) {
		this.demands = demands;
	}

	public double getCityBalance() {
		return cityBalance;
	}

	public void setCityBalance(double cityBalance) {
		this.cityBalance = cityBalance;
	}
	public int netNeed(){
		return demands-supply;
	}
	/**
	 * Purchase method
	 * @param building
	 * Check the city balance and if we have enough
	 * money to create the new building you requested,
	 * if so we add the building to the list and take the money out of the balance.
	 */
	public void purchase(Building building) {
		if(getCityBalance()-building.getBuildingCost()<0) {
			System.out.println("Not enough money for your building!" + building.getBuildingType());
			return;
		}
		cityBalance-=building.getBuildingCost();
		if(building instanceof Utility) {
			supply+=building.getCapacity();
		}else if(building instanceof Residential) {
			demands +=building.getCapacity();
		}
		buildings.add(building);
	}
	/**
	 * CollectTaxes
	 * This method collects taxes from all the taxable buildings in our
	 * city. and adds the collected taxes to the balance of the city
	 */
	public void collectTaxes(){
		double number=0;
		if(netNeed()>0) {
			number = taxRate * getSupply();
		}else {
			number = taxRate * getDemands();
		}
		this.cityBalance+=number;
	}
	
	/**
	 * payOperationCost
	 * This method is used to calculates the expenses of
	 * operating certain buildings, and subtracts that from
	 * the city balance
	 */
	public void payOperatingCosts() {
		double expenses = 0;
		for(Building building : buildings) {
			if(building instanceof Education) {
				expenses +=((Education) building).getOperatingCost();
			}
		}
		this.cityBalance -=expenses;
	}
	/**
	 * toString method
	 * creates custom string method
	 */
	public String toString() {
		String newLine = System.lineSeparator();
		StringBuilder sb = new StringBuilder();
		sb.append("City Property Taxes:").append(getTaxRate()).append(newLine);
		sb.append("Supply:").append(getSupply()).append(newLine);
		sb.append("Demand:").append(getDemands()).append(newLine);
		sb.append("Net Need:").append(netNeed()).append(newLine);
		sb.append("Balance:").append(getCityBalance()).append(newLine);
		return sb.toString();
	}
	
	
}
