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
	IUsuario_registrado usuR= new BD_Principal();
	
	public Zona_opciones_video_registrado(){
		cargarMeGusta();
		
		me_gusta.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				meGusta();
			}
		});
		
		descargar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
				
		crear_lista_reproduccion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setFicha("FichaRegistradoRegistrado");
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
		
		anadir_lista.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
	
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
		
	}
	
	
}