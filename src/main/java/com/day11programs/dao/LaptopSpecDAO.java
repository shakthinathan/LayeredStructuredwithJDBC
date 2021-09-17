package com.day11programs.dao;

import java.util.List;

import com.day11programs.dto.LaptopSpec;

public interface LaptopSpecDAO {

	public LaptopSpec getLaptopSpecById(int id);
	public List<LaptopSpec>getLaptopSpecs();
	public List<LaptopSpec>getLaptopSpecsBytype();
	public List<LaptopSpec> deleteLaptopSpec();
	public void insertLaptopSpecWithValues();
	public void insertLaptopSpec(LaptopSpec e);
	public LaptopSpec findLaptopSpecById(int id);
	public List<LaptopSpec>getLaptopSpecs1();
	public List<LaptopSpec>updateLaptopSpec();
}
