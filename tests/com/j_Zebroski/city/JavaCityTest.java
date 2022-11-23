package com.j_Zebroski.city;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.j_Zebroski.buildings.Building;
import com.j_Zebroski.publicService.Education;
import com.j_Zebroski.taxable.Residential;

class JavaCityTest {

	@BeforeEach
	void createCity() {
		City city=new City();
		
	}
	
	@Test
	void checkBalance() {
		City city = new City();
		double value =100;
		city.setCityBalance(value);
		Double actual = city.getCityBalance();
		assertEquals(value,actual);
	}
	@Test
	void checkDemand() {
		City city = new City();
		city.setDemands(2);
		city.setSupply(1);
		assertEquals(1,city.netNeed());
	}
	@Test
	void checkCity() {
		City city=new City();
		Building building = new Residential();
		city.purchase(building);
		assertTrue(city.getBuildings().contains(building));
	}
	@Test
	void paysOperatingCost(){
		Building building = new Education();
		double test=((Education) building).getOperatingCost();
		assertEquals(test,100);
	}

}
