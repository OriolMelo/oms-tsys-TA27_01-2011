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

import oms.UD27.dto.Proveedores;
import oms.UD27.services.ProveedoresServiceImpl;

@RestController
@RequestMapping("/proveedores")
public class ProveedoresController {
	@Autowired
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/all")
	public List<Proveedores> listarProveedores(){
		return proveedoresServiceImpl.listarProveedores();
	}
	
	
	@PostMapping("/add")
	public Proveedores salvarProveedores(@RequestBody Proveedores proveedores) {
		
		return proveedoresServiceImpl.guardarProveedores(proveedores);
	}
	
	
	@GetMapping("/{id}")
	public Proveedores ProveedoresXID(@PathVariable(name="id") String id) {
		
		Proveedores Proveedores_xid= new Proveedores();
		
		Proveedores_xid=proveedoresServiceImpl.proveedoresXID(id);
		
		System.out.println("Proveedores XID: "+Proveedores_xid);
		
		return Proveedores_xid;
	}
	
	@PutMapping("/{id}")
	public Proveedores actualizarProveedores(@PathVariable(name="id")String id,@RequestBody Proveedores Proveedores) {
		
		Proveedores Proveedores_seleccionado= new Proveedores();
		Proveedores Proveedores_actualizado= new Proveedores();
		
		Proveedores_seleccionado= proveedoresServiceImpl.proveedoresXID(id);
		
		Proveedores_seleccionado.setNombre(Proveedores.getNombre());
		
		Proveedores_actualizado = proveedoresServiceImpl.actualizarProveedores(Proveedores_seleccionado);
		
		System.out.println("El Proveedores actualizado es: "+ Proveedores_actualizado);
		
		return Proveedores_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarProveedores(@PathVariable(name="id")String id) {
		proveedoresServiceImpl.eliminarProveedores(id);
	}
}
