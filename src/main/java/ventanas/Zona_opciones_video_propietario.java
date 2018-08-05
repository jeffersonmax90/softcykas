package ventanas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.JOptionPane;

import com.mysql.fabric.xmlrpc.base.Value;
import com.vaadin.data.HasValue.ValueChangeEvent;
import com.vaadin.data.HasValue.ValueChangeListener;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;

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
	
	IUsuario_registrado usuR= new BD_Principal();
	List<Lista_reproduccion_BD> listaRepro;
	String nombreLista="";
	
	@SuppressWarnings("unchecked")
	public Zona_opciones_video_propietario(){
		cargarMeGusta();
		cargarListasReproducionCaja();
		
		me_gusta.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				meGusta();
			}
		});
		
		descargar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				descargarVideo();
			}

			
		});
				
		crear_lista_reproduccion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setFicha("FichaRegistradoPropietario");
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
		
		
		 this.anadirLista.addValueChangeListener(event -> {
		       nombreLista= (String) event.getValue();
		       anadirVideoLista();
		       
	      });
		
		eliminar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				eliminarVideoUR();
			}

		});
		
	}

	@SuppressWarnings("unchecked")
	void cargarListasReproducionCaja() {
		listaRepro= usuR.cargarListasReproducionCaja(Datos_Navegante.getIdUsuario());
		List<String> items = new ArrayList<String>();

		/*if (listaRepro.isEmpty()) {
			Notification notification = new Notification(
					"Sentimos las molestias, no puede añadir video hasta que no haya categorías",
					Notification.Type.HUMANIZED_MESSAGE);
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
		}*/
		
		for (Lista_reproduccion_BD lista : listaRepro) {
			items.add(lista.getNombre());
		}
		items.add("Selecciona Lista");
		
		anadirLista.setItems(items);
		anadirLista.setSelectedItem(items.get(items.size()-1));
		
	}


	void anadirVideoLista() {
		boolean correcto= usuR.anadirVideoLista(Datos_Navegante.getIdVideo(), nombreLista);
		  
		if(Boolean.TRUE.equals(correcto)){
	       Notification notification = new Notification("El video se ha añadido correctamente a", ""+ nombreLista, Notification.Type.HUMANIZED_MESSAGE);
	       notification.setDelayMsec(2000);
	       notification.show(Page.getCurrent());	
		}
	}

	void cargarMeGusta() {
		Usuario_Registrado_BD usu= usuR.cargarMeGusta(Datos_Navegante.getIdUsuario());
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


	void meGusta() {
		boolean megusta=false;
		megusta= usuR.meGusta(Datos_Navegante.getIdUsuario(), Datos_Navegante.getIdVideo());
		
		if(Boolean.TRUE.equals(megusta)){
			me_gusta.setStyleName("friendly");
		}else {
			me_gusta.setStyleName("");
		}
		UI.getCurrent().getNavigator().navigateTo("Ficha_registrado");

	}
	
	void eliminarVideoUR() {
		boolean eliminado=false;
		eliminado= usuR.eliminarVideoUR(Datos_Navegante.getIdVideo());
		
				
		if(Boolean.TRUE.equals(eliminado)){
			Notification notification = new Notification("¡Se ha eliminado el video con éxito!", "", Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
		}
		
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