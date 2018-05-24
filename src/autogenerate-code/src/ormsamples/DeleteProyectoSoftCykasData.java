/**
 * Licensee: david(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoSoftCykasData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {
			ventanas.Usuario_BD lventanasUsuario_BD = ventanas.Usuario_BDDAO.loadUsuario_BDByQuery(null, null);
			// Delete the persistent object
			ventanas.Usuario_BDDAO.delete(lventanasUsuario_BD);
			ventanas.Administrador_BD lventanasAdministrador_BD = ventanas.Administrador_BDDAO.loadAdministrador_BDByQuery(null, null);
			// Delete the persistent object
			ventanas.Administrador_BDDAO.delete(lventanasAdministrador_BD);
			ventanas.Usuario_Registrado_BD lventanasUsuario_Registrado_BD = ventanas.Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByQuery(null, null);
			// Delete the persistent object
			ventanas.Usuario_Registrado_BDDAO.delete(lventanasUsuario_Registrado_BD);
			ventanas.Categoria_BD lventanasCategoria_BD = ventanas.Categoria_BDDAO.loadCategoria_BDByQuery(null, null);
			// Delete the persistent object
			ventanas.Categoria_BDDAO.delete(lventanasCategoria_BD);
			ventanas.Video_BD lventanasVideo_BD = ventanas.Video_BDDAO.loadVideo_BDByQuery(null, null);
			// Delete the persistent object
			ventanas.Video_BDDAO.delete(lventanasVideo_BD);
			ventanas.Comentario_BD lventanasComentario_BD = ventanas.Comentario_BDDAO.loadComentario_BDByQuery(null, null);
			// Delete the persistent object
			ventanas.Comentario_BDDAO.delete(lventanasComentario_BD);
			ventanas.Lista_reproduccion_BD lventanasLista_reproduccion_BD = ventanas.Lista_reproduccion_BDDAO.loadLista_reproduccion_BDByQuery(null, null);
			// Delete the persistent object
			ventanas.Lista_reproduccion_BDDAO.delete(lventanasLista_reproduccion_BD);
			ventanas.Historial_BD lventanasHistorial_BD = ventanas.Historial_BDDAO.loadHistorial_BDByQuery(null, null);
			// Delete the persistent object
			ventanas.Historial_BDDAO.delete(lventanasHistorial_BD);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoSoftCykasData deleteProyectoSoftCykasData = new DeleteProyectoSoftCykasData();
			try {
				deleteProyectoSoftCykasData.deleteTestData();
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
