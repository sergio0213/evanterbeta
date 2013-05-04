package utils;

import java.io.Reader;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

public class MyBatisUtils {
	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
				System.out.println("Erro en Conexion MyEbatis" + e.getMessage());
		}

	}
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
}
