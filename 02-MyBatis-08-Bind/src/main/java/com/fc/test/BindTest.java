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


//public class BindTest {
//    @Test
//    public void testFindByIdAndName() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByIdAndName(1, "易烊千玺");
//
//            System.out.println(student);
//
//            session.commit();
//            session.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testFindByIdAndAge() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByIdAndAge(1, 22);
//
//            System.out.println(student);
//
//            session.commit();
//            session.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testFindByNameAndAge() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByNameAndAge("古力娜扎", 16);
//
//            System.out.println(student);
//
//            session.commit();
//            session.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

//public class BindTest {
//    @Test
//    public void testFindByIdAndName(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByIdAndName(9,"yhx");
//
//            System.out.println(student);
//
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//    @Test
//    public void testFindByIdAndAge(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByIdAndAge(9,12);
//
//            System.out.println(student);
//
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void testFindByNameAndAge(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByNameAndAge("阿爸阿爸",21);
//
//            System.out.println(student);
//
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

//public  class BindTest {
//    @Test
//    public void testFindByIdAndAge(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByIdAndAge(16,12);
//
//            System.out.println(student);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void testFindByNameAndAge(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByNameAndAge("姓名",12);
//
//            System.out.println(student);
//
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void testFindByIdAndName(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByIdAndName(9,"yhx");
//
//            System.out.println(student);
//
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
public class BindTest {

    @Test

    public void testFindByInfo(){

        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByInfo("哈哈");

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testFindByGender(){

        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);



            List<Student> students = studentDao.findByGender("女");
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