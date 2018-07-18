package ventanas;

import java.util.List;

public interface IUsuario_no_registrado {

	public boolean registrarUsuario(Usuario_Registrado_BD aUsuario);

	public List cargarVideosUsuariosRegistrados();

	public Video[] cargarVideosTendencia(int aId);

	public Video[] cargarVideosUsuarioRegistrado(int aId);

	public Usuario_BD iniciarSesion(String aEmail, String aContrasena);

	public Video[] cargarListaUltimosVideosSubidos(int aId);

	public Comentario[] anadirComentarios(int aId);
}