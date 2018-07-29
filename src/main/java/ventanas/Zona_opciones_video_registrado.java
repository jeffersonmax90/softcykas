package ventanas;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_opciones_video_registrado extends Zona_opciones_video_registrado_ventanas {
	/*
	 * private Button _megustaB; private Button _descargar_video; private ComboBox
	 * _anadir_listaCB; private Botton _crearListaB; public Ficha_registrado
	 * _unnamed_Ficha_registrado_; public Crear_lista _unnamed_Crear_lista_;
	 * 
	 * public void descargar_video() { throw new UnsupportedOperationException(); }
	 * 
	 * public void me_gusta() { throw new UnsupportedOperationException(); }
	 */
	
	public Zona_opciones_video_registrado(){
		
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
	
	}
	
	
}