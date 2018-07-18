package ventanas;

import java.util.List;

public interface IUsuario_registrado {

	public boolean subirVideo(Video_BD aVideo);

	public boolean modificarVideo(Video_BD aVideo);

	public Video[] cargarHistorial(int aId);

	public void eliminarVideoSubido(int aId);

	public boolean modificarListaReproducion(Lista_reproduccion_BD aLista);

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario);

	public List cargar_categorias_videos();

	public boolean crearLista(Lista_reproduccion_BD aLista);

	public void quitarVideo(int aId);

	public void dejarSeguir(int aId);

	public Usuario[] cargarListadoSuscripciones(int aId);

	public List<Categoria_BD> cargarCategorias();

	public Video[] cargarVideosSuscripciones(int aId);

	public Video[] cargarVideosRelacionados(int aId);

	public Lista_reproduccion_BD[] cargarListasReproduccionPropias(int aId);

	public Lista_videos_subidos[] cargarVideosPropios(int aId);

	public boolean meGusta(int aId, boolean aValor);

	public Video_BD descargarVideoUR(int aId);

	public void eliminarVideoUR(int aId);

	public String[] cargarComboBoxAnadirLista(int aId);

	public void cambiarContrasena(String aContrasenanueva, String aRepetirContrasena);

	public void cambiarcontrasena(String aContNueva, String aContActual, String aContRepetir);

	public Video cargarListaUltimoVideosSubidos(int aId);

	public void anadirComentario(int aId, String aComentario);

	public Comentario[] anadirComentarios(int aId);
}