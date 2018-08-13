package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Page;
import com.vaadin.server.Resource;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Lista_de_usuarios_registrados extends Lista_de_usuarios_registrados_ventanas implements View {
	/*
	 * private TextField _buscar_usuarioTF; private Button _buscar_usuarioB; private
	 * Vector _usuarios_registradosV; public Zona_opciones_administrador
	 * _unnamed_Zona_opciones_administrador_; public
	 * Vector<Usuario_registrado_listado> _unnamed_Usuario_registrado_listado_ = new
	 * Vector<Usuario_registrado_listado>();
	 */
	IAdministrador admin= new BD_Principal();
	String obtenerId;
	
	public Lista_de_usuarios_registrados(){
		
		cargarListaUsuarioRegistrado();
		
		buscar.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				String texto= texfielBuscador.getValue();
				
				if(texto.length()==0){
					cargarListaUsuarioRegistrado();
				}
				else{
					buscarUsuarioListaRegistrado();		
				}
									
			}
		});
		
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				
			}
		});
	}
	
	
	@SuppressWarnings("serial")
	void cargarListaUsuarioRegistrado() {
		
		List<Usuario_Registrado_BD> usuarios= admin.cargarlistaUsuarioRegistrados(Datos_Navegante.getIdUsuario());
		
		formlayout.removeAllComponents();
		
		for (int i = 0; i < usuarios.size(); i++) {
			formlayout.addComponent(new Usuario_registrado_listado(usuarios.get(i)));
		}
	}
	
	void buscarUsuarioListaRegistrado() {
		
		List<Usuario_Registrado_BD> usuarios= admin.buscarUsuarioListaRegistado(texfielBuscador.getValue());
		
		formlayout.removeAllComponents();
		for (int i = 0; i < usuarios.size(); i++) {
			formlayout.addComponent(new Usuario_registrado_listado(usuarios.get(i)));
		}
	
	
	}
	

}