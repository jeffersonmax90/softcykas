package ventanas;

import java.util.Vector;
import ventanas.Administrador_BD;
import iuVentanas.Usuario_administrador;

public class BD_Usuarios_Administradores {
	public BD_Principal _bD_Principal;
	public Vector<Administrador_BD> _administradores = new Vector<Administrador_BD>();

	public Usuario_administrador inicarSesion(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}
}