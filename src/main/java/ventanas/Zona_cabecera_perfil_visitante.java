package ventanas;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_cabecera_perfil_visitante extends Zona_cabecera_perfil_visitante_ventanas {
	IUsuario_registrado usuR = new BD_Principal();

	public Zona_cabecera_perfil_visitante() {

		cargarDatosPerfilVisitante();

		ver_listado_suscriptores.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {

				UI.getCurrent().getNavigator().navigateTo("listado_suscriptores");
			}
		});

		ver_listado_suscripciones.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Listado_suscripciones_visitante");
			}
		});

		suscribirse.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				seguirUsuario();
			}
		});

		logo.addClickListener(new ClickListener() {
			@Override
			public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
				if (Datos_Navegante.getTipoUsuario().equals("Invitado")) {
					UI.getCurrent().getNavigator().navigateTo("");
				} else if (Datos_Navegante.getTipoUsuario().equals("Registrado")) {

					UI.getCurrent().getNavigator().navigateTo("usuario_registrado");
				} else {
					UI.getCurrent().getNavigator().navigateTo("usuario_administrador");
				}
			}
		});

	}

	void cargarDatosPerfilVisitante() {
		Usuario_Registrado_BD usu = usuR.cargarDatosPerfilVisitante(Datos_Navegante.getIdPerfilvistante());

		logo.setSource(new ExternalResource(
				"https://raw.githubusercontent.com/jeffersonmax90/softcykas/master/src/main/resources/images/logo.png"));

		nVisitas.setValue(String.valueOf(usu.getN_visitas()));
		nSuscriptores.setValue(String.valueOf(usu.suscrito.getCollection().size()));
		nSuscripciones.setValue(String.valueOf(usu.suscriptor.getCollection().size()));
		imagen.setSource(new ExternalResource(usu.getMiniatura()));

		if (Datos_Navegante.getTipoUsuario().equals("Registrado")) {
			Usuario_Registrado_BD usuNavegante = usuR.cargarDatosPerfilVisitante(Datos_Navegante.getIdUsuario());
			for (Object o : usuNavegante.suscriptor.getCollection()) {
				Usuario_Registrado_BD u = (Usuario_Registrado_BD) o;
				if (u.getId() == Datos_Navegante.getIdPerfilvistante()) {
					suscribirse.setStyleName("friendly");
					break;
				} else {
					suscribirse.setStyleName("");
					break;
				}

			}
			nombre.setValue(usu.getNombre() + " " + usu.getApellidos());
		} else {
			suscribirse.setVisible(false);
			nombre.setValue(usu.getNombre() + " " + usu.getApellidos());

		}
	}

	void seguirUsuario() {
		boolean seguirUsuario = false;

		seguirUsuario = usuR.seguirUsuario(Datos_Navegante.getIdUsuario(), Datos_Navegante.getIdPerfilvistante());

		if (Boolean.TRUE.equals(seguirUsuario)) {
			suscribirse.setStyleName("friendly");
		} else {
			suscribirse.setStyleName("");
		}
		cargarDatosPerfilVisitante();
	}

}