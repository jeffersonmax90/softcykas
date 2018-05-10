/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Jefferson T(University of Almeria)
 * License Type: Academic
 */
package ventanas;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Comentario_BDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression videoId;
	public final AssociationExpression video;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final StringExpression mensaje;
	
	public Comentario_BDDetachedCriteria() {
		super(ventanas.Comentario_BD.class, ventanas.Comentario_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		videoId = new IntegerExpression("video.id", this.getDetachedCriteria());
		video = new AssociationExpression("video", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
	}
	
	public Comentario_BDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ventanas.Comentario_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		videoId = new IntegerExpression("video.id", this.getDetachedCriteria());
		video = new AssociationExpression("video", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
	}
	
	public Video_BDDetachedCriteria createVideoCriteria() {
		return new Video_BDDetachedCriteria(createCriteria("video"));
	}
	
	public Usuario_Registrado_BDDetachedCriteria createUsuarioCriteria() {
		return new Usuario_Registrado_BDDetachedCriteria(createCriteria("usuario"));
	}
	
	public Comentario_BD uniqueComentario_BD(PersistentSession session) {
		return (Comentario_BD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario_BD[] listComentario_BD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario_BD[]) list.toArray(new Comentario_BD[list.size()]);
	}
}

