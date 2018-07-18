package ventanas;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Categoria_BD;
import ventanas.Lista_categorias;

public class BD_Categorias {
	public BD_Principal _bD_Principal;
	public Vector<Categoria_BD> _categoria_BDs = new Vector<Categoria_BD>();
	
	public List<Categoria_BD> listarCategorias() throws PersistentException {
		List<Categoria_BD> cat=null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {
			cat = Categoria_BDDAO.queryCategoria_BD(null, null);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		return cat;
	}

	public void crearCategorias(String aNombre, String aEdad) {
		throw new UnsupportedOperationException();
	}

	public String[] cargarComboBoxEdadPermitida(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarCategorias(int aId) {
		throw new UnsupportedOperationException();
	}

	public Lista_categorias[] cargarlistaCategorias(int aId) {
		throw new UnsupportedOperationException();
	}
}