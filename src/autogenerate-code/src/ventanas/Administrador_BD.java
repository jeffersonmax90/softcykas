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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Administrador_BD")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Usuario_BDId", referencedColumnName="Id")
public class Administrador_BD extends ventanas.Usuario_BD implements Serializable {
	public Administrador_BD() {
	}
	
	public String toString() {
		return super.toString();
	}
	
}
