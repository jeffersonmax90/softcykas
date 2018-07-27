package ventanas;

import java.util.ArrayList;
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

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario) throws PersistentException {
		boolean modificado= false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();

		try {		
		Usuario_Registrado_BD usu=Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(aUsuario.getId());
		usu.setNombre(aUsuario.getNombre());		
		usu.setApellidos(usu.getApellidos());
		usu.setApodo(usu.getApodo());
		usu.setEmail(usu.getEmail());
		usu.setContraseña(usu.getContraseña());				
		usu.setMiniatura(usu.getMiniatura());	
		Usuario_Registrado_BDDAO.save(usu);
		t.commit();
		modificado= true;
		} catch (Exception e) {
			t.rollback();
		}
		return modificado;
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

	public boolean cambiarContrasena(String aContNuevas, String aContActual, String aContRepetir) throws PersistentException {
		boolean modificado= false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();

		try {		
			Usuario_Registrado_BD usu=Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(Datos_Navegante.getIdUsuario());
			
			if(usu.getContraseña().equals(aContActual)){
				usu.setContraseña(aContNuevas);				
				Usuario_Registrado_BDDAO.save(usu);
				t.commit();
				modificado= true;
			}
			
			} catch (Exception e) {
				t.rollback();
			}
			return modificado;
		
	}

	public List<Usuario_Registrado_BD> cargarlistaUsuarioRegistrados(int aId) throws PersistentException {
		List<Usuario_Registrado_BD>u= null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			u= Usuario_Registrado_BDDAO.queryUsuario_Registrado_BD(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return u;
	}

	public boolean eliminarUsuarioListaRegistrado(int aId) throws PersistentException {
		boolean correcto=false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			Usuario_Registrado_BD userbd= Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(aId);
			
		} catch (Exception e) {
			t.rollback();
		}
		return correcto;
	}

		
	public Usuario_Registrado_BD cargarModificarDatos(int aId) throws PersistentException {
		Usuario_Registrado_BD usu=null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			Usuario_Registrado_BD usuario= Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(aId);
			
			usu=Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
			t.rollback();
		}		
		return usu;		
	}
	
	public List<Usuario_Registrado_BD> buscarUsuarioListaRegistado(String aNombre) {
		List<Usuario_Registrado_BD> usuarios=new ArrayList<Usuario_Registrado_BD>();
		try {
			Usuario_Registrado_BDCriteria cat= new Usuario_Registrado_BDCriteria();
			
			cat.nombre.like("%"+ aNombre+"%");
			for (Usuario_Registrado_BD u : Usuario_Registrado_BDDAO.listUsuario_Registrado_BDByCriteria(cat)) {
				usuarios.add(u);
			}
			
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
	
		return usuarios;
	}
}