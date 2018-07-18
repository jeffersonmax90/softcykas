package ventanas;

public interface IAdministrador {

	public void eliminarVideo(int aId);

	public Video descargarVideoUA(int aId);

	public void crearCategorias(String aNombre, String aEdad);

	public String[] cargarComboBoxEdadPermitida(int aId);

	public void eliminarCategoria(int aId);

	public Lista_categorias[] cargarlistaCategorias(int aId);

	public Video[] cargarListaTotalVideosSubidos(int aId);

	public Usuario_registrado_listado[] cargarlistaUsuarioRegistrados(int aId);

	public boolean eliminarVideoListaSubido(int aId);

	public Video[] buscarVideoListaTotal(String aNombre);

	public boolean eliminarUsuarioListaRegistrado(int aId);

	public Usuario buscarUsuarioListaRegistado(int aId);

	public Video[] cargarVideosTendencia(int aId);

	public Video cargarListaUltimoVideosSubidos(int aId);

	public void anadirComentario(int aId, String aComentario);

	public Comentario[] cargarListaComentarios(int aId);
}