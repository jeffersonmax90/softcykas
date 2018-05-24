/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: david(University of Almeria)
 * License Type: Academic
 */
package ventanas;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Lista_reproduccion_BDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final StringExpression nombre;
	public final CollectionExpression video;
	
	public Lista_reproduccion_BDDetachedCriteria() {
		super(ventanas.Lista_reproduccion_BD.class, ventanas.Lista_reproduccion_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		video = new CollectionExpression("ORM_video", this.getDetachedCriteria());
	}
	
	public Lista_reproduccion_BDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ventanas.Lista_reproduccion_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		video = new CollectionExpression("ORM_video", this.getDetachedCriteria());
	}
	
	public Usuario_Registrado_BDDetachedCriteria createUsuarioCriteria() {
		return new Usuario_Registrado_BDDetachedCriteria(createCriteria("usuario"));
	}
	
	public Video_BDDetachedCriteria createVideoCriteria() {
		return new Video_BDDetachedCriteria(createCriteria("ORM_video"));
	}
	
	public Lista_reproduccion_BD uniqueLista_reproduccion_BD(PersistentSession session) {
		return (Lista_reproduccion_BD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lista_reproduccion_BD[] listLista_reproduccion_BD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lista_reproduccion_BD[]) list.toArray(new Lista_reproduccion_BD[list.size()]);
	}
}

