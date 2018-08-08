/**
 * Licensee: Jefferson T(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoSoftCykasData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {
			ventanas.Usuario_BD lventanasUsuario_BD = ventanas.Usuario_BDDAO.createUsuario_BD();
			// Initialize the properties of the persistent object here
			ventanas.Usuario_BDDAO.save(lventanasUsuario_BD);
			ventanas.Administrador_BD lventanasAdministrador_BD = ventanas.Administrador_BDDAO.createAdministrador_BD();
			// Initialize the properties of the persistent object here
			ventanas.Administrador_BDDAO.save(lventanasAdministrador_BD);
			ventanas.Usuario_Registrado_BD lventanasUsuario_Registrado_BD = ventanas.Usuario_Registrado_BDDAO.createUsuario_Registrado_BD();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : video_subido, comentarios, listas_reproduccion, me_gustas, suscrito, suscriptor, historial
			ventanas.Usuario_Registrado_BDDAO.save(lventanasUsuario_Registrado_BD);
			ventanas.Categoria_BD lventanasCategoria_BD = ventanas.Categoria_BDDAO.createCategoria_BD();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : videos
			ventanas.Categoria_BDDAO.save(lventanasCategoria_BD);
			ventanas.Video_BD lventanasVideo_BD = ventanas.Video_BDDAO.createVideo_BD();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : propietario, historial, listas_reproduccion, comentarios, comentarios_deshabilitados, categoria_BD, usuario
			ventanas.Video_BDDAO.save(lventanasVideo_BD);
			ventanas.Comentario_BD lventanasComentario_BD = ventanas.Comentario_BDDAO.createComentario_BD();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, video
			ventanas.Comentario_BDDAO.save(lventanasComentario_BD);
			ventanas.Lista_reproduccion_BD lventanasLista_reproduccion_BD = ventanas.Lista_reproduccion_BDDAO.createLista_reproduccion_BD();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : video, usuario
			ventanas.Lista_reproduccion_BDDAO.save(lventanasLista_reproduccion_BD);
			ventanas.Historial_BD lventanasHistorial_BD = ventanas.Historial_BDDAO.createHistorial_BD();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, video
			ventanas.Historial_BDDAO.save(lventanasHistorial_BD);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoSoftCykasData createProyectoSoftCykasData = new CreateProyectoSoftCykasData();
			try {
				createProyectoSoftCykasData.createTestData();
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
