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

public class Categoria_BDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression edad;
	public final CollectionExpression videos;
	
	public Categoria_BDDetachedCriteria() {
		super(ventanas.Categoria_BD.class, ventanas.Categoria_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		edad = new StringExpression("edad", this.getDetachedCriteria());
		videos = new CollectionExpression("ORM_videos", this.getDetachedCriteria());
	}
	
	public Categoria_BDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ventanas.Categoria_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		edad = new StringExpression("edad", this.getDetachedCriteria());
		videos = new CollectionExpression("ORM_videos", this.getDetachedCriteria());
	}
	
	public Video_BDDetachedCriteria createVideosCriteria() {
		return new Video_BDDetachedCriteria(createCriteria("ORM_videos"));
	}
	
	public Categoria_BD uniqueCategoria_BD(PersistentSession session) {
		return (Categoria_BD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Categoria_BD[] listCategoria_BD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Categoria_BD[]) list.toArray(new Categoria_BD[list.size()]);
	}
}

