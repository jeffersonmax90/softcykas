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

public class Lista_reproduccion_BDCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final StringExpression nombre;
	public final CollectionExpression video;
	
	public Lista_reproduccion_BDCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		usuarioId = new IntegerExpression("usuario.", this);
		usuario = new AssociationExpression("usuario", this);
		nombre = new StringExpression("nombre", this);
		video = new CollectionExpression("ORM_video", this);
	}
	
	public Lista_reproduccion_BDCriteria(PersistentSession session) {
		this(session.createCriteria(Lista_reproduccion_BD.class));
	}
	
	public Lista_reproduccion_BDCriteria() throws PersistentException {
		this(ProyectoSoftCykasPersistentManager.instance().getSession());
	}
	
	public Usuario_Registrado_BDCriteria createUsuarioCriteria() {
		return new Usuario_Registrado_BDCriteria(createCriteria("usuario"));
	}
	
	public Video_BDCriteria createVideoCriteria() {
		return new Video_BDCriteria(createCriteria("ORM_video"));
	}
	
	public Lista_reproduccion_BD uniqueLista_reproduccion_BD() {
		return (Lista_reproduccion_BD) super.uniqueResult();
	}
	
	public Lista_reproduccion_BD[] listLista_reproduccion_BD() {
		java.util.List list = super.list();
		return (Lista_reproduccion_BD[]) list.toArray(new Lista_reproduccion_BD[list.size()]);
	}
}

