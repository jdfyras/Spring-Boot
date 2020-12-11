package com.firas.laptops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firas.laptops.entities.Laptop;
import com.firas.laptops.repo.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	LaptopRepository laptoprepository;
	@Override
	public Laptop saveLaptop(Laptop l) {
		return laptoprepository.save(l);
	}

	@Override
	public Laptop updateLaptop(Laptop l) {
		return laptoprepository.save(l);
	}

	@Override
	public void deleteLaptop(Laptop l) {
		laptoprepository.delete(l);
	}

	@Override
	public void deleteLaptopById(Long id) {
		laptoprepository.deleteById(id);
	}

	@Override
	public Laptop getLaptop(Long id) {
		return laptoprepository.findById(id).get();
	}

	@Override
	public List<Laptop> getAllLaptops() {
		return laptoprepository.findAll();
	}

}
