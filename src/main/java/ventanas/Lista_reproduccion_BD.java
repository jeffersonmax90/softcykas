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
@Table(name="Lista_reproduccion_BD")
public class Lista_reproduccion_BD implements Serializable {
	public Lista_reproduccion_BD() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LISTA_REPRODUCCION_BD_VIDEO) {
			return ORM_video;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LISTA_REPRODUCCION_BD_USUARIO) {
			this.usuario = (ventanas.Usuario_Registrado_BD) owner;
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
	@GeneratedValue(generator="VENTANAS_LISTA_REPRODUCCION_BD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VENTANAS_LISTA_REPRODUCCION_BD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=ventanas.Usuario_Registrado_BD.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_Registrado_BDUsuario_BDId", referencedColumnName="Usuario_BDId", nullable=false) })	
	private ventanas.Usuario_Registrado_BD usuario;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(mappedBy="ORM_listas_reproduccion", targetEntity=ventanas.Video_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_video = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUsuario(ventanas.Usuario_Registrado_BD value) {
		if (usuario != null) {
			usuario.listas_reproduccion.remove(this);
		}
		if (value != null) {
			value.listas_reproduccion.add(this);
		}
	}
	
	public ventanas.Usuario_Registrado_BD getUsuario() {
		return usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario(ventanas.Usuario_Registrado_BD value) {
		this.usuario = value;
	}
	
	private ventanas.Usuario_Registrado_BD getORM_Usuario() {
		return usuario;
	}
	
	private void setORM_Video(java.util.Set value) {
		this.ORM_video = value;
	}
	
	private java.util.Set getORM_Video() {
		return ORM_video;
	}
	
	@Transient	
	public final ventanas.Video_BDSetCollection video = new ventanas.Video_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_REPRODUCCION_BD_VIDEO, ORMConstants.KEY_VIDEO_BD_LISTAS_REPRODUCCION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
