package com.fc.test;

import com.fc.dao.StudentDao;
import com.fc.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


//public class PropertiesTest {
//    @Test
//    public void test() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findAll();
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//public class PropertiesTest {
//    @Test
//    public  void test(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findAll();
//
//            for (Student student:students){
//
//                System.out.println(student);
//            }
//                session.commit();
//                session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
////}
//public class PropertiesTest {
//    @Test
//    public  void test(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config,xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findAll();
//
//            for (Student student : students) {
//
//                System.out.println(student);
//            }
//            session.commit();
//            session.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
public  class PropertiesTest {
    @Test
    public void test(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findAll();

            for (Student student : students) {

                System.out.println(student);

            }
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}