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
@Table(name="Historial_BD")
public class Historial_BD implements Serializable {
	public Historial_BD() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_HISTORIAL_BD_VIDEO) {
			return ORM_video;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_HISTORIAL_BD_USUARIO) {
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
	@GeneratedValue(generator="VENTANAS_HISTORIAL_BD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VENTANAS_HISTORIAL_BD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(mappedBy="ORM_historial", targetEntity=ventanas.Video_BD.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_video = new java.util.HashSet();
	
	@OneToOne(mappedBy="historial", targetEntity=ventanas.Usuario_Registrado_BD.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private ventanas.Usuario_Registrado_BD usuario;
	
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
	
	private void setORM_Video(java.util.Set value) {
		this.ORM_video = value;
	}
	
	private java.util.Set getORM_Video() {
		return ORM_video;
	}
	
	@Transient	
	public final ventanas.Video_BDSetCollection video = new ventanas.Video_BDSetCollection(this, _ormAdapter, ORMConstants.KEY_HISTORIAL_BD_VIDEO, ORMConstants.KEY_VIDEO_BD_HISTORIAL, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setUsuario(ventanas.Usuario_Registrado_BD value) {
		if (this.usuario != value) {
			ventanas.Usuario_Registrado_BD lusuario = this.usuario;
			this.usuario = value;
			if (value != null) {
				usuario.setHistorial(this);
			}
			if (lusuario != null && lusuario.getHistorial() == this) {
				lusuario.setHistorial(null);
			}
		}
	}
	
	public ventanas.Usuario_Registrado_BD getUsuario() {
		return usuario;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
