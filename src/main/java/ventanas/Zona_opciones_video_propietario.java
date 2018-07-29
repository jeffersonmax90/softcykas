package ventanas;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_opciones_video_propietario extends Zona_opciones_video_propietario_ventanas {
	/*
	 * private Button _megustaB; private Button _eliminar_videoB; private Button
	 * _descargarB; private JCombox _anadir_listaJC; private Button _crearListaB;
	 * public Ficha_propietario _unnamed_Ficha_propietario_; public
	 * Confirmar_eliminar_video _unnamed_Confirmar_eliminar_video_; public
	 * Crear_lista _unnamed_Crear_lista_;
	 * 
	 * public void descargar_video() { throw new UnsupportedOperationException(); }
	 * 
	 * public void eliminar_video() { throw new UnsupportedOperationException(); }
	 * 
	 * public void me_gusta() { throw new UnsupportedOperationException(); }
	 */
	
	
	public Zona_opciones_video_propietario(){
	
		me_gusta.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
		
		descargar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
				
		crear_lista_reproduccion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
		
		anadir_lista.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
		
		eliminar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
	
	}
	
}