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
@Table(name="Comentario_BD")
public class Comentario_BD implements Serializable {
	public Comentario_BD() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIO_BD_USUARIO) {
			this.usuario = (ventanas.Usuario_Registrado_BD) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_BD_VIDEO) {
			this.video = (ventanas.Video_BD) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="VENTANAS_COMENTARIO_BD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VENTANAS_COMENTARIO_BD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=ventanas.Video_BD.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Video_BDId", referencedColumnName="Id", nullable=false) })	
	private ventanas.Video_BD video;
	
	@ManyToOne(targetEntity=ventanas.Usuario_Registrado_BD.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_Registrado_BDUsuario_BDId", referencedColumnName="Usuario_BDId", nullable=false) })	
	private ventanas.Usuario_Registrado_BD usuario;
	
	@Column(name="Mensaje", nullable=true, length=255)	
	private String mensaje;
	
	@Column(name="Fecha_subida", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha_subida;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setFecha_subida(java.util.Date value) {
		this.fecha_subida = value;
	}
	
	public java.util.Date getFecha_subida() {
		return fecha_subida;
	}
	
	public void setUsuario(ventanas.Usuario_Registrado_BD value) {
		if (usuario != null) {
			usuario.comentarios.remove(this);
		}
		if (value != null) {
			value.comentarios.add(this);
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
	
	public void setVideo(ventanas.Video_BD value) {
		if (video != null) {
			video.comentarios.remove(this);
		}
		if (value != null) {
			value.comentarios.add(this);
		}
	}
	
	public ventanas.Video_BD getVideo() {
		return video;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Video(ventanas.Video_BD value) {
		this.video = value;
	}
	
	private ventanas.Video_BD getORM_Video() {
		return video;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
