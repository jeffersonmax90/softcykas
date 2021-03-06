package com.example.softcykas;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Video;

import ventanas.Anadir_datos_usuario;
import ventanas.Anadir_datos_video;
import ventanas.Buscador;
import ventanas.Cabecera_buscador;
import ventanas.Cambiar_contrasena;
import ventanas.Cambiar_imagen;
import ventanas.Categorias;
import ventanas.Crear_categoria;
import ventanas.Crear_lista;
import ventanas.Ficha_administrador;
import ventanas.Ficha_invitado;
import ventanas.Ficha_propietario;
import ventanas.Ficha_propietario_ventanas;
import ventanas.Ficha_registrado;
import ventanas.Iniciar_sesion;
import ventanas.Lista_de_reproduccion;
import ventanas.Lista_de_usuarios_registrados;
import ventanas.Lista_historial;
import ventanas.Lista_reproduccion_propia;
import ventanas.Lista_total_videos_subidos;
import ventanas.Lista_ultimos_videos_subidos;
import ventanas.Listado_suscripciones_registrado;
import ventanas.Listado_suscripciones_visitante;
import ventanas.Listado_suscriptores;
import ventanas.Modificar_datos;
import ventanas.Modificar_lista_reproduccion;
import ventanas.Modificar_video;
import ventanas.Perfil_administrador;
import ventanas.Perfil_registrado;
import ventanas.Perfil_visitante;
import ventanas.Recuperar_contrasena;
import ventanas.Registrarse;
import ventanas.Subir_video;
import ventanas.Usuario_administrador;
import ventanas.Usuario_invitado;
import ventanas.Usuario_registrado;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of an HTML page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {
	Navigator navigator;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		getPage().setTitle("GarbiTube");

		navigator = new Navigator(this, this);

		navigator.addView("", new Usuario_invitado());
		navigator.addView("logIn", Iniciar_sesion.class);
		navigator.addView("registrase", Registrarse.class);
		navigator.addView("usuario_invitado", Usuario_invitado.class);
		navigator.addView("recuperar_contrasena", Recuperar_contrasena.class);
		navigator.addView("usuario_registrado", Usuario_registrado.class);
		navigator.addView("usuario_administrador", Usuario_administrador.class);
		navigator.addView("perfil_registrado", Perfil_registrado.class);
		navigator.addView("subir_video", Subir_video.class);
		navigator.addView("modificar_datos", Modificar_datos.class);
		navigator.addView("cambiar_contrasena", Cambiar_contrasena.class);
		navigator.addView("lista_historial", Lista_historial.class);
		navigator.addView("lista_ultimos_videos_subidos", Lista_ultimos_videos_subidos.class);
		navigator.addView("listado_suscriptores", Listado_suscriptores.class);
		navigator.addView("listado_suscripciones_registrado", Listado_suscripciones_registrado.class);
		navigator.addView("Cambiar_imagen", Cambiar_imagen.class);
		navigator.addView("perfil_administrador", Perfil_administrador.class);
		navigator.addView("Crear_categoria", Crear_categoria.class);
		navigator.addView("Lista_de_usuarios_registrados", Lista_de_usuarios_registrados.class);
		navigator.addView("Lista_total_videos_subidos", Lista_total_videos_subidos.class);
		navigator.addView("Ficha_registrado", Ficha_registrado.class);
		navigator.addView("Ficha_administrador", Ficha_administrador.class);
		navigator.addView("Ficha_invitado", Ficha_invitado.class);
		navigator.addView("Ficha_propietario", Ficha_propietario.class);
		navigator.addView("Modificar_video", Modificar_video.class);
		navigator.addView("Crear_lista", Crear_lista.class);
		navigator.addView("Modificar_lista_reproduccion", Modificar_lista_reproduccion.class);
		navigator.addView("Lista_reproduccion_propia", Lista_reproduccion_propia.class);
		navigator.addView("Perfil_visitante", Perfil_visitante.class);
		navigator.addView("Lista_de_reproduccion", Lista_de_reproduccion.class);
		navigator.addView("Listado_suscripciones_visitante", Listado_suscripciones_visitante.class);
		navigator.addView("Buscador", Buscador.class);
		navigator.addView("Categorias",Categorias.class);

		navigator.navigateTo("");
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}