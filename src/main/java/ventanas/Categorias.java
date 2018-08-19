package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Categorias extends Categorias_ventanas implements View {
	/*
	 * private Label _nombre_categoriaLB; private Button _modificar_categoriaB;
	 * private Button _eliminar_categoriaB; public Lista_categorias
	 * _unnamed_Lista_categorias_;
	 * 
	 * public void modificar_categoria() { throw new
	 * UnsupportedOperationException(); }
	 * 
	 * public void eliminar_categoria() { throw new UnsupportedOperationException();
	 * }
	 */
	
	IAdministrador admin= new BD_Principal();
	Categoria_BD categoria;
	
	public Categorias(){
		cargarCategoriaAdmin();
		
		atras.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_categoria");
			}
		});
		
		modificar.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				modificarCategoriaAdmin();
				
			}


		});
	}

	void cargarCategoriaAdmin() {
		
		categoria= admin.cargarCategoriaAdmin(Datos_Navegante.getIdCategoria());
		nombre_categoria1.setValue(categoria.getNombre());
		edad_permitida.setValue(categoria.getEdad());
	}
	
	
	 void modificarCategoriaAdmin() {
		 
		 categoria.setNombre(nombre_categoria1.getValue());
		 categoria.setEdad(edad_permitida.getValue());
		 
		 
		 
		 boolean correcto= admin.modificarCategoriaAdmin(Datos_Navegante.getIdCategoria(), categoria);
		 
		 
		 if (correcto) {
				Notification notification = new Notification("Correcto", "Se ha modificado correctamente",
						Notification.Type.HUMANIZED_MESSAGE);
				notification.setDelayMsec(2000);
				notification.show(Page.getCurrent());
				UI.getCurrent().getNavigator().navigateTo("Crear_categoria");
			}
		
	}
	
}