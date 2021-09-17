package com.day11programs.service;

import java.util.List;

import com.day11programs.dao.LaptopSpecDAO;
import com.day11programs.dto.LaptopSpec;

public class LaptopSpecServiceImpl implements LaptopSpecService{

	LaptopSpecDAO specdao;
	public  LaptopSpecServiceImpl(LaptopSpecDAO specdao)
	{
		this.specdao=specdao;
	}
	public LaptopSpec getLaptopSpecById(int id)
	{
		LaptopSpec lap=specdao.findLaptopSpecById(id);
		return lap;
		
	}
	@Override
	public List<LaptopSpec> getLaptopSpecs() {
		// TODO Auto-generated method stub
		System.out.println("Service-Laptop specifications details");
		List<LaptopSpec>laptoplist=specdao.getLaptopSpecs();
		return laptoplist;
	}
	@Override
	public List<LaptopSpec> getLaptopSpecsBytype() {
		// TODO Auto-generated method stub
		List<LaptopSpec>laptoplist=specdao.getLaptopSpecsBytype();
		return laptoplist;
	}
	@Override
	public List<LaptopSpec> deleteLaptopSpec() {
		// TODO Auto-generated method stub
		List<LaptopSpec> lap=specdao.deleteLaptopSpec();
		return lap;
		
	}
	@Override
	public void insertLaptopSpecWithValues() {
		// TODO Auto-generated method stub
		specdao.insertLaptopSpecWithValues();
	}
	@Override
	public void insertLaptopSpec(LaptopSpec e) {
		// TODO Auto-generated method stub
		specdao.insertLaptopSpec(e);
	}
	@Override
	public List<LaptopSpec> getLaptopSpecs1() {
		// TODO Auto-generated method stub
		List<LaptopSpec>laptoplist=specdao.getLaptopSpecs1();
		return laptoplist;
	}
	@Override
	public List<LaptopSpec> updateLaptopSpec() {
		// TODO Auto-generated method stub
		List<LaptopSpec>laptoplist=specdao.updateLaptopSpec();
		return laptoplist;
	}
	
}
