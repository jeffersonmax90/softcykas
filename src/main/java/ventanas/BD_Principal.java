package ventanas;

import java.util.ArrayList;
import java.util.Iterator;
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
		boolean correcto= false;
		
		 try {
			correcto=_bD_Videos.nuevoVideo(aVideo);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		 return correcto;
		 
	}

	public boolean modificarVideo(Video_BD aVideo) {
		boolean modificado= false;
		try {
			modificado= _bD_Videos.actualizarVideo(aVideo);
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
		List<Video_BD> videos = null;
		try {
			videos = _bD_Videos.cargar_videos_tendencias();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return videos;
	}

	public List<Video_BD> cargarVideosUsuarioRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario_BD iniciarSesion(String aEmail, String aContrasena) {
			
			Usuario_BD usuario=new Usuario_BD();
			
				 try {
					usuario=_bD_Usuarios_Registrados.iniciarSesion(aEmail, aContrasena);
				} catch (PersistentException e) {
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
		List<Usuario_Registrado_BD> u=null;
		try {
			u=_bD_Usuarios_Registrados.cargarlistaUsuarioRegistrados(aId);
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
		boolean correcto=false;
		try {
			_bD_Usuarios_Registrados.eliminarUsuarioListaRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return correcto;
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
		boolean modificado= false;
		try {
			modificado= _bD_Listas_reproduccion.modificarListaReproducion(aLista);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modificado;
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
		boolean correcto= false;
		 try {
			correcto=_bD_Listas_reproduccion.crearLista(aLista);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return correcto;
		 
	}

	public List<Lista_reproduccion_BD> cargarListasReproduccionPropias(int aId) {
		List<Lista_reproduccion_BD> lista=null;
		try {
			lista=_bD_Listas_reproduccion.cargarListasReproduccionPropias(aId);
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
		boolean megusta= false;
		try {
			
			megusta= _bD_Videos.meGusta(aIdUsuario, aIdVideo);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return megusta;
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
		boolean borrado=false;
		try {
			borrado=_bD_Videos.eliminarVideoSubido(aId);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return borrado;
	}
	
	public Usuario_Registrado_BD cargarModificarDatos(int aId) {
		Usuario_Registrado_BD usu= null;
		try {
			usu= _bD_Usuarios_Registrados.cargarModificarDatos(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}
	//TODO	
	public List<Usuario_Registrado_BD> buscarUsuarioListaRegistado(String aNombre) {
		List<Usuario_Registrado_BD> lista=null;
		try {
			lista= _bD_Usuarios_Registrados.buscarUsuarioListaRegistado(aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public Usuario_BD cargarImagenAdministrador(int aId) {
		Usuario_BD usu= null;
		try {
			usu= _bD_Usuarios_Administradores.cargarImagenAdministardor(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	public boolean cambiarImagenAdministrador(int aId, String aRuta) {
		boolean cambiado= false;
		try {
			cambiado= _bD_Usuarios_Administradores.cambiarImagenAdministrador(aId, aRuta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cambiado;
	}
	
	public Video_BD cargarModificarVideo(int aId) {
		Video_BD video= null;
		try {
			video=_bD_Videos.cargarModificarVideo(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return video;
	}
	
	public List<Video_BD> buscarVideosPropios(String aNombre) {
		List<Video_BD> lista=null;
		try {
			lista= _bD_Videos.buscarVideosPropios(aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	public Usuario_Registrado_BD cargarImagenRegistrado(int aId) {
		Usuario_Registrado_BD usu= null;
		try {
			usu= _bD_Usuarios_Registrados.cargarImagenRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}

	public Video_BD cargarFichaVideoAdmin(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video_BD cargarFichaVideoNoRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video_BD cargarFichaVideoRegistrado(int aId) {
		Video_BD video= null;
		try {
			video=_bD_Videos.cargarFichaVideoRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return video;
	}
	
	public Lista_reproduccion_BD cargarNombreModificarListaReproduccion(int aId) {
		Lista_reproduccion_BD listaReproduccion= null;
		try {
			listaReproduccion= _bD_Listas_reproduccion.cargarNombreModificarListaReproduccion(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaReproduccion;
	}
	
	public Usuario_Registrado_BD cargarNombrePerfilRegistrado(int aId) {
		Usuario_Registrado_BD usu= null;
		try {
			usu= _bD_Usuarios_Registrados.cargarNombrePerfilRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}
	public List<Lista_reproduccion_BD> buscarListasReproducionPropias(String aNombre) {
		List<Lista_reproduccion_BD> listaReproduccion=null;
		try {
			listaReproduccion= _bD_Listas_reproduccion.buscarListasReproducionPropias(aNombre);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaReproduccion;
	}
	
	public Usuario_Registrado_BD cargarMeGusta(int aId) {
		Usuario_Registrado_BD usu= null;
		try {
			usu= _bD_Usuarios_Registrados.cargarImagenRegistrado(aId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usu;
	}
}