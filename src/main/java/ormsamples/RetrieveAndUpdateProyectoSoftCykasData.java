/**
 * Licensee: Jefferson T(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoSoftCykasData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {
			ventanas.Usuario_BD lventanasUsuario_BD = ventanas.Usuario_BDDAO.loadUsuario_BDByQuery(null, null);
			// Update the properties of the persistent object
			ventanas.Usuario_BDDAO.save(lventanasUsuario_BD);
			ventanas.Administrador_BD lventanasAdministrador_BD = ventanas.Administrador_BDDAO.loadAdministrador_BDByQuery(null, null);
			// Update the properties of the persistent object
			ventanas.Administrador_BDDAO.save(lventanasAdministrador_BD);
			ventanas.Usuario_Registrado_BD lventanasUsuario_Registrado_BD = ventanas.Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByQuery(null, null);
			// Update the properties of the persistent object
			ventanas.Usuario_Registrado_BDDAO.save(lventanasUsuario_Registrado_BD);
			ventanas.Categoria_BD lventanasCategoria_BD = ventanas.Categoria_BDDAO.loadCategoria_BDByQuery(null, null);
			// Update the properties of the persistent object
			ventanas.Categoria_BDDAO.save(lventanasCategoria_BD);
			ventanas.Video_BD lventanasVideo_BD = ventanas.Video_BDDAO.loadVideo_BDByQuery(null, null);
			// Update the properties of the persistent object
			ventanas.Video_BDDAO.save(lventanasVideo_BD);
			ventanas.Comentario_BD lventanasComentario_BD = ventanas.Comentario_BDDAO.loadComentario_BDByQuery(null, null);
			// Update the properties of the persistent object
			ventanas.Comentario_BDDAO.save(lventanasComentario_BD);
			ventanas.Lista_reproduccion_BD lventanasLista_reproduccion_BD = ventanas.Lista_reproduccion_BDDAO.loadLista_reproduccion_BDByQuery(null, null);
			// Update the properties of the persistent object
			ventanas.Lista_reproduccion_BDDAO.save(lventanasLista_reproduccion_BD);
			ventanas.Historial_BD lventanasHistorial_BD = ventanas.Historial_BDDAO.loadHistorial_BDByQuery(null, null);
			// Update the properties of the persistent object
			ventanas.Historial_BDDAO.save(lventanasHistorial_BD);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario_BD by Usuario_BDCriteria");
		ventanas.Usuario_BDCriteria lventanasUsuario_BDCriteria = new ventanas.Usuario_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lventanasUsuario_BDCriteria.id.eq();
		System.out.println(lventanasUsuario_BDCriteria.uniqueUsuario_BD());
		
		System.out.println("Retrieving Administrador_BD by Administrador_BDCriteria");
		ventanas.Administrador_BDCriteria lventanasAdministrador_BDCriteria = new ventanas.Administrador_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lventanasAdministrador_BDCriteria.id.eq();
		System.out.println(lventanasAdministrador_BDCriteria.uniqueAdministrador_BD());
		
		System.out.println("Retrieving Usuario_Registrado_BD by Usuario_Registrado_BDCriteria");
		ventanas.Usuario_Registrado_BDCriteria lventanasUsuario_Registrado_BDCriteria = new ventanas.Usuario_Registrado_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lventanasUsuario_Registrado_BDCriteria.id.eq();
		System.out.println(lventanasUsuario_Registrado_BDCriteria.uniqueUsuario_Registrado_BD());
		
		System.out.println("Retrieving Categoria_BD by Categoria_BDCriteria");
		ventanas.Categoria_BDCriteria lventanasCategoria_BDCriteria = new ventanas.Categoria_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lventanasCategoria_BDCriteria.id.eq();
		System.out.println(lventanasCategoria_BDCriteria.uniqueCategoria_BD());
		
		System.out.println("Retrieving Video_BD by Video_BDCriteria");
		ventanas.Video_BDCriteria lventanasVideo_BDCriteria = new ventanas.Video_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lventanasVideo_BDCriteria.id.eq();
		System.out.println(lventanasVideo_BDCriteria.uniqueVideo_BD());
		
		System.out.println("Retrieving Comentario_BD by Comentario_BDCriteria");
		ventanas.Comentario_BDCriteria lventanasComentario_BDCriteria = new ventanas.Comentario_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lventanasComentario_BDCriteria.id.eq();
		System.out.println(lventanasComentario_BDCriteria.uniqueComentario_BD());
		
		System.out.println("Retrieving Lista_reproduccion_BD by Lista_reproduccion_BDCriteria");
		ventanas.Lista_reproduccion_BDCriteria lventanasLista_reproduccion_BDCriteria = new ventanas.Lista_reproduccion_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lventanasLista_reproduccion_BDCriteria.id.eq();
		System.out.println(lventanasLista_reproduccion_BDCriteria.uniqueLista_reproduccion_BD());
		
		System.out.println("Retrieving Historial_BD by Historial_BDCriteria");
		ventanas.Historial_BDCriteria lventanasHistorial_BDCriteria = new ventanas.Historial_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lventanasHistorial_BDCriteria.id.eq();
		System.out.println(lventanasHistorial_BDCriteria.uniqueHistorial_BD());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoSoftCykasData retrieveAndUpdateProyectoSoftCykasData = new RetrieveAndUpdateProyectoSoftCykasData();
			try {
				retrieveAndUpdateProyectoSoftCykasData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoSoftCykasData.retrieveByCriteria();
			}
			finally {
				ventanas.ProyectoSoftCykasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
