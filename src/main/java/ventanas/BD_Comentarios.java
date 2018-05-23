package ventanas;

import java.util.Vector;
import ventanas.Comentario_BD;
import ventanas.Comentario;

public class BD_Comentarios {
	public BD_Principal _bD_Principal;
	public Vector<Comentario_BD> _comentarios = new Vector<Comentario_BD>();

	public void anadirComentario(int aId, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public void anadirComentarioAdmin(int aId, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] anadirComentarios(int aId) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] anadirComentariosInvitado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] anadirComentariosReg(int aId) {
		throw new UnsupportedOperationException();
	}
}