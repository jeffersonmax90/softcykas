package ventanas;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_categorias extends Lista_categorias_ventanas {
	/*
	 * private Label _lista_de_categoriasLB; private Label _nombre_categoriaLB;
	 * private Vector _categoriasV; public Crear_categoria
	 * _unnamed_Crear_categoria_; public Vector<Categorias> _unnamed_Categorias_ =
	 * new Vector<Categorias>();
	 */
	
	IAdministrador admin= new BD_Principal();
	
	public Lista_categorias(){
		
		cargarListadoCategorias();
		
	}

	
	 void cargarListadoCategorias() {
			List<Categoria_BD> listaCategorias= admin.cargarListadoCategorias();
			formLayout.removeAllComponents();
		
			for (int i = 0; i < listaCategorias.size(); i++) {
				
				Label nombre= new Label();
				nombre.setCaption(listaCategorias.get(i).getNombre() +" " +listaCategorias.get(i).getEdad());
				Label idcat= new Label();
				int idcate= listaCategorias.get(i).getId();
				idcat.setValue(String.valueOf(idcate));
				idcat.setVisible(false);
				HorizontalLayout horizontal= new HorizontalLayout();
				
				Button  boton = new Button();
				
				boton.setCaption("Modificar");
				
				horizontal.addComponent(nombre);
				horizontal.addComponent(boton);
				
				boton.addClickListener(new Button.ClickListener() {
					@Override
					public void buttonClick(ClickEvent event) {
						String n=idcat.getValue();
						int numero=Integer.parseInt(n);
						Datos_Navegante.setIdCategoria(numero);
						UI.getCurrent().getNavigator().navigateTo("Categorias");
					}
				});
				formLayout.addComponent(horizontal);
			}
		}
}

