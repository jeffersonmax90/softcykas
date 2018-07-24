package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
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
	
	public Lista_de_usuarios_registrados(){
		cargarListaUsuarioRegistrado();
		
		
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				
			}
		});
	}

	void cargarListaUsuarioRegistrado() {
		List<Usuario_Registrado_BD> usuarios= admin.cargarlistaUsuarioRegistrados(Datos_Navegante.getIdUsuario());
		formlayout.removeAllComponents();
		
		for (int i = 0; i < usuarios.size(); i++) {
			Usuario_registrado_listado objeto= new Usuario_registrado_listado();
			objeto.miniatura.setSource(new ExternalResource((usuarios.get(i).getMiniatura())));
			objeto.nombre_usuario.setValue(usuarios.get(i).getNombre()+" "+usuarios.get(i).getApellidos());
			formlayout.addComponent(objeto);
			objeto.eliminar_button.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					
					eliminarUsuarioListaRegistrado();
				}
			});
		}
	}
	
	
	void eliminarUsuarioListaRegistrado() {
	
		
	}
	
	
}