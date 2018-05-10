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

public class Categoria_BDCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final IntegerExpression edad;
	public final CollectionExpression videos;
	
	public Categoria_BDCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		edad = new IntegerExpression("edad", this);
		videos = new CollectionExpression("ORM_videos", this);
	}
	
	public Categoria_BDCriteria(PersistentSession session) {
		this(session.createCriteria(Categoria_BD.class));
	}
	
	public Categoria_BDCriteria() throws PersistentException {
		this(ProyectoSoftCykasPersistentManager.instance().getSession());
	}
	
	public Video_BDCriteria createVideosCriteria() {
		return new Video_BDCriteria(createCriteria("ORM_videos"));
	}
	
	public Categoria_BD uniqueCategoria_BD() {
		return (Categoria_BD) super.uniqueResult();
	}
	
	public Categoria_BD[] listCategoria_BD() {
		java.util.List list = super.list();
		return (Categoria_BD[]) list.toArray(new Categoria_BD[list.size()]);
	}
}

