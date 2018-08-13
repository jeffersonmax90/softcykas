package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Modificar_lista_reproduccion extends Modificar_lista_reproduccion_ventanas implements View{
	/*
	private Button _modificarB;
	public Listas_reproduccion_propias _unnamed_Listas_reproduccion_propias_;

	public void modificar() {
		throw new UnsupportedOperationException();
	}
	*/
	IUsuario_registrado usuR= new BD_Principal();	
	Lista_reproduccion_BD nombreLista= new Lista_reproduccion_BD();
	
	public Modificar_lista_reproduccion(){
		
		cargarNombreModificarListaReproduccion();
		
	atras.addClickListener(new Button.ClickListener() {		
		public void buttonClick(ClickEvent event) {				
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});
	
	modificar.addClickListener(new Button.ClickListener() {		
		public void buttonClick(ClickEvent event) {	
			
			modificarListaReproduccion();
			
			Notification notification = new Notification("¡Se ha Modificado Correctamente!", "", Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});
	}
	
	void cargarNombreModificarListaReproduccion() {
		
		nombreLista=usuR.cargarNombreModificarListaReproduccion(Datos_Navegante.getIdListaReproducion());
		
		nombre.setValue(nombreLista.getNombre());
	}

	void modificarListaReproduccion() {
		nombreLista.setNombre(nombre.getValue());	
		
		usuR.modificarListaReproducion(nombreLista);
		
	}
	
}