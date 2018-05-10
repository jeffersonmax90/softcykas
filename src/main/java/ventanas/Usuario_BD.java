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
@Table(name="Usuario_BD")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario_BD implements Serializable {
	public Usuario_BD() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="VENTANAS_USUARIO_BD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VENTANAS_USUARIO_BD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Apodo", nullable=true, length=255)	
	private String apodo;
	
	@Column(name="Contraseña", nullable=true, length=255)	
	private String contraseña;
	
	@Column(name="Miniatura", nullable=true, length=255)	
	private String miniatura;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setApodo(String value) {
		this.apodo = value;
	}
	
	public String getApodo() {
		return apodo;
	}
	
	public void setContraseña(String value) {
		this.contraseña = value;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setMiniatura(String value) {
		this.miniatura = value;
	}
	
	public String getMiniatura() {
		return miniatura;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
