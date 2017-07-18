package com.main.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if (color.equalsIgnoreCase("amber")) {
			brands.add("Amber bock");
			brands.add("Jack amber");
		}
		else {
			brands.add("Budwiser");
			brands.add("Stag");
		}
		return brands;
	}
}
