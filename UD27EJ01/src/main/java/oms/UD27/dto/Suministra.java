package oms.UD27.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="suministra")
public class Suministra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id extra para tabla intermedia
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "Codigo_pieza")
    Piezas pieza;
 
    @ManyToOne
    @JoinColumn(name = "Id_proveedor")
    Proveedores proveedor;
    
    @Column(name = "Precio")//no hace falta si se llama igual
	private int precio;

    public Suministra() {
    	
    }
	
    public Suministra(int id, Piezas pieza, Proveedores proveedor, int precio) {
		super();
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Piezas getPieza() {
		return pieza;
	}

	public void setPieza(Piezas pieza) {
		this.pieza = pieza;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
    
}
