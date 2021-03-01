package caverspark;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @date 2020/11/18 18:14
 * @author chengjiaqing
 * @version : 0.1
 */ 
 
  
public class Test {

    public static void main(String[] args) throws Exception {
        String path = "mybatis-config.xml";
        SqlSessionFactory sqlSessionFactory = null;
        try {
            Reader reader = Resources.getResourceAsReader(path);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            System.out.println("获取配置文件失败");
            e.printStackTrace();
        }

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao =  sqlSession.getMapper(UserDao.class);
        System.out.println(userDao.selectAll());

    }
}