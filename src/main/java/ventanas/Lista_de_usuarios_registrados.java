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
				String texto= texfielBuscador.getValue().toString();
				if(texto.length()==0){
					cargarListaUsuarioRegistrado();
				}
				else{
					buscarUsuarioListaRegistrado();		
				}
					
				buscarUsuarioListaRegistrado();				
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
			Usuario_registrado_listado objeto= new Usuario_registrado_listado();
			objeto.miniatura.setSource(new ExternalResource((usuarios.get(i).getMiniatura())));
			objeto.nombre_usuario.setValue(usuarios.get(i).getNombre()+" "+usuarios.get(i).getApellidos());
			objeto.id.setVisible(false);
			//casting el id a string
			int id=usuarios.get(i).getId();
			String cadena="";
			cadena=String.valueOf(id);
			objeto.id.setValue(cadena);
			
			formlayout.addComponent(objeto);
	//TODO Eliminar
			objeto.eliminar_button.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					obtenerId=objeto.id.getValue();
					eliminarUsuarioListaRegistrado();	
					
				}
			});
		}
	}
	
	
	void eliminarUsuarioListaRegistrado() {
		int aId= Integer.parseInt(obtenerId);
		boolean eliminado= admin.eliminarUsuarioListaRegistrado(aId);
		if(Boolean.TRUE.equals(eliminado)){
			Notification notification = new Notification("¡Usuario elminado con éxito!", "", Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			UI.getCurrent().getNavigator().navigateTo("Lista_de_usuarios_registrados");
			
		}
	}
	
	@SuppressWarnings("serial")
	void buscarUsuarioListaRegistrado() {
		List<Usuario_Registrado_BD> usuarios= admin.buscarUsuarioListaRegistado(texfielBuscador.getValue());
		formlayout.removeAllComponents();
		for (Usuario_Registrado_BD u : usuarios) {
			Usuario_registrado_listado object= new Usuario_registrado_listado();
			object.nombre_usuario.setValue(u.getNombre()+ " "+ u.getApellidos());
			object.miniatura.setSource(new ExternalResource(u.getMiniatura()));
			object.id.setVisible(false);
			//casting el id a string
			int id=u.getId();
			String cadena="";
			cadena=String.valueOf(id);
			object.id.setValue(cadena);
			
			formlayout.addComponent(object);
			object.eliminar_button.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					// TODO Auto-generated method stub
					obtenerId=object.id.getValue();
					eliminarUsuarioListaRegistrado();	
					Notification notification = new Notification("¡Usuario!", "falta tener toda la aplicacion para poder eliminar el usuario sus  videos y comentarios "+obtenerId, Notification.Type.HUMANIZED_MESSAGE);
					notification.setDelayMsec(2000);
					notification.show(Page.getCurrent());
				}
			});
		}	
	
	
	}
	
}