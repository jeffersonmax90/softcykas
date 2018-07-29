package ventanas;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Lista_reproduccion_BD;

public class BD_Listas_reproduccion {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Lista_reproduccion_BD> _lista_reproduccion_BDs = new Vector<Lista_reproduccion_BD>();

	public boolean modificarListaReproducion(Lista_reproduccion_BD aLista) {
		throw new UnsupportedOperationException();
	}

	public boolean crearLista(Lista_reproduccion_BD aLista) throws PersistentException {
		boolean correcto= false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado_BD usu= Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(Datos_Navegante.getIdUsuario());
			Lista_reproduccion_BD lista= Lista_reproduccion_BDDAO.createLista_reproduccion_BD();
			lista.setNombre(aLista.getNombre());
			lista.setORM_Usuario(usu);
			lista.setUsuario(usu);
			Lista_reproduccion_BDDAO.save(lista);
			t.commit();
			correcto= true;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			t.rollback();
			return correcto;
		}
		
		
		return correcto;
	}

	public Video_BD[] carga_lista_video_tendencia(int aId) {
		throw new UnsupportedOperationException();
	}

	public BD_Videos[] carga_lista_video_usuario_registrado(int aID) {
		throw new UnsupportedOperationException();
	}

	public List<Lista_reproduccion_BD> cargarListasReproduccionPropias(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<String> cargarJComboxAnadirLista(int aId) {
		throw new UnsupportedOperationException();
	}
}