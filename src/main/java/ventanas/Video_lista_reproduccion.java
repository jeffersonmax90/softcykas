package ventanas;

import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Video;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

public class Video_lista_reproduccion extends Video_lista_reproduccion_ventanas {
	/*
	private Buton _quitarB;
	public Lista_reproduccion_propia _unnamed_Lista_reproduccion_propia_;

	public void quitar() {
		throw new UnsupportedOperationException();
	}
	*/

	
	public Video_lista_reproduccion(Video_BD video){
		vertical.removeAllComponents();
		vertical.addComponent(new ventanas.Video(video));
		form.addComponent(this.quitar);
		
			quitar.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					int n= video.getId();
					Datos_Navegante.setIdVideo(n);
					Notification notification = new Notification("Correcto", ""+n, Notification.Type.HUMANIZED_MESSAGE);
					notification.setDelayMsec(2000);
					notification.show(Page.getCurrent());	
					//UI.getCurrent().getNavigator().navigateTo("Modificar_lista_reproduccion");
				};
			
			});
	}
}
	
	
