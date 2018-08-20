package ventanas;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
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
	IUsuario_registrado usuR= new BD_Principal();
	List<Lista_reproduccion_BD> listaRepro;
	String nombreLista="";
	
	public Zona_opciones_video_registrado(){
		
		cargarMeGustaRegistrado();
		
		cargarListaReproduccionCajaRegistrado();
		
		me_gusta.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				meGustaRegistrado();
				UI.getCurrent().getNavigator().navigateTo("Ficha_registrado");
			}
		});
		
		descargar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				descargarVideo();
			}
		});
				
		crear_lista_reproduccion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setFicha("FichaRegistradoRegistrado");
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
		
		this.anadirLista.addValueChangeListener(event -> {
		       nombreLista= (String) event.getValue();
		       
		       anadirVideoListaRegistrado();
		       
	      });
	
	}
	
	@SuppressWarnings("unchecked")
	void cargarListaReproduccionCajaRegistrado() {
		
		listaRepro= usuR.cargarListaReproduccionCajaRegistrado(Datos_Navegante.getIdUsuario());
		
		List<String> items = new ArrayList<String>();

		for (Lista_reproduccion_BD lista : listaRepro) {
			items.add(lista.getNombre());
		}
		items.add("Selecciona Lista");
		
        anadirLista.setItems(items);
        anadirLista.setSelectedItem(items.get(items.size()-1));
		
	}
	
	void anadirVideoListaRegistrado() {
		
		boolean correcto= usuR.anadirVideoListaRegistrado(Datos_Navegante.getIdVideo(), nombreLista);
		  
		if(Boolean.TRUE.equals(correcto)){
	       Notification notification = new Notification("El video se ha añadido correctamente a", ""+ nombreLista, Notification.Type.HUMANIZED_MESSAGE);
	       notification.setDelayMsec(2000);
	       notification.show(Page.getCurrent());	
		}
	}
	
	void cargarMeGustaRegistrado() {
		
		Usuario_Registrado_BD usu= usuR.cargarMeGustaRegistrado(Datos_Navegante.getIdUsuario());
		
		for( Object o: usu.me_gustas.getCollection()){
			Video_BD v=  (Video_BD)o;
			if(v.getId()==Datos_Navegante.getIdVideo()){
				me_gusta.setStyleName("friendly");
				break;
			}else{
				me_gusta.setStyleName("");
				break;
			}
		}
		
		
	}
	
	void meGustaRegistrado() {
		boolean megusta=false;
		
		megusta= usuR.meGustaRegistrado(Datos_Navegante.getIdUsuario(), Datos_Navegante.getIdVideo());
		
		/*
		if(Boolean.TRUE.equals(megusta)){
			me_gusta.setStyleName("friendly");
		}else {
			me_gusta.setStyleName("");
		}*/
		
	}
	
	void descargarVideo() {
		Notification notification = new Notification("Copia el enlace que hay en la descripción", "", Notification.Type.HUMANIZED_MESSAGE);
		notification.setDelayMsec(2000);
	    notification.show(Page.getCurrent());	
    
		String url="http://www.descargaryoutube.com/";
		String osName = System.getProperty("os.name");
		try {
			 if (osName.startsWith("Windows")) {
	                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			 }
		} catch (Exception e) {
		}
}
	
}