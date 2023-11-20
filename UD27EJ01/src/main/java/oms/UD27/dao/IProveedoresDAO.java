package oms.UD27.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.UD27.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, String>{
	
}
