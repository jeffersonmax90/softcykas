package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Crear_categoria extends Crear_categoria_ventanas implements View{
	/*private Label _nombre_nueva_categoriaLB;
	private TextFiel _nombre_nueva_categoriaTF;
	private Label _edad_permitidadLb;
	private JCombox _edad_permitidaCB;
	private Button _crear_categoriaB;
	private Button _atr�sB;
	public Zona_opciones_administrador _unnamed_Zona_opciones_administrador_;
	public Lista_categorias _unnamed_Lista_categorias_;

	public void crear_categoria() {
		throw new UnsupportedOperationException();
	}*/
	
	
	public Crear_categoria(){
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				
			}
		});
		
		crear_categoria_button.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				
			}
		});
	}
	
}