/**
 * Licensee: david(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoSoftCykasData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario_BD...");
		ventanas.Usuario_BD[] ventanasUsuario_BDs = ventanas.Usuario_BDDAO.listUsuario_BDByQuery(null, null);
		int length = Math.min(ventanasUsuario_BDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ventanasUsuario_BDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador_BD...");
		ventanas.Administrador_BD[] ventanasAdministrador_BDs = ventanas.Administrador_BDDAO.listAdministrador_BDByQuery(null, null);
		length = Math.min(ventanasAdministrador_BDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ventanasAdministrador_BDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_Registrado_BD...");
		ventanas.Usuario_Registrado_BD[] ventanasUsuario_Registrado_BDs = ventanas.Usuario_Registrado_BDDAO.listUsuario_Registrado_BDByQuery(null, null);
		length = Math.min(ventanasUsuario_Registrado_BDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ventanasUsuario_Registrado_BDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria_BD...");
		ventanas.Categoria_BD[] ventanasCategoria_BDs = ventanas.Categoria_BDDAO.listCategoria_BDByQuery(null, null);
		length = Math.min(ventanasCategoria_BDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ventanasCategoria_BDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Video_BD...");
		ventanas.Video_BD[] ventanasVideo_BDs = ventanas.Video_BDDAO.listVideo_BDByQuery(null, null);
		length = Math.min(ventanasVideo_BDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ventanasVideo_BDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario_BD...");
		ventanas.Comentario_BD[] ventanasComentario_BDs = ventanas.Comentario_BDDAO.listComentario_BDByQuery(null, null);
		length = Math.min(ventanasComentario_BDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ventanasComentario_BDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista_reproduccion_BD...");
		ventanas.Lista_reproduccion_BD[] ventanasLista_reproduccion_BDs = ventanas.Lista_reproduccion_BDDAO.listLista_reproduccion_BDByQuery(null, null);
		length = Math.min(ventanasLista_reproduccion_BDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ventanasLista_reproduccion_BDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Historial_BD...");
		ventanas.Historial_BD[] ventanasHistorial_BDs = ventanas.Historial_BDDAO.listHistorial_BDByQuery(null, null);
		length = Math.min(ventanasHistorial_BDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ventanasHistorial_BDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario_BD by Criteria...");
		ventanas.Usuario_BDCriteria lventanasUsuario_BDCriteria = new ventanas.Usuario_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lventanasUsuario_BDCriteria.id.eq();
		lventanasUsuario_BDCriteria.setMaxResults(ROW_COUNT);
		ventanas.Usuario_BD[] ventanasUsuario_BDs = lventanasUsuario_BDCriteria.listUsuario_BD();
		int length =ventanasUsuario_BDs== null ? 0 : Math.min(ventanasUsuario_BDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ventanasUsuario_BDs[i]);
		}
		System.out.println(length + " Usuario_BD record(s) retrieved."); 
		
		System.out.println("Listing Administrador_BD by Criteria...");
		ventanas.Administrador_BDCriteria lventanasAdministrador_BDCriteria = new ventanas.Administrador_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lventanasAdministrador_BDCriteria.id.eq();
		lventanasAdministrador_BDCriteria.setMaxResults(ROW_COUNT);
		ventanas.Administrador_BD[] ventanasAdministrador_BDs = lventanasAdministrador_BDCriteria.listAdministrador_BD();
		length =ventanasAdministrador_BDs== null ? 0 : Math.min(ventanasAdministrador_BDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ventanasAdministrador_BDs[i]);
		}
		System.out.println(length + " Administrador_BD record(s) retrieved."); 
		
		System.out.println("Listing Usuario_Registrado_BD by Criteria...");
		ventanas.Usuario_Registrado_BDCriteria lventanasUsuario_Registrado_BDCriteria = new ventanas.Usuario_Registrado_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lventanasUsuario_Registrado_BDCriteria.id.eq();
		lventanasUsuario_Registrado_BDCriteria.setMaxResults(ROW_COUNT);
		ventanas.Usuario_Registrado_BD[] ventanasUsuario_Registrado_BDs = lventanasUsuario_Registrado_BDCriteria.listUsuario_Registrado_BD();
		length =ventanasUsuario_Registrado_BDs== null ? 0 : Math.min(ventanasUsuario_Registrado_BDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ventanasUsuario_Registrado_BDs[i]);
		}
		System.out.println(length + " Usuario_Registrado_BD record(s) retrieved."); 
		
		System.out.println("Listing Categoria_BD by Criteria...");
		ventanas.Categoria_BDCriteria lventanasCategoria_BDCriteria = new ventanas.Categoria_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lventanasCategoria_BDCriteria.id.eq();
		lventanasCategoria_BDCriteria.setMaxResults(ROW_COUNT);
		ventanas.Categoria_BD[] ventanasCategoria_BDs = lventanasCategoria_BDCriteria.listCategoria_BD();
		length =ventanasCategoria_BDs== null ? 0 : Math.min(ventanasCategoria_BDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ventanasCategoria_BDs[i]);
		}
		System.out.println(length + " Categoria_BD record(s) retrieved."); 
		
		System.out.println("Listing Video_BD by Criteria...");
		ventanas.Video_BDCriteria lventanasVideo_BDCriteria = new ventanas.Video_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lventanasVideo_BDCriteria.id.eq();
		lventanasVideo_BDCriteria.setMaxResults(ROW_COUNT);
		ventanas.Video_BD[] ventanasVideo_BDs = lventanasVideo_BDCriteria.listVideo_BD();
		length =ventanasVideo_BDs== null ? 0 : Math.min(ventanasVideo_BDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ventanasVideo_BDs[i]);
		}
		System.out.println(length + " Video_BD record(s) retrieved."); 
		
		System.out.println("Listing Comentario_BD by Criteria...");
		ventanas.Comentario_BDCriteria lventanasComentario_BDCriteria = new ventanas.Comentario_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lventanasComentario_BDCriteria.id.eq();
		lventanasComentario_BDCriteria.setMaxResults(ROW_COUNT);
		ventanas.Comentario_BD[] ventanasComentario_BDs = lventanasComentario_BDCriteria.listComentario_BD();
		length =ventanasComentario_BDs== null ? 0 : Math.min(ventanasComentario_BDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ventanasComentario_BDs[i]);
		}
		System.out.println(length + " Comentario_BD record(s) retrieved."); 
		
		System.out.println("Listing Lista_reproduccion_BD by Criteria...");
		ventanas.Lista_reproduccion_BDCriteria lventanasLista_reproduccion_BDCriteria = new ventanas.Lista_reproduccion_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lventanasLista_reproduccion_BDCriteria.id.eq();
		lventanasLista_reproduccion_BDCriteria.setMaxResults(ROW_COUNT);
		ventanas.Lista_reproduccion_BD[] ventanasLista_reproduccion_BDs = lventanasLista_reproduccion_BDCriteria.listLista_reproduccion_BD();
		length =ventanasLista_reproduccion_BDs== null ? 0 : Math.min(ventanasLista_reproduccion_BDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ventanasLista_reproduccion_BDs[i]);
		}
		System.out.println(length + " Lista_reproduccion_BD record(s) retrieved."); 
		
		System.out.println("Listing Historial_BD by Criteria...");
		ventanas.Historial_BDCriteria lventanasHistorial_BDCriteria = new ventanas.Historial_BDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lventanasHistorial_BDCriteria.id.eq();
		lventanasHistorial_BDCriteria.setMaxResults(ROW_COUNT);
		ventanas.Historial_BD[] ventanasHistorial_BDs = lventanasHistorial_BDCriteria.listHistorial_BD();
		length =ventanasHistorial_BDs== null ? 0 : Math.min(ventanasHistorial_BDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ventanasHistorial_BDs[i]);
		}
		System.out.println(length + " Historial_BD record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoSoftCykasData listProyectoSoftCykasData = new ListProyectoSoftCykasData();
			try {
				listProyectoSoftCykasData.listTestData();
				//listProyectoSoftCykasData.listByCriteria();
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
