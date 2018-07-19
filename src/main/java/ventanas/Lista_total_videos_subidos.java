package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Lista_total_videos_subidos extends Lista_total_videos_subidos_ventanas implements View{
	/*
	 * private TextField _buscar_videoTF; private Button _buscar_videoB; private
	 * Vector _videos_administradorV; public Zona_opciones_administrador
	 * _unnamed_Zona_opciones_administrador_;
	 */
	
	
	
	public Lista_total_videos_subidos(){
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				
			}
		});
	}
}