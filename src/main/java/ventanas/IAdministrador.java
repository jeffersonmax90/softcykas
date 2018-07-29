package ventanas;

import java.util.List;

public interface IAdministrador {

	public boolean eliminarVideo(int aId);

	public Video_BD descargarVideoUA(int aId);

	public boolean crearCategorias(String aNombre, String aEdad);	

	public boolean eliminarCategoria(int aId);

	public List<Categoria_BD> cargarlistaCategorias(int aId);

	public List<Video_BD> cargarListaTotalVideosSubidos(int aId);

	public List<Usuario_Registrado_BD> cargarlistaUsuarioRegistrados(int aId);

	public boolean eliminarVideoListaSubido(int aId);

	public List<Video_BD> buscarVideoListaTotal(String aNombre);

	public boolean eliminarUsuarioListaRegistrado(int aId);

	public List<Video_BD> cargarVideosTendencia();

	public List<Video_BD> cargarListaUltimoVideosSubidos(int aId);

	public boolean anadirComentario(int aId, String aComentario);

	public List<Comentario_BD> cargarListaComentarios(int aId);
	
	public List<Usuario_Registrado_BD> buscarUsuarioListaRegistado(String aNombre);
	
	public Usuario_BD cargarImagenAdministrador(int aId);

	public boolean cambiarImagenAdministrador(int aId, String aRuta);
	
	public Video_BD cargarFichaVideoAdmin(int aId);
}