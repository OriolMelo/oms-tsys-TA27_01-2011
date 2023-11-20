package oms.UD27.services;

import java.util.List;

import oms.UD27.dto.Proveedores;

public interface IProveedoresService {
	//Metodos del CRUD
	public List<Proveedores> listarProveedores(); //Listar All 
	
	public Proveedores guardarProveedores(Proveedores proveedores);	//Guarda un proveedor CREATE
	
	public Proveedores proveedoresXID(String id); //Leer datos de un proveedor READ
	
	public Proveedores actualizarProveedores(Proveedores proveedores); //Actualiza datos de los proveedores UPDATE
	
	public void eliminarProveedores(String id);// Elimina los proveedores DELETE
}
