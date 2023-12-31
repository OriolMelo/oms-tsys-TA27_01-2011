package oms.UD27.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oms.UD27.dto.Piezas;
import oms.UD27.services.PiezasServiceImpl;

@RestController
@RequestMapping("/piezas")
public class PiezasController {
	@Autowired
	PiezasServiceImpl piezasServiceImpl;
	
	@GetMapping("/all")
	public List<Piezas> listarPiezas(){
		return piezasServiceImpl.listarPiezas();
	}
	
	
	@PostMapping("/add")
	public Piezas salvarPiezas(@RequestBody Piezas piezas) {
		
		return piezasServiceImpl.guardarPiezas(piezas);
	}
	
	
	@GetMapping("/{Codigo}")
	public Piezas PiezasXID(@PathVariable(name="Codigo") int id) {
		
		Piezas Piezas_xid= new Piezas();
		
		Piezas_xid=piezasServiceImpl.piezasXID(id);
		
		System.out.println("Piezas XID: "+Piezas_xid);
		
		return Piezas_xid;
	}
	
	@PutMapping("/{Codigo}")
	public Piezas actualizarPiezas(@PathVariable(name="Codigo")int id,@RequestBody Piezas Piezas) {
		
		Piezas Piezas_seleccionado= new Piezas();
		Piezas Piezas_actualizado= new Piezas();
		
		Piezas_seleccionado= piezasServiceImpl.piezasXID(id);
		
		Piezas_seleccionado.setNombre(Piezas.getNombre());
		
		Piezas_actualizado = piezasServiceImpl.actualizarPiezas(Piezas_seleccionado);
		
		System.out.println("El Piezas actualizado es: "+ Piezas_actualizado);
		
		return Piezas_actualizado;
	}
	
	@DeleteMapping("/{Codigo}")
	public void eliminarPiezas(@PathVariable(name="Codigo")int id) {
		piezasServiceImpl.eliminarPiezas(id);
	}
}
