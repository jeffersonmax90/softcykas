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

public class Video_BDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final CollectionExpression usuario;
	public final IntegerExpression categoria_BDId;
	public final AssociationExpression categoria_BD;
	public final StringExpression titulo;
	public final StringExpression etiqueta;
	public final StringExpression miniatura;
	public final StringExpression descripcion;
	public final DateExpression fecha_subida;
	public final IntegerExpression visualizaciones;
	public final CollectionExpression comentarios;
	public final CollectionExpression listas_reproduccion;
	public final CollectionExpression historial;
	public final IntegerExpression propietarioId;
	public final AssociationExpression propietario;
	
	public Video_BDDetachedCriteria() {
		super(ventanas.Video_BD.class, ventanas.Video_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		categoria_BDId = new IntegerExpression("categoria_BD.id", this.getDetachedCriteria());
		categoria_BD = new AssociationExpression("categoria_BD", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		etiqueta = new StringExpression("etiqueta", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fecha_subida = new DateExpression("fecha_subida", this.getDetachedCriteria());
		visualizaciones = new IntegerExpression("visualizaciones", this.getDetachedCriteria());
		comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		listas_reproduccion = new CollectionExpression("ORM_listas_reproduccion", this.getDetachedCriteria());
		historial = new CollectionExpression("ORM_historial", this.getDetachedCriteria());
		propietarioId = new IntegerExpression("propietario.", this.getDetachedCriteria());
		propietario = new AssociationExpression("propietario", this.getDetachedCriteria());
	}
	
	public Video_BDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ventanas.Video_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		categoria_BDId = new IntegerExpression("categoria_BD.id", this.getDetachedCriteria());
		categoria_BD = new AssociationExpression("categoria_BD", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		etiqueta = new StringExpression("etiqueta", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fecha_subida = new DateExpression("fecha_subida", this.getDetachedCriteria());
		visualizaciones = new IntegerExpression("visualizaciones", this.getDetachedCriteria());
		comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		listas_reproduccion = new CollectionExpression("ORM_listas_reproduccion", this.getDetachedCriteria());
		historial = new CollectionExpression("ORM_historial", this.getDetachedCriteria());
		propietarioId = new IntegerExpression("propietario.", this.getDetachedCriteria());
		propietario = new AssociationExpression("propietario", this.getDetachedCriteria());
	}
	
	public Usuario_Registrado_BDDetachedCriteria createUsuarioCriteria() {
		return new Usuario_Registrado_BDDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public Categoria_BDDetachedCriteria createCategoria_BDCriteria() {
		return new Categoria_BDDetachedCriteria(createCriteria("categoria_BD"));
	}
	
	public Comentario_BDDetachedCriteria createComentariosCriteria() {
		return new Comentario_BDDetachedCriteria(createCriteria("ORM_comentarios"));
	}
	
	public Lista_reproduccion_BDDetachedCriteria createListas_reproduccionCriteria() {
		return new Lista_reproduccion_BDDetachedCriteria(createCriteria("ORM_listas_reproduccion"));
	}
	
	public Historial_BDDetachedCriteria createHistorialCriteria() {
		return new Historial_BDDetachedCriteria(createCriteria("ORM_historial"));
	}
	
	public Usuario_Registrado_BDDetachedCriteria createPropietarioCriteria() {
		return new Usuario_Registrado_BDDetachedCriteria(createCriteria("propietario"));
	}
	
	public Video_BD uniqueVideo_BD(PersistentSession session) {
		return (Video_BD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Video_BD[] listVideo_BD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Video_BD[]) list.toArray(new Video_BD[list.size()]);
	}
}

