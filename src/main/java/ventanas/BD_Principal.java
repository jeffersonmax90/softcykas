package ventanas;

import java.util.List;

import org.orm.PersistentException;

public class BD_Principal implements IAdministrador, IUsuario_no_registrado, IUsuario_registrado {
	public BD_Videos _bD_Videos= new BD_Videos();
	public BD_Usuarios_Administradores _bD_Usuarios_Administradores = new BD_Usuarios_Administradores();
	public BD_Usuarios_Registrados _bD_Usuarios_Registrados = new BD_Usuarios_Registrados();
	public BD_Categorias _bD_Categorias= new BD_Categorias();
	public BD_Comentarios _bD_Comentarios = new BD_Comentarios();
	public BD_Listas_reproduccion _bD_Listas_reproduccion= new BD_Listas_reproduccion();
	public BD_Historial _bD_Historial = new BD_Historial();

	public boolean subirVideo(Video_BD aVideo) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarVideo(Video_BD aVideo) {
		throw new UnsupportedOperationException();
	}

	public boolean registrarUsuario(Usuario_Registrado_BD aUsuario) {
			
			try {
				return _bD_Usuarios_Registrados.nuevoUsuario(aUsuario);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}

	public List cargar_videos_tendencias() {
		throw new UnsupportedOperationException();
	}

	public List cargarVideosUsuariosRegistrados() {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarHistorial(int aId) {
		throw new UnsupportedOperationException();
	}

	public List cargar_categorias_videos() {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideosTendencia() {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideosUsuarioRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario_BD iniciarSesion(String aEmail, String aContrasena) {
			
			Usuario_BD usuario=new Usuario_BD();
			
				 try {
					usuario=_bD_Usuarios_Registrados.iniciarSesion(aEmail, aContrasena);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 return usuario;
				 
			
		}

	public List<Video_BD> cargarVideosRelacionados(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideo(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video_BD descargarVideoUA(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean crearCategorias(String aNombre, String aEdad) {
		boolean correcto= false;
		try {
			correcto=_bD_Categorias.crearCategorias(aNombre, aEdad);
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
		throw new UnsupportedOperationException();
	}

	public List<Usuario_Registrado_BD> cargarlistaUsuarioRegistrados(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoListaSubido(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> buscarVideoListaTotal(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarUsuarioListaRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Usuario_Registrado_BD> buscarUsuarioListaRegistado(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarListaUltimoVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean anadirComentario(int aId, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public List<Comentario_BD> cargarListaComentarios(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarListaUltimosVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Comentario_BD> anadirComentarios(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarListaReproducion(Lista_reproduccion_BD aLista) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario) {
		boolean modificado= false;
		try {
			modificado= _bD_Usuarios_Registrados.modificarDatos(aUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modificado;
	}

	public boolean crearLista(Lista_reproduccion_BD aLista) {
		throw new UnsupportedOperationException();
	}

	public List<Lista_reproduccion_BD> cargarListasReproduccionPropias(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideosPropios(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean meGusta(int aId, boolean aValor) {
		throw new UnsupportedOperationException();
	}

	public Video_BD descargarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<String> cargarComboBoxAnadirLista(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarContrasena(String aContrasenanueva, String aRepetirContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiarcontrasena(String aContNueva, String aContActual, String aContRepetir) {
		boolean modificado= false;
		try {
			modificado= _bD_Usuarios_Registrados.cambiarContrasena(aContNueva, aContActual, aContRepetir);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cat;
	}

	public boolean quitarVideo(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean dejarSeguir(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Usuario_BD> cargarListadoSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideosSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoSubido(int aId) {
		throw new UnsupportedOperationException();
	}
	
	public Usuario_Registrado_BD cargarModificarDatos(int aId) {
		Usuario_Registrado_BD usu= null;
		try {
			usu= _bD_Usuarios_Registrados.cargarModificarDatos(aId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return usu;
	}
	
	
}