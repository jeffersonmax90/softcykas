package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Crear_lista extends Crear_lista_ventanas implements View{
	/*
	private JTextFiel _nombre_listaJTF;
	private JLabel _nombre_listaJL;
	private Button _crearB;
	private video _video;
	public Zona_opciones_video_registrado _unnamed_Zona_opciones_video_registrado_;
	public Zona_opciones_video_propietario _unnamed_Zona_opciones_video_propietario_;
	*/
	IUsuario_registrado usuR= new BD_Principal();
	Lista_reproduccion_BD lista = new Lista_reproduccion_BD();
	
	public Crear_lista(){
		
		atras.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Ficha_propietario");
			}
		});
		
		crearNuevaLista.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				crearLista();
			}
		});
	}
	
	
	void crearLista() {
		lista.setNombre(nombreLista.getValue());
		usuR.crearLista(lista);
		Notification notification = new Notification("¡Se Creado la lista correctamente!", "", Notification.Type.HUMANIZED_MESSAGE);
		notification.setDelayMsec(2000);
		notification.show(Page.getCurrent());
		UI.getCurrent().getNavigator().navigateTo("Ficha_propietario");
	}
		
		
}