package ventanas;

import iuVentanas.Categorias;
import iuVentanas.Video;
import iuVentanas.Usuario;
import iuVentanas.Lista_categorias;
import iuVentanas.Usuario_registrado_listado;
import iuVentanas.Comentario;
import iuVentanas.Lista_videos_subidos;

public class BD_Principal implements IAdministrador, IUsuario_no_registrado, IUsuario_registrado {
	public BD_Videos _bD_Videos;
	public BD_Usuarios_Administradores _bD_Usuarios_Administradores;
	public BD_Usuarios_Registrados _bD_Usuarios_Registrados;
	public BD_Categorias _bD_Categorias;
	public BD_Comentarios _bD_Comentarios;
	public BD_Listas_reproduccion _bD_Listas_reproduccion;
	public BD_Historial _bD_Historial;

	public boolean subirVideo(Video_BD aVideo) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarVideo(Video_BD aVideo) {
		throw new UnsupportedOperationException();
	}

	public boolean registrarUsuario(Usuario_Registrado_BD aUsuario) {
		throw new UnsupportedOperationException();
	}

	public Categoria__ cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public List cargar_videos_tendencias() {
		throw new UnsupportedOperationException();
	}

	public List cargarVideosUsuariosRegistrados() {
		throw new UnsupportedOperationException();
	}

	public void borrar55() {
		throw new UnsupportedOperationException();
	}

	public Categorias[] Cargar_categorias() {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarHistorial(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarVideoSubido(int aID) {
		throw new UnsupportedOperationException();
	}

	public void modificar_lista_reproducion(String aNuevoNombre) {
		throw new UnsupportedOperationException();
	}

	public void modificarDatos(int aID) {
		throw new UnsupportedOperationException();
	}

	public List cargar_categorias_videos() {
		throw new UnsupportedOperationException();
	}

	public void crearLista(String aNombre, int aID) {
		throw new UnsupportedOperationException();
	}

	public void quitarVideo(int aID) {
		throw new UnsupportedOperationException();
	}

	public void dejarSeguir(int aID) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] cargarListadoSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarVideosTendencia(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarVideosUsuarioRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario iniciarSesion(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public Categoria_BD[] cargarCategorias(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarVideosSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarVideosRelacionados(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarVideo(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video descargarVideoUA(int aId) {
		throw new UnsupportedOperationException();
	}

	public void crearCategorias(String aNombre, String aEdad) {
		throw new UnsupportedOperationException();
	}

	public String[] cargarComboBoxEdadPermitida(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarCategoria(int aId) {
		throw new UnsupportedOperationException();
	}

	public Lista_categorias[] cargarlistaCategorias(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarListaTotalVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado_listado[] cargarlistaUsuarioRegistrados(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoListaSubido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] buscarVideoListaTotal(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarUsuarioListaRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario buscarUsuarioListaRegistado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video cargarListaUltimoVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public void anadirComentario(int aId, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] cargarListaComentarios(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarListaUltimosVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] anadirComentarios(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarListaReproducion(Lista_reproduccion_BD aLista) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean crearLista(Lista_reproduccion_BD aLista) {
		throw new UnsupportedOperationException();
	}

	public Lista_reproduccion_BD[] cargarListasReproduccionPropias(int aId) {
		throw new UnsupportedOperationException();
	}

	public Lista_videos_subidos[] cargarVideosPropios(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean meGusta(int aId, boolean aValor) {
		throw new UnsupportedOperationException();
	}

	public Video_BD descargarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public String[] cargarComboBoxAnadirLista(int aId) {
		throw new UnsupportedOperationException();
	}

	public void cambiarContrasena(String aContrasenanueva, String aRepetirContrasena) {
		throw new UnsupportedOperationException();
	}

	public void cambiarcontrasena(String aContNueva, String aContActual, String aContRepetir) {
		throw new UnsupportedOperationException();
	}
}