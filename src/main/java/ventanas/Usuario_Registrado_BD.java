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
import java.util.List;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario_Registrado_BD")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Usuario_BDId", referencedColumnName="Id")
public class Usuario_Registrado_BD extends ventanas.Usuario_BD implements Serializable {
	public Usuario_Registrado_BD() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_BD_SUSCRIPTOR) {
			return ORM_suscriptor;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_BD_SUSCRITO) {
			return ORM_suscrito;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_BD_ME_GUSTAS) {
			return ORM_me_gustas;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_BD_LISTAS_REPRODUCCION) {
			return ORM_listas_reproduccion;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_BD_COMENTARIOS) {
			return ORM_comentarios;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_BD_VIDEO_SUBIDO) {
			return ORM_video_subido;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_BD_HISTORIAL) {
			this.historial = (ventanas.Historial_BD) owner;
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
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellidos", nullable=true, length=255)	
	private String apellidos;
	
	@Column(name="Fecha_nacimiento", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha_nacimiento;
	
	@Column(name="N_visitas", nullable=true, length=10)	
	private int n_visitas;
	
	@OneToOne(optional=false, targetEntity=ventanas.Historial_BD.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Historial_BDId", referencedColumnName="Id", nullable=false) })	
	private ventanas.Historial_BD historial;
	
	@ManyToMany(targetEntity=ventanas.Usuario_Registrado_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Registrado_BD_Usuario_Registrado_BD", joinColumns={ @JoinColumn(name="Usuario_Registrado_BDUsuario_BDId2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_Registrado_BDUsuario_BDId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_suscriptor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_suscriptor", targetEntity=ventanas.Usuario_Registrado_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_suscrito = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuario", targetEntity=ventanas.Video_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_me_gustas = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario", targetEntity=ventanas.Lista_reproduccion_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas_reproduccion = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario", targetEntity=ventanas.Comentario_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarios = new java.util.HashSet();
	
	@OneToMany(mappedBy="propietario", targetEntity=ventanas.Video_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_video_subido = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setFecha_nacimiento(java.util.Date value) {
		this.fecha_nacimiento = value;
	}
	
	public java.util.Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	public void setN_visitas(int value) {
		this.n_visitas = value;
	}
	
	public int getN_visitas() {
		return n_visitas;
	}
	
	private void setORM_Suscriptor(java.util.Set value) {
		this.ORM_suscriptor = value;
	}
	
	private java.util.Set getORM_Suscriptor() {
		return ORM_suscriptor;
	}
	
	@Transient	
	public final ventanas.Usuario_Registrado_BDSetCollection suscriptor = new ventanas.Usuario_Registrado_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_BD_SUSCRIPTOR, ORMConstants.KEY_USUARIO_REGISTRADO_BD_SUSCRITO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setHistorial(ventanas.Historial_BD value) {
		if (this.historial != value) {
			ventanas.Historial_BD lhistorial = this.historial;
			this.historial = value;
			if (value != null) {
				historial.setUsuario(this);
			}
			if (lhistorial != null && lhistorial.getUsuario() == this) {
				lhistorial.setUsuario(null);
			}
		}
	}
	
	public ventanas.Historial_BD getHistorial() {
		return historial;
	}
	
	private void setORM_Suscrito(java.util.Set value) {
		this.ORM_suscrito = value;
	}
	
	private java.util.Set getORM_Suscrito() {
		return ORM_suscrito;
	}
	
	@Transient	
	public final ventanas.Usuario_Registrado_BDSetCollection suscrito = new ventanas.Usuario_Registrado_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_BD_SUSCRITO, ORMConstants.KEY_USUARIO_REGISTRADO_BD_SUSCRIPTOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Me_gustas(java.util.Set value) {
		this.ORM_me_gustas = value;
	}
	
	private java.util.Set getORM_Me_gustas() {
		return ORM_me_gustas;
	}
	
	@Transient	
	public final ventanas.Video_BDSetCollection me_gustas = new ventanas.Video_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_BD_ME_GUSTAS, ORMConstants.KEY_VIDEO_BD_USUARIO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Listas_reproduccion(java.util.Set value) {
		this.ORM_listas_reproduccion = value;
	}
	
	private java.util.Set getORM_Listas_reproduccion() {
		return ORM_listas_reproduccion;
	}
	
	@Transient	
	public final ventanas.Lista_reproduccion_BDSetCollection listas_reproduccion = new ventanas.Lista_reproduccion_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_BD_LISTAS_REPRODUCCION, ORMConstants.KEY_LISTA_REPRODUCCION_BD_USUARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comentarios(java.util.Set value) {
		this.ORM_comentarios = value;
	}
	
	private java.util.Set getORM_Comentarios() {
		return ORM_comentarios;
	}
	
	@Transient	
	public final ventanas.Comentario_BDSetCollection comentarios = new ventanas.Comentario_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_BD_COMENTARIOS, ORMConstants.KEY_COMENTARIO_BD_USUARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Video_subido(java.util.Set value) {
		this.ORM_video_subido = value;
	}
	
	private java.util.Set getORM_Video_subido() {
		return ORM_video_subido;
	}
	
	@Transient	
	public final ventanas.Video_BDSetCollection video_subido = new ventanas.Video_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_BD_VIDEO_SUBIDO, ORMConstants.KEY_VIDEO_BD_PROPIETARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public List<Video_BD> cargarVideosTendencia() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
