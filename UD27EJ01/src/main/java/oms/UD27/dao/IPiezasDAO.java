package oms.UD27.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.UD27.dto.Piezas;

public interface IPiezasDAO extends JpaRepository<Piezas, Integer>{
	
}
