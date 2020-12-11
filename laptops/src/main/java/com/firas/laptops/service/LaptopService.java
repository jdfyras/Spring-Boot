package com.firas.laptops.service;

import java.util.List;

import com.firas.laptops.entities.Laptop;

public interface LaptopService {
	Laptop saveLaptop(Laptop l);
	Laptop updateLaptop(Laptop l);
	void deleteLaptop(Laptop l);
	 void deleteLaptopById(Long id);
	 Laptop getLaptop(Long id);
	List<Laptop> getAllLaptops();
}


