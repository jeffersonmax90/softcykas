package ventanas;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Comentario_BD;

public class BD_Comentarios {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Comentario_BD> _comentarios = new Vector<Comentario_BD>();

	public boolean anadirComentario(int aId, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public boolean anadirComentarioAdmin(int aId, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public List<Comentario_BD> anadirComentarios(int aId) throws PersistentException {
		List<Comentario_BD> lista = new ArrayList<Comentario_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Comentario_BDCriteria crit = new Comentario_BDCriteria();
			crit.fecha_subida.order(false);

			for (Comentario_BD c : crit.listComentario_BD()) {
				lista.add(c);
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return lista;
	}

	public List<Comentario_BD> anadirComentariosInvitado(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Comentario_BD> anadirComentariosReg(int aId) {
		throw new UnsupportedOperationException();
	}
	
	
	
	
	
	public boolean eliminarComentario(int aId) {
		throw new UnsupportedOperationException();
	}
	

	public boolean eliminarComentarioAdmin(int aId) {
		throw new UnsupportedOperationException();
	}
}