package ventanas;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Usuario_Registrado_BD;

public class BD_Usuarios_Registrados {
	public BD_Principal _unnamed_BD_Principal_;
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

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean dejarSeguir(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Usuario_BD> cargarListadoSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario_BD iniciarSesion(String aEmail, String aContrasena) throws PersistentException {
			
			PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
			Usuario_BD usuario = new  Usuario_BD();
			usuario.setTipoUsuario("incorrecto");
			
			try {
				//Usuario_BD u = Usuario_BDDAO.loadUsuario_BDByQuery("Usuario_BD.nombre_usuario='"+aNombre_usuario+"' and Usuario_BD.contrasenia='"+aContrasenia+"'", null);
				for(Object usr: Usuario_BDDAO.queryUsuario_BD(null, null)) {
					Usuario_BD usu = (Usuario_BD) usr;
					if(usu.getEmail().equals(aEmail) && usu.getContraseña().equals(aContrasena)) {						
						usuario= usu;
						break;
					}
					
				}
				
				t.commit();
			}catch(Exception e) {
				t.rollback();
			}
			return usuario;
		}

	public boolean cambiarContrasena(String aContrasenanueva, String aRepetirContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarContrasena(String aContNuevas, String aContActual, String aContRepetir) {
		throw new UnsupportedOperationException();
	}

	public List<Usuario_Registrado_BD> cargarlistaUsuarioRegistrados(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarUsuarioListaRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Usuario_Registrado_BD> buscarUsuarioListaRegistado(int aId) {
		throw new UnsupportedOperationException();
	}
}