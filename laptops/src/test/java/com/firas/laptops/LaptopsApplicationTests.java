package com.firas.laptops;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.firas.laptops.entities.Laptop;
import com.firas.laptops.repo.LaptopRepository;

@SpringBootTest
class LaptopsApplicationTests {
	@Autowired
	private LaptopRepository laptopRepository;
	@Test
	public void testCreateProduit() {
	Laptop lap = new Laptop("PC Toshiba",1000.300,new Date());
	laptopRepository.save(lap);
	}
	 @Test
	 public void testFindLaptop()
	 {
	 Laptop l = laptopRepository.findById(1L).get();
	 System.out.println(l);
	 }
	 @Test
	 public void testDeleteLaptop()
	 {
		 laptopRepository.deleteById(1L);;
	 }

	 @Test
	 public void testListerTousLaptops()
	 {
		 List<Laptop> laps = laptopRepository.findAll();
		 for (Laptop l : laps)
		 	{
			 System.out.println(l);
		 	}
	 }
}
