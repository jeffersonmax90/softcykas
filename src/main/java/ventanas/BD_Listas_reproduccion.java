package ventanas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Lista_reproduccion_BD;

public class BD_Listas_reproduccion {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Lista_reproduccion_BD> _lista_reproduccion_BDs = new Vector<Lista_reproduccion_BD>();

	public boolean modificarListaReproducion(Lista_reproduccion_BD aLista) throws PersistentException {
		boolean modificado= false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {		
			Lista_reproduccion_BD listaReproducion=Lista_reproduccion_BDDAO.loadLista_reproduccion_BDByORMID(Datos_Navegante.getIdListaReproducion());
				listaReproducion.setNombre(aLista.getNombre());
				Lista_reproduccion_BDDAO.save(listaReproducion);
				t.commit();
				modificado= true;
			} catch (Exception e) {
				t.rollback();
			}
			return modificado;
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

	public List<Lista_reproduccion_BD> cargarListasReproduccionPropias(int aId) throws PersistentException {
		List<Lista_reproduccion_BD> lista= null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
		Usuario_Registrado_BD usuario =Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista= Arrays.asList(usuario.listas_reproduccion.toArray());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
	}

	public List<Lista_reproduccion_BD> cargarListasReproducionCaja(int aId) throws PersistentException {
		List<Lista_reproduccion_BD> lista= null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
		Usuario_Registrado_BD usuario =Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista= Arrays.asList(usuario.listas_reproduccion.toArray());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
	}
	

	public Lista_reproduccion_BD cargarNombreModificarListaReproduccion(int aId) throws PersistentException {
		Lista_reproduccion_BD lr=null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			lr=Lista_reproduccion_BDDAO.getLista_reproduccion_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
			return lr;	
	}
	
	public List<Lista_reproduccion_BD> buscarListasReproducionPropias(String aNombre) throws PersistentException {
		List<Lista_reproduccion_BD> listaReproducion=new ArrayList<Lista_reproduccion_BD>();
		//try {
		//	PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
			Lista_reproduccion_BDCriteria list= new Lista_reproduccion_BDCriteria();
			list.nombre.like("%"+ aNombre+"%");
			for (Lista_reproduccion_BD l: Lista_reproduccion_BDDAO.listLista_reproduccion_BDByCriteria(list)){
				if(l.getUsuario().getId()==Datos_Navegante.getIdUsuario()){
				listaReproducion.add(l);
				}
			}
		//} catch (PersistentException e) {
	//		e.printStackTrace();
	//	}		
		return listaReproducion;
	}
	
	public List<Lista_reproduccion_BD> cargarListasReproduccionPerfilVisitante(int aId) throws PersistentException {
		List<Lista_reproduccion_BD> lista= null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
		Usuario_Registrado_BD usuario =Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista= Arrays.asList(usuario.listas_reproduccion.toArray());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
	}
	
	public boolean eliminarListaReproduccionPropia(int aId) throws PersistentException {
		boolean correcto=false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			Lista_reproduccion_BD lista= Lista_reproduccion_BDDAO.loadLista_reproduccion_BDByORMID(aId);
			Usuario_Registrado_BD user=Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(lista.getUsuario().getId());
			user.listas_reproduccion.remove(lista);
			Usuario_Registrado_BDDAO.save(user);
			Lista_reproduccion_BDDAO.deleteAndDissociate(lista);
			correcto=true;
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		return correcto;
	}
	
	public List<Lista_reproduccion_BD> cargarListaReproduccionCajaRegistrado(int aId) throws PersistentException {
		List<Lista_reproduccion_BD> lista= null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
		Usuario_Registrado_BD usuario =Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista= Arrays.asList(usuario.listas_reproduccion.toArray());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
	}
	
}