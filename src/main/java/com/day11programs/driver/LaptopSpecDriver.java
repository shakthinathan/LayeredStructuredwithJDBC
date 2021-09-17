package com.day11programs.driver;

import java.util.List;

import com.day11programs.dao.LaptopSpecDAO;
import com.day11programs.dao.LaptopSpecDAOImpl;
import com.day11programs.dto.LaptopSpec;
import com.day11programs.service.LaptopSpecService;
import com.day11programs.service.LaptopSpecServiceImpl;

public class LaptopSpecDriver {

	public static void main(String args[])
	{
		LaptopSpecDAO specdao=new LaptopSpecDAOImpl();
		LaptopSpecService specservice=new LaptopSpecServiceImpl(specdao);
		
		List<LaptopSpec>laptoplist=specservice.getLaptopSpecs();
		System.out.println("Back with Laptop list: "+ laptoplist.size());
		for(LaptopSpec lap:laptoplist)
		{
			System.out.println(lap);
		}
		//specservice.insertLaptopSpecWithValues();
		laptoplist=specservice.getLaptopSpecs1();
		for(LaptopSpec lap1:laptoplist)
		{
			System.out.println(lap1);
		}
//		laptoplist=specservice.updateLaptopSpec();
//		for(LaptopSpec lap2:laptoplist)
//		{
//			System.out.println(lap2);
//		}
		laptoplist=specservice.deleteLaptopSpec();
		
		
	}
}
