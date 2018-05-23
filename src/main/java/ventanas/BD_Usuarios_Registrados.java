package ventanas;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Usuario_Registrado_BD;
import ventanas.Usuario;
import ventanas.Usuario_registrado;
import ventanas.Usuario_registrado_listado;

public class BD_Usuarios_Registrados {
	public BD_Principal _bD_Principal;
	public Vector<Usuario_Registrado_BD> _usuarios_Registrados = new Vector<Usuario_Registrado_BD>();

	public boolean nuevoUsuario(Usuario_Registrado_BD aUsuario) throws PersistentException {
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {
			Historial_BD h= new Historial_BD();
			aUsuario.setHistorial(h);
			Usuario_Registrado_BDDAO.save(aUsuario);
			
			t.commit();
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			t.rollback();
			return false;
		}
		
		
		return true;
	}

	public void comprobarUsuario() {
		throw new UnsupportedOperationException();
	}

	public void modificarDatos(Usuario_Registrado_BD aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void dejarSeguir(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] cargarListadoSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado iniciarSesion(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void cambiarContrasena(String aContrasenanueva, String aRepetirContrasena) {
		throw new UnsupportedOperationException();
	}

	public void cambiarContrasena(String aContNuevas, String aContActual, String aContRepetir) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado_listado[] cargarlistaUsuarioRegistrados(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarUsuarioListaRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] buscarUsuarioListaRegistado(int aId) {
		throw new UnsupportedOperationException();
	}
}