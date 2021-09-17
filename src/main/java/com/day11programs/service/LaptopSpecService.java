package com.day11programs.service;

import java.util.List;

import com.day11programs.dto.LaptopSpec;


public interface LaptopSpecService {

	public LaptopSpec getLaptopSpecById(int id);
	public List<LaptopSpec>getLaptopSpecs();
	public List<LaptopSpec>getLaptopSpecsBytype();
	public List<LaptopSpec> deleteLaptopSpec();
	public void insertLaptopSpecWithValues();
	public void insertLaptopSpec(LaptopSpec e);
	public List<LaptopSpec>getLaptopSpecs1();
	public List<LaptopSpec>updateLaptopSpec();
}
