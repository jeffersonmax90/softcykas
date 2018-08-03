package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;

public class Lista_historial extends Lista_historial_ventanas  implements View{
	/*
	private JLabel _historialLB;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;
	*/
	
	IUsuario_registrado usuRegistrado= new BD_Principal();
	
	public Lista_historial(){
		cargarHistorial();
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});
	}

	void cargarHistorial() {
		formLista.removeAllComponents();

		List<Video_BD> lista= usuRegistrado.cargarHistorial(Datos_Navegante.getIdUsuario());
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