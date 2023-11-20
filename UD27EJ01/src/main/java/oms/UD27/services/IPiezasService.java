package oms.UD27.services;

import java.util.List;

import oms.UD27.dto.Piezas;

public interface IPiezasService {
	//Metodos del CRUD
			public List<Piezas> listarPiezas(); //Listar All 
			
			public Piezas guardarPiezas(Piezas piezas);	//Guarda una Pieza CREATE
			
			public Piezas piezasXID(int id); //Leer datos de una Pieza READ
			
			public Piezas actualizarPiezas(Piezas piezas); //Actualiza datos de las piezas UPDATE
			
			public void eliminarPiezas(int id);// Elimina las piezas DELETE
}
