package ventanas;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Categoria_BD;

public class BD_Categorias {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Categoria_BD> _categoria_BDs = new Vector<Categoria_BD>();

	public List<Categoria_BD> listarCategorias() throws PersistentException {
		List<Categoria_BD> cat=null;
			cat = Categoria_BDDAO.queryCategoria_BD(null, null);
		return cat;
	}
	
	public List<Categoria_BD> listarCategoriasModificar() throws PersistentException {
		List<Categoria_BD> cat=null;
	
			cat = Categoria_BDDAO.queryCategoria_BD(null, null);
		return cat;
	}

	public boolean crearCategorias(String aNombre, String aEdad) throws PersistentException   {
		boolean correcto= false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {
			Categoria_BD nuevaCategoria= Categoria_BDDAO.createCategoria_BD();
			nuevaCategoria.setNombre(aNombre);
			nuevaCategoria.setEdad(aEdad);
			Categoria_BDDAO.save(nuevaCategoria);
			t.commit();
			correcto=true;
		} catch (Exception e) {
			t.rollback();
		}		
		return correcto;
	}
	
	public List<Categoria_BD> cargarListadoCategorias() throws PersistentException {
		List<Categoria_BD> cat=null;
		cat = Categoria_BDDAO.queryCategoria_BD(null, null);
	return cat;
	}
	
	public boolean modificarCategoriaAdmin(int aId, Categoria_BD aCategoria) {
		throw new UnsupportedOperationException();
	}

}