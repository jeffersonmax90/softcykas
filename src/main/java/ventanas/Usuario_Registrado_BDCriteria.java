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

public class Usuario_Registrado_BDCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression apodo;
	public final StringExpression contraseña;
	public final StringExpression miniatura;
	public final StringExpression email;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final DateExpression fecha_nacimiento;
	public final IntegerExpression n_visitas;
	public final CollectionExpression suscriptor;
	public final CollectionExpression historial;
	public final CollectionExpression suscrito;
	public final CollectionExpression me_gustas;
	public final CollectionExpression listas_reproduccion;
	public final CollectionExpression comentarios;
	public final CollectionExpression video_subido;
	
	public Usuario_Registrado_BDCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		apodo = new StringExpression("apodo", this);
		contraseña = new StringExpression("contraseña", this);
		miniatura = new StringExpression("miniatura", this);
		email = new StringExpression("email", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		fecha_nacimiento = new DateExpression("fecha_nacimiento", this);
		n_visitas = new IntegerExpression("n_visitas", this);
		suscriptor = new CollectionExpression("ORM_suscriptor", this);
		historial = new CollectionExpression("ORM_historial", this);
		suscrito = new CollectionExpression("ORM_suscrito", this);
		me_gustas = new CollectionExpression("ORM_me_gustas", this);
		listas_reproduccion = new CollectionExpression("ORM_listas_reproduccion", this);
		comentarios = new CollectionExpression("ORM_comentarios", this);
		video_subido = new CollectionExpression("ORM_video_subido", this);
	}
	
	public Usuario_Registrado_BDCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_Registrado_BD.class));
	}
	
	public Usuario_Registrado_BDCriteria() throws PersistentException {
		this(ProyectoSoftCykasPersistentManager.instance().getSession());
	}
	
	public Usuario_Registrado_BDCriteria createSuscriptorCriteria() {
		return new Usuario_Registrado_BDCriteria(createCriteria("ORM_suscriptor"));
	}
	
	public Historial_BDCriteria createHistorialCriteria() {
		return new Historial_BDCriteria(createCriteria("ORM_historial"));
	}
	
	public Usuario_Registrado_BDCriteria createSuscritoCriteria() {
		return new Usuario_Registrado_BDCriteria(createCriteria("ORM_suscrito"));
	}
	
	public Video_BDCriteria createMe_gustasCriteria() {
		return new Video_BDCriteria(createCriteria("ORM_me_gustas"));
	}
	
	public Lista_reproduccion_BDCriteria createListas_reproduccionCriteria() {
		return new Lista_reproduccion_BDCriteria(createCriteria("ORM_listas_reproduccion"));
	}
	
	public Comentario_BDCriteria createComentariosCriteria() {
		return new Comentario_BDCriteria(createCriteria("ORM_comentarios"));
	}
	
	public Video_BDCriteria createVideo_subidoCriteria() {
		return new Video_BDCriteria(createCriteria("ORM_video_subido"));
	}
	
	public Usuario_Registrado_BD uniqueUsuario_Registrado_BD() {
		return (Usuario_Registrado_BD) super.uniqueResult();
	}
	
	public Usuario_Registrado_BD[] listUsuario_Registrado_BD() {
		java.util.List list = super.list();
		return (Usuario_Registrado_BD[]) list.toArray(new Usuario_Registrado_BD[list.size()]);
	}
}

