package oms.UD27.services;

import java.util.List;

import oms.UD27.dto.Suministra;

public interface ISuministraService {
	//Metodos del CRUD
		public List<Suministra> listarSuministra(); //Listar All 
		
		public Suministra guardarSuministra(Suministra suministra);	//Guarda un proveedor CREATE
		
		public Suministra suministraXID(int id); //Leer datos de un proveedor READ
		
		public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos de los suministra UPDATE
		
		public void eliminarSuministra(int id);// Elimina los suministra DELETE
}
