package com.j_Zebroski.publicServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.j_Zebroski.buildings.Building;
import com.j_Zebroski.city.City;
import com.j_Zebroski.publicService.Education;

@SuppressWarnings("unused")
class EducationTest {

	@Test
	void checkOperatingCost() {
		City city = new City();
		Building edu = new Education();
		assertEquals(((Education) edu).getOperatingCost(),100);
	}

}
