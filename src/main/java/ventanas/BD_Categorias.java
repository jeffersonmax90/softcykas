package ventanas;

import java.util.Vector;
import ventanas.Categoria_BD;
import ventanas.Lista_categorias;

public class BD_Categorias {
	public BD_Principal _bD_Principal;
	public Vector<Categoria_BD> _categoria_BDs = new Vector<Categoria_BD>();

	public Categoria_BD[] listarCategorias(int aId) {
		throw new UnsupportedOperationException();
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