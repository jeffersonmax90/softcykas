package ventanas;


import java.util.List;
import java.util.Vector;

import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;



public class Listas_de_reproduccion  extends Listas_de_reproduccion_ventanas{
	/*
	private Label _listas_reproduccionLB;
	private Buton _ver_masB;
	public Zona_cuerpo_perfil_visitante _unnamed_Zona_cuerpo_perfil_visitante_;
	public Vector<Lista_de_reproduccion> _unnamed_Lista_de_reproduccion_ = new Vector<Lista_de_reproduccion>();
	*/
	IUsuario_registrado usuarioR= new BD_Principal();
	
	public Listas_de_reproduccion(){
		cargarListasReproduccionPropias();
	}

	void cargarListasReproduccionPropias() {
		List<Lista_reproduccion_BD> listaRepro= usuarioR.cargarListasReproduccionPerfilVisitante(Datos_Navegante.getIdPerfilvistante());
		horizontal.removeAllComponents();	
		if(listaRepro == null || listaRepro.size() == 0){
			Label l= new Label();
			l.setValue("No tiene ninguna listas de reproducción");
			horizontal.addComponent(l);
		}
		
		for(int i=0;i<listaRepro.size();i++) {
		
			FormLayout form= new FormLayout();
			Button carpeta= new Button();
			Label id= new Label();
			
			Label idCarpeta = new Label();
			Label titulo = new Label();
			int idcarpet= listaRepro.get(i).getId();
			idCarpeta.setValue(String.valueOf(idcarpet));
			idCarpeta.setVisible(false);
			
			carpeta.setHeight("100");
			carpeta.setWidth("150");
			carpeta.setStyleName("huge primary");
			int nlista= i+1;
			carpeta.setCaption("Lista "+nlista);
			titulo.setValue(listaRepro.get(i).getNombre());
			
			carpeta.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					UI.getCurrent().getNavigator().navigateTo("Lista_de_reproduccion");
				}
			});
			
			form.addComponent(carpeta);
			form.addComponent(idCarpeta);
			form.addComponent(titulo);
			
			horizontal.addComponent(form);
			
			
			
		}
		
	}
	
	
	
	
}