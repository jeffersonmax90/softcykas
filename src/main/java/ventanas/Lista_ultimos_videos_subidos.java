package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Lista_ultimos_videos_subidos extends Lista_ultimos_videos_subidos_ventanas  implements View{
	/*
	private JLabel _ultimos_videosLB;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;
	*/
	
	IUsuario_registrado usuRegistrado= new BD_Principal();
	
	
	public Lista_ultimos_videos_subidos(){
		cargarListaUltimoVideos();
		
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				
			}
		});
	}

	void cargarListaUltimoVideos() {
		formLista.removeAllComponents();

		List<Video_BD> lista= usuRegistrado.cargarListaUltimosVideos(Datos_Navegante.getIdUsuario());
		if(lista == null || lista.size() == 0){
			Label l= new Label();
			l.setValue("La Lista esta Vacía");
			formLista.addComponent(l);
		}
			for (int i = 0; i < lista.size(); i++) {
				formLista.addComponent(new Video(lista.get(i)));
			}
		
	}
}