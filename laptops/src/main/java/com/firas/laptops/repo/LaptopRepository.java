package com.firas.laptops.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firas.laptops.entities.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
