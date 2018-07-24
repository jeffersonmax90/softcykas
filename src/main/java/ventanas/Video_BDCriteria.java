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

public class Video_BDCriteria extends AbstractORMCriteria {
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
	public final StringExpression ruta;
	public final CollectionExpression comentarios;
	public final CollectionExpression listas_reproduccion;
	public final CollectionExpression historial;
	public final IntegerExpression propietarioId;
	public final AssociationExpression propietario;
	
	public Video_BDCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		usuario = new CollectionExpression("ORM_usuario", this);
		categoria_BDId = new IntegerExpression("categoria_BD.id", this);
		categoria_BD = new AssociationExpression("categoria_BD", this);
		titulo = new StringExpression("titulo", this);
		etiqueta = new StringExpression("etiqueta", this);
		miniatura = new StringExpression("miniatura", this);
		descripcion = new StringExpression("descripcion", this);
		fecha_subida = new DateExpression("fecha_subida", this);
		visualizaciones = new IntegerExpression("visualizaciones", this);
		ruta = new StringExpression("ruta", this);
		comentarios = new CollectionExpression("ORM_comentarios", this);
		listas_reproduccion = new CollectionExpression("ORM_listas_reproduccion", this);
		historial = new CollectionExpression("ORM_historial", this);
		propietarioId = new IntegerExpression("propietario.", this);
		propietario = new AssociationExpression("propietario", this);
	}
	
	public Video_BDCriteria(PersistentSession session) {
		this(session.createCriteria(Video_BD.class));
	}
	
	public Video_BDCriteria() throws PersistentException {
		this(ProyectoSoftCykasPersistentManager.instance().getSession());
	}
	
	public Usuario_Registrado_BDCriteria createUsuarioCriteria() {
		return new Usuario_Registrado_BDCriteria(createCriteria("ORM_usuario"));
	}
	
	public Categoria_BDCriteria createCategoria_BDCriteria() {
		return new Categoria_BDCriteria(createCriteria("categoria_BD"));
	}
	
	public Comentario_BDCriteria createComentariosCriteria() {
		return new Comentario_BDCriteria(createCriteria("ORM_comentarios"));
	}
	
	public Lista_reproduccion_BDCriteria createListas_reproduccionCriteria() {
		return new Lista_reproduccion_BDCriteria(createCriteria("ORM_listas_reproduccion"));
	}
	
	public Historial_BDCriteria createHistorialCriteria() {
		return new Historial_BDCriteria(createCriteria("ORM_historial"));
	}
	
	public Usuario_Registrado_BDCriteria createPropietarioCriteria() {
		return new Usuario_Registrado_BDCriteria(createCriteria("propietario"));
	}
	
	public Video_BD uniqueVideo_BD() {
		return (Video_BD) super.uniqueResult();
	}
	
	public Video_BD[] listVideo_BD() {
		java.util.List list = super.list();
		return (Video_BD[]) list.toArray(new Video_BD[list.size()]);
	}
}

