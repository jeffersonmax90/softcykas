package ventanas;

import java.util.Date;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Embedded;

public class Ficha_video extends Ficha_video_ventanas {
	/*
	 * private Video _stream; private Button _nombre_perfil_usuarioB; private Label
	 * _descripcion_videoLB; private Label _etiquetaLB; private Label _categoriaLB;
	 * private Label _fechaLB; private Label _titulo_videoLB; private Label
	 * _n_me_gustaLB; private Label _n_visualizacionesLB; public Perfil_visitante
	 * _unnamed_Perfil_visitante_;
	 * 
	 * public void reproducir() { throw new UnsupportedOperationException(); }
	 */
	IUsuario_registrado usuR = new BD_Principal();
	IUsuario_no_registrado usuNoR = new BD_Principal();
	IAdministrador admin = new BD_Principal();
	private int idAutor;

	public Ficha_video() {
		// TODO Auto-generated constructor stub

		cargarFichaVideoRegistrado();

	}

	void cargarFichaVideoRegistrado() {
		Video_BD v = usuR.cargarFichaVideoRegistrado(Datos_Navegante.getIdVideo());
		Embedded vid = new Embedded(null, new ExternalResource(v.getRuta()));
		System.out.println(v.getRuta());
		vid.setMimeType("application/x-shockwave-flash");
		vid.setParameter("allowFullScreen", "true");
		vid.setWidth("800px");
		vid.setHeight("480px");
		layoutReproductor.addComponent(vid);

		titulo_video.setValue(v.getTitulo());
		int visualizaciones = v.getVisualizaciones();
		String n = "";
		n = String.valueOf(visualizaciones);
		Date d = v.getFecha_subida();
		String fecha = String.valueOf(d);
		nombre_usuario.setCaption(v.getPropietario().getNombre());
		nombre_usuario.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});

		numero_me_gusta.setValue(n);
		fecha_subida.setValue(fecha);
		descripcion_video.setValue(v.getDescripcion());
		categoria.setValue(v.getCategoria_BD().getNombre() + " " + v.getCategoria_BD().getEdad());
		etiquetas.setValue(v.getEtiqueta());
		idAutor = v.getPropietario().getORMID();
		this.nombre_usuario.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {

				int idvisitante = v.getPropietario().getId();
				// Datos_Navegante.setIdUsuario(idvisitante);

				if (Datos_Navegante.getTipoUsuario().equals("Invitado")) {
					UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
				} else if (Datos_Navegante.getTipoUsuario().equals("Registrado")) {
					if (Datos_Navegante.getIdUsuario() == idAutor) {
						UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
					} else {

						UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
					}
				} else {
					UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
				}

				UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
			}
		});

	}

}