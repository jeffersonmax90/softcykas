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

public class Usuario_Registrado_BDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression apodo;
	public final StringExpression contraseña;
	public final StringExpression miniatura;
	public final StringExpression email;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final DateExpression fecha_nacimiento;
	public final IntegerExpression n_visitas;
	public final IntegerExpression historialId;
	public final AssociationExpression historial;
	public final CollectionExpression suscriptor;
	public final CollectionExpression suscrito;
	public final CollectionExpression me_gustas;
	public final CollectionExpression listas_reproduccion;
	public final CollectionExpression comentarios;
	public final CollectionExpression video_subido;
	
	public Usuario_Registrado_BDDetachedCriteria() {
		super(ventanas.Usuario_Registrado_BD.class, ventanas.Usuario_Registrado_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		fecha_nacimiento = new DateExpression("fecha_nacimiento", this.getDetachedCriteria());
		n_visitas = new IntegerExpression("n_visitas", this.getDetachedCriteria());
		historialId = new IntegerExpression("historial.id", this.getDetachedCriteria());
		historial = new AssociationExpression("historial", this.getDetachedCriteria());
		suscriptor = new CollectionExpression("ORM_suscriptor", this.getDetachedCriteria());
		suscrito = new CollectionExpression("ORM_suscrito", this.getDetachedCriteria());
		me_gustas = new CollectionExpression("ORM_me_gustas", this.getDetachedCriteria());
		listas_reproduccion = new CollectionExpression("ORM_listas_reproduccion", this.getDetachedCriteria());
		comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		video_subido = new CollectionExpression("ORM_video_subido", this.getDetachedCriteria());
	}
	
	public Usuario_Registrado_BDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ventanas.Usuario_Registrado_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		fecha_nacimiento = new DateExpression("fecha_nacimiento", this.getDetachedCriteria());
		n_visitas = new IntegerExpression("n_visitas", this.getDetachedCriteria());
		historialId = new IntegerExpression("historial.id", this.getDetachedCriteria());
		historial = new AssociationExpression("historial", this.getDetachedCriteria());
		suscriptor = new CollectionExpression("ORM_suscriptor", this.getDetachedCriteria());
		suscrito = new CollectionExpression("ORM_suscrito", this.getDetachedCriteria());
		me_gustas = new CollectionExpression("ORM_me_gustas", this.getDetachedCriteria());
		listas_reproduccion = new CollectionExpression("ORM_listas_reproduccion", this.getDetachedCriteria());
		comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		video_subido = new CollectionExpression("ORM_video_subido", this.getDetachedCriteria());
	}
	
	public Historial_BDDetachedCriteria createHistorialCriteria() {
		return new Historial_BDDetachedCriteria(createCriteria("historial"));
	}
	
	public Usuario_Registrado_BDDetachedCriteria createSuscriptorCriteria() {
		return new Usuario_Registrado_BDDetachedCriteria(createCriteria("ORM_suscriptor"));
	}
	
	public Usuario_Registrado_BDDetachedCriteria createSuscritoCriteria() {
		return new Usuario_Registrado_BDDetachedCriteria(createCriteria("ORM_suscrito"));
	}
	
	public Video_BDDetachedCriteria createMe_gustasCriteria() {
		return new Video_BDDetachedCriteria(createCriteria("ORM_me_gustas"));
	}
	
	public Lista_reproduccion_BDDetachedCriteria createListas_reproduccionCriteria() {
		return new Lista_reproduccion_BDDetachedCriteria(createCriteria("ORM_listas_reproduccion"));
	}
	
	public Comentario_BDDetachedCriteria createComentariosCriteria() {
		return new Comentario_BDDetachedCriteria(createCriteria("ORM_comentarios"));
	}
	
	public Video_BDDetachedCriteria createVideo_subidoCriteria() {
		return new Video_BDDetachedCriteria(createCriteria("ORM_video_subido"));
	}
	
	public Usuario_Registrado_BD uniqueUsuario_Registrado_BD(PersistentSession session) {
		return (Usuario_Registrado_BD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_Registrado_BD[] listUsuario_Registrado_BD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_Registrado_BD[]) list.toArray(new Usuario_Registrado_BD[list.size()]);
	}
}

