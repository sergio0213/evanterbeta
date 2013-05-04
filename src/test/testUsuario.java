package test;

import java.util.Date;

import dao.UsuarioDao;
import entidades.Usuario;

public class testUsuario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UsuarioDao dao = new UsuarioDao();
		
		// insert
		Usuario obj = new Usuario();
		obj.setUsuario("juanes");
		obj.setCargo("asesor");
		obj.setContrasenia("12345");
		obj.setDias(30);
		obj.setEstado(1);
		obj.setNombre("Juan Ernesto Rodriguez");
		obj.setTipo('U');
		obj.setFechacreacion(new Date());
		dao.insertar(obj);
		//delete
		//dao.eliminar("juan");
		
		
	}

}
