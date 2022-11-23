package com.j_Zebroski.buildings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class BuildingTests {

	@Test
	void testTaxes() {
		Building buildings = new Utility();
		boolean test = true;
		buildings.setPaysTaxes(test);
		assertEquals(buildings.isPaysTaxes(),test);
	}
}
