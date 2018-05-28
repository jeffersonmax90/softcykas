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
import ventanas.Ficha_administrador;
import ventanas.Ficha_invitado;
import ventanas.Ficha_propietario;
import ventanas.Ficha_propietario_ventanas;
import ventanas.Ficha_registrado;
import ventanas.Iniciar_sesion;
import ventanas.Lista_de_reproduccion;
import ventanas.Lista_de_usuarios_registrados;
import ventanas.Lista_usuarios;
import ventanas.Lista_videos;
import ventanas.Lista_videos_agenos;
import ventanas.Lista_videos_agenos_ventanas;
import ventanas.Lista_videos_buscados;
import ventanas.Lista_videos_ventanas;
import ventanas.Listado_suscripciones_visitante_ventanas;
import ventanas.Listado_suscriptores;
import ventanas.Listado_suscriptores_ventanas;
import ventanas.Listas_de_reproduccion_ventanas;
import ventanas.Modificar_datos;
import ventanas.Modificar_video;
import ventanas.Perfil_administrador;
import ventanas.Perfil_registrado;
import ventanas.Perfil_visitante;
import ventanas.Perfil_visitante_ventanas;
import ventanas.Registrarse;
import ventanas.Subir_video;
import ventanas.Subir_video_ventanas;
import ventanas.Usuario_invitado;
import ventanas.Usuario_registrado;
import ventanas.Video_lista_reproduccion;
import ventanas.Videos_de_suscripciones;
import ventanas.Videos_de_suscripciones_ventanas;
import ventanas.Videos_relacionados;
import ventanas.Videos_tendencia;
import ventanas.Videos_usuarios_registrados;
import ventanas.Zona_cabecera_perfil_visitante_ventanas;
import ventanas.Zona_cuerpo_perfil_visitante;
import ventanas.Zona_inicio_cabecera_invitado;
import ventanas.Zona_inicio_cabecera_registrado;
import ventanas.Zona_inicio_cabecera_registrado_ventanas;
import ventanas.Zona_inicio_comun;
import ventanas.Zona_inicio_comun_ventanas;
import ventanas.Zona_inicio_cuerpo_invitado;
import ventanas.Zona_inicio_cuerpo_invitado_ventanas;
import ventanas.Zona_inicio_cuerpo_registrado;

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
		navigator.addView("logIn", new Iniciar_sesion());
		
		navigator.navigateTo("");
		
		/*
		 * Lista_videos_buscados lky = new Lista_videos_buscados();
		 * Video_lista_reproduccion vl= new Video_lista_reproduccion();
		 * 
		 * Anadir_datos_usuario alta_usuario= new Anadir_datos_usuario();
		 * Usuario_invitado ui= new Usuario_invitado(); Usuario_registrado ur= new
		 * Usuario_registrado();
		 * 
		 * //Perfiles Perfil_administrador pa= new Perfil_administrador();
		 * Perfil_visitante pv= new Perfil_visitante(); Perfil_registrado pr= new
		 * Perfil_registrado();
		 * 
		 * //Fichas de video Ficha_invitado fi= new Ficha_invitado(); Ficha_registrado
		 * fr= new Ficha_registrado(); Ficha_propietario fp= new Ficha_propietario();
		 * 
		 * 
		 * Listado_suscriptores lurd= new Listado_suscriptores(); Subir_video_ventanas
		 * svni = new Subir_video_ventanas();
		 * 
		 * Modificar_datos rt= new Modificar_datos(); Registrarse r= new Registrarse();
		 * setContent(r);
		 */
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}