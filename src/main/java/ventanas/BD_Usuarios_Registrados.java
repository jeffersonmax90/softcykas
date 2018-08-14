package ventanas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Usuario_Registrado_BD;

public class BD_Usuarios_Registrados {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Usuario_Registrado_BD> _usuarios_Registrados = new Vector<Usuario_Registrado_BD>();

	public boolean nuevoUsuario(Usuario_Registrado_BD aUsuario) throws PersistentException {
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Historial_BD h = new Historial_BD();
			aUsuario.setHistorial(h);
			Usuario_Registrado_BDDAO.save(aUsuario);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			return false;
		}

		return true;
	}

	public void comprobarUsuario() {
		throw new UnsupportedOperationException();
	}

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario) throws PersistentException {
		boolean modificado = false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();

		try {
			Usuario_Registrado_BD usu = Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(aUsuario.getId());
			usu.setNombre(aUsuario.getNombre());
			usu.setApellidos(usu.getApellidos());
			usu.setApodo(usu.getApodo());
			usu.setEmail(usu.getEmail());
			usu.setContraseña(usu.getContraseña());
			usu.setMiniatura(usu.getMiniatura());
			Usuario_Registrado_BDDAO.save(usu);
			t.commit();
			modificado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return modificado;
	}

	public boolean dejarSeguir(int aId) throws PersistentException {
		boolean dejarSeguir = false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Usuario_Registrado_BD us1 = Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(aId);
			Usuario_Registrado_BD us2 = Usuario_Registrado_BDDAO
					.loadUsuario_Registrado_BDByORMID(Datos_Navegante.getIdUsuario());
			us2.suscriptor.remove(us1);
			us1.suscrito.remove(us2);
			Usuario_Registrado_BDDAO.save(us1);
			Usuario_Registrado_BDDAO.save(us2);
			t.commit();
			dejarSeguir = true;
		} catch (Exception e) {
			t.rollback();
		}
		return dejarSeguir;
	}

	public List<Usuario_Registrado_BD> cargarListadoSuscripciones(int aId) throws PersistentException {
		List<Usuario_Registrado_BD> lista = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Usuario_Registrado_BD u = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista = Arrays.asList(u.suscriptor.toArray());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
	}

	public Usuario_BD iniciarSesion(String aEmail, String aContrasena) throws PersistentException {
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		Usuario_BD usuario = new Usuario_BD();
		usuario.setTipoUsuario("incorrecto");

		try {
			for (Object usr : Usuario_BDDAO.queryUsuario_BD(null, null)) {
				Usuario_BD usu = (Usuario_BD) usr;
				if (usu.getEmail().equals(aEmail) && usu.getContraseña().equals(aContrasena)) {
					usuario = usu;
					break;
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usuario;
	}

	public boolean cambiarContrasena(String aContNuevas, String aContActual, String aContRepetir)
			throws PersistentException {
		boolean modificado = false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();

		try {
			Usuario_Registrado_BD usu = Usuario_Registrado_BDDAO
					.loadUsuario_Registrado_BDByORMID(Datos_Navegante.getIdUsuario());

			if (usu.getContraseña().equals(aContActual)) {
				usu.setContraseña(aContNuevas);
				Usuario_Registrado_BDDAO.save(usu);
				t.commit();
				modificado = true;
			}

		} catch (Exception e) {
			t.rollback();
		}
		return modificado;

	}

	public List<Usuario_Registrado_BD> cargarlistaUsuarioRegistrados(int aId) throws PersistentException {
		List<Usuario_Registrado_BD> u = null;

		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			u = Usuario_Registrado_BDDAO.queryUsuario_Registrado_BD(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return u;
	}

	public boolean eliminarUsuarioListaRegistrado(int aId) throws PersistentException {
		boolean salida = false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		
		Usuario_Registrado_BD user = Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(aId);
		try {

			for (Video_BD vid : user.video_subido.toArray()) {
				Video_BD video = Video_BDDAO.loadVideo_BDByORMID(vid.getORMID());
				List<Lista_reproduccion_BD> listas = Arrays
						.asList(Lista_reproduccion_BDDAO.listLista_reproduccion_BDByQuery(null, null));
				List<Usuario_Registrado_BD> usuarios = Arrays
						.asList(Usuario_Registrado_BDDAO.listUsuario_Registrado_BDByQuery(null, null));
				List<Comentario_BD> comentarios = Arrays.asList(Comentario_BDDAO.listComentario_BDByQuery(null, null));
				List<Historial_BD> historials = Arrays.asList(Historial_BDDAO.listHistorial_BDByQuery(null, null));

				for (Lista_reproduccion_BD lista : listas) {
					if (lista.video.contains(video)) {
						lista.video.remove(video);
					}
					Lista_reproduccion_BDDAO.save(lista);
				}
				for (Historial_BD historial : historials) {
					if (historial.video.contains(vid)) {
						historial.video.remove(vid);
					}
					Historial_BDDAO.save(historial);
				}
				for (Usuario_Registrado_BD usuario : usuarios) {

					if (usuario.me_gustas.contains(video)) {
						usuario.me_gustas.remove(video);
					}
					if (usuario.video_subido.contains(video)) {
						usuario.video_subido.remove(video);
					}
					Usuario_Registrado_BDDAO.save(usuario);
				}
				for (Comentario_BD comentario : comentarios) {
					if (comentario.getVideo().equals(video)) {
						Comentario_BDDAO.delete(comentario);
					}
				}

				Video_BDDAO.delete(video);
			}

			for (Usuario_Registrado_BD u : Usuario_Registrado_BDDAO.listUsuario_Registrado_BDByQuery(null, null)) {
				if (u.suscrito.contains(user)) {
					u.suscrito.remove(user);
				}
				if (u.suscriptor.contains(user)) {
					u.suscriptor.remove(user);
				}
				Usuario_Registrado_BDDAO.save(u);
			}

			for (Comentario_BD comentario : Comentario_BDDAO.listComentario_BDByQuery(null, null)) {
				if (comentario.getUsuario().equals(user)) {
					for (Video_BD video : Video_BDDAO.listVideo_BDByQuery(null, null)) {
						if (video.comentarios.contains(comentario)) {
							video.comentarios.remove(comentario);
							Video_BDDAO.save(video);
						}

					}
					Comentario_BDDAO.delete(comentario);
				}

			}

			for (Lista_reproduccion_BD lista : Lista_reproduccion_BDDAO.listLista_reproduccion_BDByQuery(null, null)) {
				if (lista.getUsuario().getId() == (user.getId())) {
					Lista_reproduccion_BDDAO.deleteAndDissociate(lista);
					for (Video_BD video : Video_BDDAO.listVideo_BDByQuery(null, null)) {
						if (video.listas_reproduccion.contains(lista)) {
							video.listas_reproduccion.remove(lista);
							Video_BDDAO.save(video);
						}

					}
				}
				Lista_reproduccion_BDDAO.delete(lista);
			}
			Usuario_Registrado_BDDAO.deleteAndDissociate(user);
			Usuario_Registrado_BDDAO.delete(user);
			t.commit();
			salida = true;
		} catch (PersistentException e) {
			t.rollback();
		}
		return salida;
	}

	public Usuario_Registrado_BD cargarModificarDatos(int aId) throws PersistentException {
		Usuario_Registrado_BD usu = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			usu = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usu;
	}

	public List<Usuario_Registrado_BD> buscarUsuarioListaRegistado(String aNombre) throws PersistentException {
			List<Usuario_Registrado_BD> usuarios = new ArrayList<Usuario_Registrado_BD>();
			Usuario_Registrado_BDCriteria cat = new Usuario_Registrado_BDCriteria();

			cat.nombre.like("%" + aNombre + "%");
			for (Usuario_Registrado_BD u : Usuario_Registrado_BDDAO.listUsuario_Registrado_BDByCriteria(cat)) {
				usuarios.add(u);
			}

		return usuarios;
	}

	public Usuario_Registrado_BD cargarDatosPerfilRegistrado(int aId) throws PersistentException {
		Usuario_Registrado_BD usu = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			usu = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usu;
	}

	public Usuario_Registrado_BD cargarNombrePerfilRegistrado(int aId) throws PersistentException {
		Usuario_Registrado_BD usu = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Usuario_Registrado_BD usuario = Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(aId);

			usu = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usu;
	}

	public Usuario_Registrado_BD cargarMeGusta(int aId) throws PersistentException {
		Usuario_Registrado_BD usu = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			usu = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usu;
	}

	public Usuario_Registrado_BD cargarDatosPerfilVisitante(int aId) throws PersistentException {
		Usuario_Registrado_BD usu = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			usu = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			int numVis = usu.getN_visitas();
			int total = numVis + 1;
			usu.setN_visitas(total);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usu;
	}

	public boolean seguirUsuario(int aIdNavegante, int aIdPerfilVisitante) throws PersistentException {
		boolean seguirUsuario = false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Usuario_Registrado_BD visitante = Usuario_Registrado_BDDAO
					.getUsuario_Registrado_BDByORMID(aIdPerfilVisitante);
			if (Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aIdNavegante).suscriptor.contains(visitante)) {
				Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aIdNavegante).suscriptor.remove(visitante);
				seguirUsuario = false;
			} else {
				Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aIdNavegante).suscriptor.add(visitante);
				seguirUsuario = true;
			}
			t.commit();
		} catch (Exception e) {

		}

		return seguirUsuario;

	}

	public List<Usuario_Registrado_BD> cargarListadoSuscriptores(int aId) throws PersistentException {
		List<Usuario_Registrado_BD> lista = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Usuario_Registrado_BD u = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista = Arrays.asList(u.suscrito.toArray());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
	}

	public List<Usuario_Registrado_BD> cargarListadoSuscripcionesVisitante(int aId) throws PersistentException {
		List<Usuario_Registrado_BD> lista = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Usuario_Registrado_BD u = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista = Arrays.asList(u.suscriptor.toArray());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
	}

	public List<Usuario_Registrado_BD> buscarUsuarios(String aNombre) throws PersistentException {
		List<Usuario_Registrado_BD> usuarios = new ArrayList<Usuario_Registrado_BD>();
			Usuario_Registrado_BDCriteria cat = new Usuario_Registrado_BDCriteria();

			cat.nombre.like("%" + aNombre + "%");
			for (Usuario_Registrado_BD u : Usuario_Registrado_BDDAO.listUsuario_Registrado_BDByCriteria(cat)) {
				usuarios.add(u);
			}

		return usuarios;
	}

	public Usuario_Registrado_BD cargarMeGustaRegistrado(int aId) throws PersistentException {
		Usuario_Registrado_BD usu = null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			usu = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usu;
	}

}