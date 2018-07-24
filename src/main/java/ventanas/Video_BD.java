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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Video_BD")
public class Video_BD implements Serializable {
	public Video_BD() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_VIDEO_BD_USUARIO) {
			return ORM_usuario;
		}
		else if (key == ORMConstants.KEY_VIDEO_BD_COMENTARIOS) {
			return ORM_comentarios;
		}
		else if (key == ORMConstants.KEY_VIDEO_BD_LISTAS_REPRODUCCION) {
			return ORM_listas_reproduccion;
		}
		else if (key == ORMConstants.KEY_VIDEO_BD_HISTORIAL) {
			return ORM_historial;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_VIDEO_BD_PROPIETARIO) {
			this.propietario = (ventanas.Usuario_Registrado_BD) owner;
		}
		
		else if (key == ORMConstants.KEY_VIDEO_BD_CATEGORIA_BD) {
			this.categoria_BD = (ventanas.Categoria_BD) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="VENTANAS_VIDEO_BD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VENTANAS_VIDEO_BD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToMany(targetEntity=ventanas.Usuario_Registrado_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Registrado_BD_Video_BD", joinColumns={ @JoinColumn(name="Video_BDId") }, inverseJoinColumns={ @JoinColumn(name="Usuario_Registrado_BDUsuario_BDId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	@ManyToOne(targetEntity=ventanas.Categoria_BD.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Categoria_BDId", referencedColumnName="Id", nullable=false) })	
	private ventanas.Categoria_BD categoria_BD;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Etiqueta", nullable=true, length=255)	
	private String etiqueta;
	
	@Column(name="Miniatura", nullable=true, length=255)	
	private String miniatura;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Fecha_subida", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha_subida;
	
	@Column(name="Visualizaciones", nullable=true, length=10)	
	private int visualizaciones;
	
	@Column(name="Ruta", nullable=true, length=255)	
	private String ruta;
	
	@OneToMany(mappedBy="video", targetEntity=ventanas.Comentario_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarios = new java.util.HashSet();
	
	@ManyToMany(targetEntity=ventanas.Lista_reproduccion_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Lista_reproduccion_BD_Video_BD", joinColumns={ @JoinColumn(name="Video_BDId") }, inverseJoinColumns={ @JoinColumn(name="Lista_reproduccion_BDId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas_reproduccion = new java.util.HashSet();
	
	@ManyToMany(targetEntity=ventanas.Historial_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Historial_BD_Video_BD", joinColumns={ @JoinColumn(name="Video_BDId") }, inverseJoinColumns={ @JoinColumn(name="Historial_BDId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_historial = new java.util.HashSet();
	
	@ManyToOne(targetEntity=ventanas.Usuario_Registrado_BD.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_Registrado_BDUsuario_BDId", referencedColumnName="Usuario_BDId", nullable=false) })	
	private ventanas.Usuario_Registrado_BD propietario;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setEtiqueta(String value) {
		this.etiqueta = value;
	}
	
	public String getEtiqueta() {
		return etiqueta;
	}
	
	public void setMiniatura(String value) {
		this.miniatura = value;
	}
	
	public String getMiniatura() {
		return miniatura;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFecha_subida(java.util.Date value) {
		this.fecha_subida = value;
	}
	
	public java.util.Date getFecha_subida() {
		return fecha_subida;
	}
	
	public void setVisualizaciones(int value) {
		this.visualizaciones = value;
	}
	
	public int getVisualizaciones() {
		return visualizaciones;
	}
	
	public void setRuta(String value) {
		this.ruta = value;
	}
	
	public String getRuta() {
		return ruta;
	}
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final ventanas.Usuario_Registrado_BDSetCollection usuario = new ventanas.Usuario_Registrado_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEO_BD_USUARIO, ORMConstants.KEY_USUARIO_REGISTRADO_BD_ME_GUSTAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Comentarios(java.util.Set value) {
		this.ORM_comentarios = value;
	}
	
	private java.util.Set getORM_Comentarios() {
		return ORM_comentarios;
	}
	
	@Transient	
	public final ventanas.Comentario_BDSetCollection comentarios = new ventanas.Comentario_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEO_BD_COMENTARIOS, ORMConstants.KEY_COMENTARIO_BD_VIDEO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Listas_reproduccion(java.util.Set value) {
		this.ORM_listas_reproduccion = value;
	}
	
	private java.util.Set getORM_Listas_reproduccion() {
		return ORM_listas_reproduccion;
	}
	
	@Transient	
	public final ventanas.Lista_reproduccion_BDSetCollection listas_reproduccion = new ventanas.Lista_reproduccion_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEO_BD_LISTAS_REPRODUCCION, ORMConstants.KEY_LISTA_REPRODUCCION_BD_VIDEO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Historial(java.util.Set value) {
		this.ORM_historial = value;
	}
	
	private java.util.Set getORM_Historial() {
		return ORM_historial;
	}
	
	@Transient	
	public final ventanas.Historial_BDSetCollection historial = new ventanas.Historial_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEO_BD_HISTORIAL, ORMConstants.KEY_HISTORIAL_BD_VIDEO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPropietario(ventanas.Usuario_Registrado_BD value) {
		if (propietario != null) {
			propietario.video_subido.remove(this);
		}
		if (value != null) {
			value.video_subido.add(this);
		}
	}
	
	public ventanas.Usuario_Registrado_BD getPropietario() {
		return propietario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Propietario(ventanas.Usuario_Registrado_BD value) {
		this.propietario = value;
	}
	
	private ventanas.Usuario_Registrado_BD getORM_Propietario() {
		return propietario;
	}
	
	public void setCategoria_BD(ventanas.Categoria_BD value) {
		if (categoria_BD != null) {
			categoria_BD.videos.remove(this);
		}
		if (value != null) {
			value.videos.add(this);
		}
	}
	
	public ventanas.Categoria_BD getCategoria_BD() {
		return categoria_BD;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Categoria_BD(ventanas.Categoria_BD value) {
		this.categoria_BD = value;
	}
	
	private ventanas.Categoria_BD getORM_Categoria_BD() {
		return categoria_BD;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
