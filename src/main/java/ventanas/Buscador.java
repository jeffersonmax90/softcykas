package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import java.util.List;

public class Buscador extends Buscador_ventanas implements View{
	/*private JComboBox _ordenarCB;
	public Zona_inicio_cabecera_invitado _unnamed_Zona_inicio_cabecera_invitado_;
	public Zona_inicio_cabecera_registrado _unnamed_Zona_inicio_cabecera_registrado_;
	public Lista_usuarios _unnamed_Lista_usuarios_;
	public Lista_videos_buscados _unnamed_Lista_videos_buscados_;*/
	
	
	IUsuario_no_registrado usuNoRegistrado= new BD_Principal();
	
	public Buscador(){
		
		vertical.removeAllComponents();
		vertical.addComponent(new Zona_inicio_cabecera_invitado());
		
		this.formLista.removeAllComponents();
		
		if(Datos_Navegante.getTipoBusqueda().equals("Videos")){
			
			buscarVideos();
			
		}else if(Datos_Navegante.getTipoBusqueda().equals("Usuarios")){
			
			buscarUsuarios();
		}
		
		
		
	}

	

	void buscarVideos() {
		List<Video_BD> lista= usuNoRegistrado.buscarVideos(Datos_Navegante.getBusqueda());
		formLista.removeAllComponents();
				
		if(lista == null || lista.size() == 0){
			Label l= new Label();
			l.setValue("No hay ningún video en la base de datos");
			formLista.addComponent(l);
		}
		for (int i = 0; i < lista.size(); i++) {
			formLista.addComponent(new Video(lista.get(i)));
		}
		vertical.addComponent(formLista);
	}
	
	void buscarUsuarios() {
		List<Usuario_Registrado_BD> lista= usuNoRegistrado.buscarUsuarios(Datos_Navegante.getBusqueda());
		formLista.removeAllComponents();
				
		if(lista == null || lista.size() == 0){
			Label l= new Label();
			l.setValue("No hay ningún video en la base de datos");
			formLista.addComponent(l);
		}
		for (int i = 0; i < lista.size(); i++) {
			formLista.addComponent(new Usuario(lista.get(i)));
		}
		vertical.addComponent(formLista);
	}

	
	
}