package ventanas;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Historial_BD;

public class BD_Historial {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Historial_BD> _historial = new Vector<Historial_BD>();

	public List<Video_BD> cargarHistorial(int aId) throws PersistentException {
		List<Video_BD> lista=new ArrayList<Video_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {	
			Usuario_Registrado_BD usu= Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			int idHistorial= usu.getHistorial().getId();
			Historial_BD h= Historial_BDDAO.getHistorial_BDByORMID(idHistorial);
			
			Video_BD [] videos =  h.video.toArray();
			
			for(Video_BD v : videos) {
				lista.add(v);
			}
			
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
				
		List<Video_BD>listafinal = new ArrayList<Video_BD>();
		int m=0;
		for (int i = lista.size()-1; i >=0 ; i--) {
			if(m==10) {
				break;
			}
			listafinal.add(lista.get(i));
			m++;
		}
			return listafinal;

		
	}
}