package ventanas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.orm.PersistentException;

public class BD_Principal implements IAdministrador, IUsuario_no_registrado, IUsuario_registrado {
	public BD_Videos _bD_Videos = new BD_Videos();
	public BD_Usuarios_Administradores _bD_Usuarios_Administradores = new BD_Usuarios_Administradores();
	public BD_Usuarios_Registrados _bD_Usuarios_Registrados = new BD_Usuarios_Registrados();
	public BD_Categorias _bD_Categorias = new BD_Categorias();
	public BD_Comentarios _bD_Comentarios = new BD_Comentarios();
	public BD_Listas_reproduccion _bD_Listas_reproduccion = new BD_Listas_reproduccion();
	public BD_Historial _bD_Historial = new BD_Historial();

	public boolean subirVideo(Video_BD aVideo) {
		boolean correcto = false;

		try {
			correcto = _bD_Videos.nuevoVideo(aVideo);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return correcto;

	}

	public boolean modificarVideo(Video_BD aVideo) {
		boolean modificado = false;
		try {
			modificado = _bD_Videos.actualizarVideo(aVideo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modificado;
	}

	public boolean registrarUsuario(Usuario_Registrado_BD aUsuario) {

		try {
			return _bD_Usuarios_Registrados.nuevoUsuario(aUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Video_BD> cargarHistorial(int aId) {
		List<Video_BD> videos = null;
		try {
			videos = _bD_Historial.cargarHistorial(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videos;
	}

	public List cargar_categorias_videos() {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	public List<Video_BD> cargarVideosTendencia() {
		List<Video_BD> videos = null;
		try {
			videos = _bD_Videos.cargarVideosTendencias();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videos;
	}

	public List<Video_BD> cargarVideosUsuarioRegistrado(int aId) {
		List<Video_BD> videos = null;
		try {
			videos = _bD_Videos.cargarVideoUsuarioRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videos;
	}

	public Usuario_BD iniciarSesion(String aEmail, String aContrasena) {

		Usuario_BD usuario = new Usuario_BD();

		try {
			usuario = _bD_Usuarios_Registrados.iniciarSesion(aEmail, aContrasena);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return usuario;

	}

	public List<Video_BD> cargarVideosRelacionados(int aId) {
		List<Video_BD> videos = null;
		try {
			videos = _bD_Videos.cargarVideosRelacionados(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videos;
	}

	public boolean eliminarVideo(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video_BD descargarVideoUA(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean crearCategorias(String aNombre, String aEdad) {
		boolean correcto = false;
		try {
			correcto = _bD_Categorias.crearCategorias(aNombre, aEdad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return correcto;
	}

	public boolean eliminarCategoria(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Categoria_BD> cargarlistaCategorias(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarListaTotalVideosSubidos(int aId) {
		List<Video_BD> videos = null;
		try {
			videos = _bD_Videos.cargarListaTotalVideosSubidos(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videos;
	}

	public List<Usuario_Registrado_BD> cargarlistaUsuarioRegistrados(int aId) {
		List<Usuario_Registrado_BD> u = null;
		try {
			u = _bD_Usuarios_Registrados.cargarlistaUsuarioRegistrados(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	public boolean eliminarVideoListaSubido(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> buscarVideoListaTotal(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarUsuarioListaRegistrado(int aId) {
		boolean correcto = false;
		try {
			correcto = _bD_Usuarios_Registrados.eliminarUsuarioListaRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;
	}

	// falta por hacer
	public boolean anadirComentario(int aId, String aComentario) {
		boolean correcto = false;
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;
	}

	public List<Comentario_BD> cargarListaComentarios(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarListaUltimosVideosSubidos(int aId) {
		List<Video_BD> videos = null;
		try {
			videos = _bD_Videos.cargarListaUltimosVideosSubidos(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videos;
	}

	public List<Comentario_BD> anadirComentarios(int aId) {

		List<Comentario_BD> comentarios = null;
		try {
			comentarios = _bD_Comentarios.anadirComentarios(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return comentarios;
	}

	public boolean modificarListaReproducion(Lista_reproduccion_BD aLista) {
		boolean modificado = false;
		try {
			modificado = _bD_Listas_reproduccion.modificarListaReproducion(aLista);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modificado;
	}

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario) {
		boolean modificado = false;
		try {
			modificado = _bD_Usuarios_Registrados.modificarDatos(aUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modificado;
	}

	public boolean crearLista(Lista_reproduccion_BD aLista) {
		boolean correcto = false;
		try {
			correcto = _bD_Listas_reproduccion.crearLista(aLista);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return correcto;

	}

	public List<Lista_reproduccion_BD> cargarListasReproduccionPropias(int aId) {
		List<Lista_reproduccion_BD> lista = null;
		try {
			lista = _bD_Listas_reproduccion.cargarListasReproduccionPropias(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public List<Video_BD> cargarVideosPropios(int aId) {
		try {
			return _bD_Videos.cargarVideosPropios(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean meGusta(int aIdUsuario, int aIdVideo) {
		boolean megusta = false;
		try {

			megusta = _bD_Videos.meGusta(aIdUsuario, aIdVideo);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return megusta;
	}

	public Video_BD descargarVideoUR(int aId) {
		Video_BD video = null;
		try {
			video = _bD_Videos.descargarVideoUR(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return video;
	}

	public boolean eliminarVideoUR(int aId) {
		boolean eliminado = false;
		try {

			eliminado = _bD_Videos.eliminarVideoUR(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return eliminado;
	}

	public List<Lista_reproduccion_BD> cargarListasReproducionCaja(int aId) {
		List<Lista_reproduccion_BD> lista = null;
		try {
			lista = _bD_Listas_reproduccion.cargarListasReproducionCaja(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public boolean cambiarContrasena(String aContrasenanueva, String aRepetirContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarcontrasena(String aContNueva, String aContActual, String aContRepetir) {
		boolean modificado = false;
		try {
			modificado = _bD_Usuarios_Registrados.cambiarContrasena(aContNueva, aContActual, aContRepetir);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modificado;
	}

	public List<Categoria_BD> cargarCategorias() {
		List<Categoria_BD> cat = null;
		try {
			cat = _bD_Categorias.listarCategorias();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return cat;
	}

	public boolean quitarVideo(int aId) {
		boolean eliminado = false;
		try {
			eliminado = _bD_Videos.quitarVideo(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return eliminado;
	}

	public boolean dejarSeguir(int aId) {
		boolean dejarSeguir = false;
		try {
			dejarSeguir = _bD_Usuarios_Registrados.dejarSeguir(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dejarSeguir;
	}

	public List<Usuario_Registrado_BD> cargarListadoSuscripciones(int aId) {
		List<Usuario_Registrado_BD> lista = null;
		try {
			lista = _bD_Usuarios_Registrados.cargarListadoSuscripciones(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public List<Video_BD> cargarVideosSuscripciones(int aId) {
		List<Video_BD> lista = null;
		try {
			lista = _bD_Videos.cargarVideosSuscripciones(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public boolean eliminarVideoSubido(int aId) {
		boolean borrado = false;
		try {
			borrado = _bD_Videos.eliminarVideoSubido(aId);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return borrado;
	}

	public Usuario_Registrado_BD cargarModificarDatos(int aId) {
		Usuario_Registrado_BD usu = null;
		try {
			usu = _bD_Usuarios_Registrados.cargarModificarDatos(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	// TODO
	public List<Usuario_Registrado_BD> buscarUsuarioListaRegistado(String aNombre) {
		List<Usuario_Registrado_BD> lista = null;
		try {
			lista = _bD_Usuarios_Registrados.buscarUsuarioListaRegistado(aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public Usuario_BD cargarImagenAdministrador(int aId) {
		Usuario_BD usu = null;
		try {
			usu = _bD_Usuarios_Administradores.cargarImagenAdministardor(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	public boolean cambiarImagenAdministrador(int aId, String aRuta) {
		boolean cambiado = false;
		try {
			cambiado = _bD_Usuarios_Administradores.cambiarImagenAdministrador(aId, aRuta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cambiado;
	}

	public Video_BD cargarModificarVideo(int aId) {
		Video_BD video = null;
		try {
			video = _bD_Videos.cargarModificarVideo(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return video;
	}

	public List<Video_BD> buscarVideosPropios(String aNombre) {
		List<Video_BD> lista = null;
		try {
			lista = _bD_Videos.buscarVideosPropios(aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public Usuario_Registrado_BD cargarDatosPerfilRegistrado(int aId) {
		Usuario_Registrado_BD usu = null;
		try {
			usu = _bD_Usuarios_Registrados.cargarDatosPerfilRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	public Video_BD cargarFichaVideoAdmin(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video_BD cargarFichaVideoNoRegistrado(int aId) {
		Video_BD video = null;
		try {
			video = _bD_Videos.cargarFichaVideoNoRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return video;
	}

	public Video_BD cargarFichaVideoRegistrado(int aId) {
		Video_BD video = null;
		try {
			video = _bD_Videos.cargarFichaVideoRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return video;
	}

	public Lista_reproduccion_BD cargarNombreModificarListaReproduccion(int aId) {
		Lista_reproduccion_BD listaReproduccion = null;
		try {
			listaReproduccion = _bD_Listas_reproduccion.cargarNombreModificarListaReproduccion(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaReproduccion;
	}

	public Usuario_Registrado_BD cargarNombrePerfilRegistrado(int aId) {
		Usuario_Registrado_BD usu = null;
		try {
			usu = _bD_Usuarios_Registrados.cargarNombrePerfilRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	public List<Lista_reproduccion_BD> buscarListasReproducionPropias(String aNombre) {
		List<Lista_reproduccion_BD> listaReproduccion = null;
		try {
			listaReproduccion = _bD_Listas_reproduccion.buscarListasReproducionPropias(aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaReproduccion;
	}

	public Usuario_Registrado_BD cargarMeGusta(int aId) {
		Usuario_Registrado_BD usu = null;
		try {
			usu = _bD_Usuarios_Registrados.cargarMeGusta(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	public List<Lista_reproduccion_BD> cargarListasReproduccionPerfilVisitante(int aId) {
		List<Lista_reproduccion_BD> lista = null;
		try {
			lista = _bD_Listas_reproduccion.cargarListasReproduccionPerfilVisitante(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public Usuario_Registrado_BD cargarDatosPerfilVisitante(int aId) {
		Usuario_Registrado_BD usu = null;
		try {
			usu = _bD_Usuarios_Registrados.cargarDatosPerfilVisitante(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	public boolean seguirUsuario(int aIdNavegante, int aIdPerfilVisitante) {
		boolean megusta = false;
		try {
			megusta = _bD_Usuarios_Registrados.seguirUsuario(aIdNavegante, aIdPerfilVisitante);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return megusta;
	}

	public List<Usuario_Registrado_BD> cargarListadoSuscriptores(int aId) {
		List<Usuario_Registrado_BD> lista = null;
		try {
			lista = _bD_Usuarios_Registrados.cargarListadoSuscriptores(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public List<Video_BD> cargarListaUltimosVideos(int aId) {
		List<Video_BD> lista = null;
		try {
			lista = _bD_Videos.cargarListaUltimosVideos(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public boolean anadirVideoLista(int aId, String aNombre) {
		boolean correcto = false;
		try {
			correcto = _bD_Videos.anadirVideoLista(aId, aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;
	}

	public List<Video_BD> cargarVideosListaReproduccionPropia(int aId) {
		List<Video_BD> lista = null;
		try {
			lista = _bD_Videos.cargarVideosListaReproduccionPropia(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public List<Usuario_Registrado_BD> cargarListadoSuscripcionesVisitante(int aId) {
		List<Usuario_Registrado_BD> lista = null;
		try {
			lista = _bD_Usuarios_Registrados.cargarListadoSuscripcionesVisitante(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public boolean eliminarListaReproduccionPropia(int aId) {
		boolean eliminado = false;
		try {
			eliminado = _bD_Listas_reproduccion.eliminarListaReproduccionPropia(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return eliminado;
	}

	public List<Video_BD> buscarVideos(String aNombre) {
		List<Video_BD> videos = null;
		try {
			videos = _bD_Videos.buscarVideos(aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videos;
	}

	public List<Usuario_Registrado_BD> buscarUsuarios(String aNombre) {
		List<Usuario_Registrado_BD> lista = null;
		try {
			lista = _bD_Usuarios_Registrados.buscarUsuarios(aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public Usuario_Registrado_BD cargarMeGustaRegistrado(int aId) {
		Usuario_Registrado_BD usu = null;
		try {
			usu = _bD_Usuarios_Registrados.cargarMeGustaRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	public boolean meGustaRegistrado(int aIdUsuario, int aIdVideo) {
		boolean megusta = false;
		try {

			megusta = _bD_Videos.meGustaRegistrado(aIdUsuario, aIdVideo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return megusta;
	}

	public boolean anadirVideoListaRegistrado(int aId, String aNombre) {
		boolean correcto = false;
		try {
			correcto = _bD_Videos.anadirVideoListaRegistrado(aId, aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return correcto;
	}

	public List<Lista_reproduccion_BD> cargarListaReproduccionCajaRegistrado(int aId) {
		List<Lista_reproduccion_BD> lista = null;
		try {
			lista = _bD_Listas_reproduccion.cargarListaReproduccionCajaRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public List<Video_BD> cargarVideosListaReproduccionVisitante(int aId) {
		List<Video_BD> videos = null;
		try {
			videos = _bD_Videos.cargarVideosListaReproduccionVisitante(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videos;
	}
	
	public boolean eliminarComentario(int aId) {
		throw new UnsupportedOperationException();
	}
	

	public boolean eliminarComentarioAdmin(int aId) {
		throw new UnsupportedOperationException();
	}
	
}