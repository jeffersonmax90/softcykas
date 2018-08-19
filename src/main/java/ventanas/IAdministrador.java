package ventanas;

import java.util.List;

public interface IAdministrador {

	public boolean crearCategorias(String aNombre, String aEdad);	

	public List<Video_BD> cargarListaTotalVideosSubidos(int aId);

	public List<Usuario_Registrado_BD> cargarlistaUsuarioRegistrados(int aId);

	public List<Video_BD> buscarVideoListaTotal(String aNombre);

	public boolean eliminarUsuarioListaRegistrado(int aId);

	public List<Video_BD> cargarVideosTendencia();

	
	public List<Usuario_Registrado_BD> buscarUsuarioListaRegistado(String aNombre);
	
	public Usuario_BD cargarImagenAdministrador(int aId);

	public boolean cambiarImagenAdministrador(int aId, String aRuta);
	
	public boolean eliminarComentarioAdmin(int aId);
	
	public boolean eliminarVideoAdmin(int aId);
	
	public List<Categoria_BD> cargarListadoCategorias();
	
	public boolean modificarCategoriaAdmin(int aId, Categoria_BD aCategoria);
}