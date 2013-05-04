package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import utils.MyBatisUtils;


import entidades.Usuario;

public class UsuarioDao {

	private SqlSessionFactory sqlSessionFactory;
	
	public UsuarioDao(){
		sqlSessionFactory = MyBatisUtils.getSqlSessionFactory();
	}
	public void insertar(Usuario objusuario){
		SqlSession session =  sqlSessionFactory.openSession();
		try {
				session.insert("Usuario.insertar",objusuario);
				session.commit();
		} catch (Exception e) {
			System.out.println("Error en usuarioDao.insert " + e.getMessage());
			session.rollback();
		} finally{
			session.close();
			
		}
		
	}
	public void actualizar(Usuario objusuario){
		SqlSession session =  sqlSessionFactory.openSession();
		try {
				session.update("Usuario.actualizar",objusuario);
				session.commit();
		} catch (Exception e) {
			System.out.println("Error en usuarioDao.actualizar " + e.getMessage());
			session.rollback();
		} finally{
			session.close();
			
		}
		
	}
	public void eliminar(String usuario){
		SqlSession session =  sqlSessionFactory.openSession();
		try {
				session.delete("Usuario.eliminar",usuario);
				session.commit();
		} catch (Exception e) {
			System.out.println("Error en usuarioDao.eliminar " + e.getMessage());
			session.rollback();
		} finally{
			session.close();
			
		}
		
	}
	public Usuario buscarPorUsuario(Usuario usuario){
		SqlSession session =  sqlSessionFactory.openSession();
		try {
				Usuario objusuario = session.selectOne("Usuario.buscarPorUsuario",usuario);
				return objusuario;
		} catch (Exception e) {
			System.out.println("Error en usuarioDao.buscarPorUsuario " + e.getMessage());
			return null;
		} finally{
			session.close();
		}
		
	}
	public Usuario encuentraUsuario(String usuario){
		SqlSession session =  sqlSessionFactory.openSession();
		try {
				Usuario objusuario = session.selectOne("Usuario.encuantraUsuario",usuario);
				return objusuario;
		} catch (Exception e) {
			System.out.println("Error en usuarioDao.buscarPorUsuario " + e.getMessage());
			return null;
		} finally{
			session.close();
		}
		
	}
	
}
