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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Comentario_BDCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression videoId;
	public final AssociationExpression video;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final StringExpression mensaje;
	
	public Comentario_BDCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		videoId = new IntegerExpression("video.id", this);
		video = new AssociationExpression("video", this);
		usuarioId = new IntegerExpression("usuario.", this);
		usuario = new AssociationExpression("usuario", this);
		mensaje = new StringExpression("mensaje", this);
	}
	
	public Comentario_BDCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario_BD.class));
	}
	
	public Comentario_BDCriteria() throws PersistentException {
		this(ProyectoSoftCykasPersistentManager.instance().getSession());
	}
	
	public Video_BDCriteria createVideoCriteria() {
		return new Video_BDCriteria(createCriteria("video"));
	}
	
	public Usuario_Registrado_BDCriteria createUsuarioCriteria() {
		return new Usuario_Registrado_BDCriteria(createCriteria("usuario"));
	}
	
	public Comentario_BD uniqueComentario_BD() {
		return (Comentario_BD) super.uniqueResult();
	}
	
	public Comentario_BD[] listComentario_BD() {
		java.util.List list = super.list();
		return (Comentario_BD[]) list.toArray(new Comentario_BD[list.size()]);
	}
}

