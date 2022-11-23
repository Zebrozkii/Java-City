package com.j_Zebroski.buildings;

public abstract class Building {
	private double buildingCost;
	private String buildingType;
	private int capacity;
	private boolean paysTaxes;
	/**
	 * 
	 * @param buildingCost
	 * @param buildingType
	 * @param capacity
	 */

	public Building(double buildingCost,String buildingType,int capacity,boolean paysTaxes) {
		this.buildingCost=buildingCost;
		this.buildingType=buildingType;
		this.capacity=capacity;
		this.paysTaxes=paysTaxes;
	}
	/**
	 * 
	 * @return the payTaxes
	 */
	public boolean isPaysTaxes() {
		return paysTaxes;
	}
	/**
	 * 
	 * @param paysTaxes the paysTaxes to set
	 */
	public void setPaysTaxes(boolean paysTaxes) {
		this.paysTaxes = paysTaxes;
	}
	/**
	 * 
	 * @return buildingCost
	 */
	public double getBuildingCost() {
		return buildingCost;
	}
	/**
	 * 
	 * @return buildingCost
	 */
	public void setBuildingCost(double buildingCost) {
		this.buildingCost = buildingCost;
	}
	/**
	 * 
	 * @return buildingType
	 */
	public String getBuildingType() {
		return buildingType;
	}
	/**
	 * 
	 * @return buildingType
	 */
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	/**
	 * 
	 * @return capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * 
	 * @return capacity
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
