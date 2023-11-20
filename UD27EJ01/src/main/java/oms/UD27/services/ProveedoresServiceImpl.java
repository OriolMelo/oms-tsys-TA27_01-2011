package oms.UD27.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oms.UD27.dao.IProveedoresDAO;
import oms.UD27.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService{

	@Autowired
	IProveedoresDAO iProveedoresDAO;

	@Override
	public List<Proveedores> listarProveedores() {
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores guardarProveedores(Proveedores proveedores) {
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public Proveedores proveedoresXID(String id) {
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public Proveedores actualizarProveedores(Proveedores proveedores) {
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public void eliminarProveedores(String id) {
		iProveedoresDAO.deleteById(id);
	}
}
