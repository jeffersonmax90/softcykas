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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Historial_BDCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression video;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public Historial_BDCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		video = new CollectionExpression("ORM_video", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
	}
	
	public Historial_BDCriteria(PersistentSession session) {
		this(session.createCriteria(Historial_BD.class));
	}
	
	public Historial_BDCriteria() throws PersistentException {
		this(ProyectoSoftCykasPersistentManager.instance().getSession());
	}
	
	public Video_BDCriteria createVideoCriteria() {
		return new Video_BDCriteria(createCriteria("ORM_video"));
	}
	
	public Usuario_Registrado_BDCriteria createUsuarioCriteria() {
		return new Usuario_Registrado_BDCriteria(createCriteria("usuario"));
	}
	
	public Historial_BD uniqueHistorial_BD() {
		return (Historial_BD) super.uniqueResult();
	}
	
	public Historial_BD[] listHistorial_BD() {
		java.util.List list = super.list();
		return (Historial_BD[]) list.toArray(new Historial_BD[list.size()]);
	}
}

