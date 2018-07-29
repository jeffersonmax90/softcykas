package ventanas;

import java.util.List;

public interface IUsuario_no_registrado {

	public boolean registrarUsuario(Usuario_Registrado_BD aUsuario);

	public List cargarVideosUsuariosRegistrados();

	public List<Video_BD> cargarVideosTendencia();

	public List<Video_BD> cargarVideosUsuarioRegistrado(int aId);

	public Usuario_BD iniciarSesion(String aEmail, String aContrasena);

	public List<Video_BD> cargarListaUltimosVideosSubidos(int aId);

	public List<Comentario_BD> anadirComentarios(int aId);
	
	public Video_BD cargarFichaVideoNoRegistrado(int aId);
}