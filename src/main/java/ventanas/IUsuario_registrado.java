package ventanas;

import java.util.List;

public interface IUsuario_registrado {

	public boolean subirVideo(Video_BD aVideo);

	public boolean modificarVideo(Video_BD aVideo);

	public List<Video_BD> cargarHistorial(int aId);

	public boolean eliminarVideoSubido(int aId);

	public boolean modificarListaReproducion(Lista_reproduccion_BD aLista);

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario);

	public List cargar_categorias_videos();

	public boolean crearLista(Lista_reproduccion_BD aLista);

	public boolean quitarVideo(int aId);

	public boolean dejarSeguir(int aId);

	public List<Usuario_BD> cargarListadoSuscripciones(int aId);

	public List<Categoria_BD> cargarCategorias();

	public List<Video_BD> cargarVideosSuscripciones(int aId);

	public List<Video_BD> cargarVideosRelacionados(int aId);

	public List<Lista_reproduccion_BD> cargarListasReproduccionPropias(int aId);

	public List<Video_BD> cargarVideosPropios(int aId);

	public boolean meGusta(int aId, boolean aValor);

	public Video_BD descargarVideoUR(int aId);

	public boolean eliminarVideoUR(int aId);

	public List<String> cargarComboBoxAnadirLista(int aId);

	public boolean cambiarContrasena(String aContrasenanueva, String aRepetirContrasena);

	public boolean cambiarcontrasena(String aContNueva, String aContActual, String aContRepetir);

	public List<Video_BD> cargarListaUltimoVideosSubidos(int aId);

	public boolean anadirComentario(int aId, String aComentario);

	public List<Comentario_BD> anadirComentarios(int aId);
	
	public Usuario_Registrado_BD cargarModificarDatos(int aId);
	
	public Video_BD cargarModificarVideo(int aId);
	
	public List<Video_BD> buscarVideosPropios(String aNombre);
}