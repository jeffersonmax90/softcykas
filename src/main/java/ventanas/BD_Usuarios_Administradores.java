package ventanas;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Administrador_BD;

public class BD_Usuarios_Administradores {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Administrador_BD> _administradores = new Vector<Administrador_BD>();

	public Usuario_BD inicarSesion(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}
	
	public boolean cambiarImagenAdministrador(int aId, String aRuta) throws PersistentException {
		boolean cambiado= false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {		
			Usuario_BD usu=Usuario_BDDAO.loadUsuario_BDByORMID(aId);
				usu.setMiniatura(aRuta);				
				Usuario_BDDAO.save(usu);
				t.commit();
				cambiado= true;			
			
			} catch (Exception e) {
				t.rollback();
			}
			return cambiado;		
	}

	public Usuario_BD cargarImagenAdministardor(int aId) throws PersistentException {
		Usuario_BD usu=null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			usu=Usuario_BDDAO.getUsuario_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}		
		return usu;		
	}

	
}