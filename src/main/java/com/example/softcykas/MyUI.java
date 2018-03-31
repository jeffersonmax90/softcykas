package com.example.softcykas;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Video;

import ventanas.Anadir_datos_usuario;
import ventanas.Anadir_datos_video;
import ventanas.Lista_videos;
import ventanas.Usuario_invitado;
import ventanas.Usuario_registrado;
import ventanas.Videos_de_suscripciones;
import ventanas.Videos_de_suscripciones_ventanas;
import ventanas.Videos_relacionados;
import ventanas.Videos_tendencia;
import ventanas.Videos_usuarios_registrados;
import ventanas.Zona_inicio_cabecera_invitado;
import ventanas.Zona_inicio_cabecera_registrado;
import ventanas.Zona_inicio_cabecera_registrado_ventanas;
import ventanas.Zona_inicio_comun;
import ventanas.Zona_inicio_comun_ventanas;
import ventanas.Zona_inicio_cuerpo_invitado;
import ventanas.Zona_inicio_cuerpo_invitado_ventanas;
import ventanas.Zona_inicio_cuerpo_registrado;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
       
    	Anadir_datos_usuario alta_usuaio= new Anadir_datos_usuario();
    	Anadir_datos_video subirvideo= new Anadir_datos_video();
    	Usuario_registrado ur= new Usuario_registrado();
    	//probando  liena 33
    	/*final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        layout.addComponents(name, button);
        */
        setContent(ur);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
