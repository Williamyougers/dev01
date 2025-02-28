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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SuppressWarnings ("deprecation")
public class CRUDTest {
//    @Test
//    public void testFindByKeyword () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            List<Student> students = mapper.findByKeyword ("%千%");
//
//            for (Student student : students) {
//                System.out.println (student);
//            }
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
//@Test
//public void testFindByKeyword(){
//
//    try {
//        InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//        SqlSession session = factory.openSession ();
//
//        StudentDao sessionMapper = session.getMapper (StudentDao.class);
//
//        List<Student> students = sessionMapper.findByKeyword ("%爸%");
//
//        for (Student student : students) {
//
//            System.out.println (student);
//        }
//
//        session.commit ();
//
//        session.close ();
//    } catch (IOException e) {
//        e.printStackTrace ();
//    }
//}

    //    @Test
//    public void testFindByKeyword(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            List<Student> keyword = mapper.findByKeyword ("%爸%");
//
//            for (Student student : keyword) {
//
//                System.out.println (student);
//
//            }
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
    @Test
    public void testFindByKeyword () {

        try {
            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);

            SqlSession session = factory.openSession ();

            StudentDao mapper = session.getMapper (StudentDao.class);

            List<Student> students = mapper.findByKeyword ("%爸%");

            for (Student student : students) {

                System.out.println (student);
            }

            session.commit ();

            session.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
//    @Test
//    public void testFindAll () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            List<Student> students = mapper.findAll ();
//
//            for (Student student : students) {
//                System.out.println (student);
//            }
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }

//    @Test
//    public void testFindAll(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            List<Student> students = studentDao.findAll ();
//
//            for (Student student : students) {
//
//                System.out.println (student);
//            }
//
//            session.commit ();
//
//            session.close ();
//
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }

//    @Test
//    public void testFindAll(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            List<Student> students = studentDao.findAll ();
//
//            for (Student student : students) {
//
//
//                System.out.println (student);
//            }
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
//    @Test
//    public void testFindAll(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            List<Student> students = mapper.findAll ();
//
//            for (Student student : students) {
//
//                System.out.println (student);
//            }
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//
//
//    }
//    @Test
//    public void testFindById () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            Student student = studentDao.findById (7);
//
//            System.out.println (student);
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
//@Test
//public void testFindById(){
//
//    try {
//        InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//        SqlSession session = factory.openSession ();
//
//        StudentDao mapper = session.getMapper (StudentDao.class);
//
//        Student student = mapper.findById (11);
//
//        System.out.println (student);
//
//        session.commit ();
//
//        session.close ();
//    } catch (IOException e) {
//        e.printStackTrace ();
//    }
//}

//    @Test
//    public void testFindById(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            Student student = mapper.findById (11);
//
//            System.out.println (student);
//
//            session.commit ();
//
//            session.close ();
//
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//
//    }

//    @Test
//    public void testFindById(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            Student student = mapper.findById (11);
//
//            System.out.println (student);
//
//            session.commit ();
//
//            session.close ();
//
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//
//
//    }

//    @Test
//    public void testInsert () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            Student student = new Student ();
//
//            student.setName ("泽鹏");
//            student.setAge ((byte) 18);
//            student.setGender ("男");
//            student.setBirthday (new Date (104, 10, 28));
//            student.setInfo ("射手座比较向往自由");
//
//            int affectedRows = studentDao.insert (student);
//
//            System.out.println (affectedRows);
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }

//    @Test
//    public void testInsert(){
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            Student student = new Student ();
//
//            student.setName ("约翰逊");
//            student.setAge ((byte) 12);
//            student.setGender ("男");
//            student.setBirthday (new Date (104,10,28 ));
//            student.setInfo ("我是帅哥");
//            int affectedRows = mapper.insert (student);
//
//            System.out.println (affectedRows);
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
//@Test
//public void testInsert(){
//
//    try {
//        InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//        SqlSession session = factory.openSession ();
//
//        StudentDao mapper = session.getMapper (StudentDao.class);
//
//        Student student = new Student ();
//
//        student.setName ("约翰逊");
//
//        student.setAge ((byte) 12 );
//
//        student.setInfo ("我是大帅哥");
//
//        student.setGender ("男");
//
//
//
//
//        int affectedRows = mapper.insert (student);
//
//        System.out.println ("受影响的行数："+ affectedRows);
//
//        session.commit ();
//
//        session.close ();
//
//
//
//
//    } catch (IOException e) {
//        e.printStackTrace ();
//    }
//}

    @Test
    public void testInsert () {

        try {
            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);

            SqlSession session = factory.openSession ();

            StudentDao mapper = session.getMapper (StudentDao.class);

            Student student = new Student ();

            student.setName ("孟志斌");

            student.setAge ((byte) 58);

            student.setGender ("男");

            student.setInfo ("我爱dmt");

            int affectedRows = mapper.insert (student);

            System.out.println ("受影响的行数" + affectedRows);

            session.commit ();

            session.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    //    @Test
//    public void testUpdate () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            Student student = new Student ();
//
//            student.setId (8);
//            student.setInfo ("白马寺，龙潭大峡谷");
//
//            int affectedRows = studentDao.update (student);
//
//            System.out.println (affectedRows);
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
//    @Test
//    public void testUpdate () {
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            Student student = new Student ();
//
//            student.setInfo ("我鄙视我自己");
//
//            student.setId (11);
//
//            int affectRows = mapper.update (student);
//
//            System.out.println ("受影响的行数"+affectRows);
//
//
//
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//
//
//    }

//    @Test
//    public void testUpdate () {
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao mapper = session.getMapper (StudentDao.class);
//
//            Student student = new Student ();
//
//            student.setInfo ("我鄙视我自己");
//
//            student.setId (11);
//
//            int affectRows = mapper.update (student);
//
//            System.out.println ("受影响的行数"+affectRows);
//
//
//
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//
//
//    }
@Test
public void testUpdate () {

    try {
        InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);

        SqlSession session = factory.openSession ();

        StudentDao mapper = session.getMapper (StudentDao.class);

        Student student = new Student ();

        student.setInfo ("我鄙视我自己");

        student.setId (11);

        int affectRows = mapper.update (student);

        System.out.println ("受影响的行数"+affectRows);



    } catch (IOException e) {
        e.printStackTrace ();
    }


}

//    @Test
//    public void testDelete () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            int affectedRows = studentDao.delete (4);
//
//            System.out.println (affectedRows);
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }

//    @Test
//    public void testDelete () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            int affectedRows = studentDao.delete (4);
//
//            System.out.println (affectedRows);
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
    //    @Test
//    public void testDelete () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            int affectedRows = studentDao.delete (4);
//
//            System.out.println (affectedRows);
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
    @Test
    public void testDelete () {
        try {
            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);

            SqlSession session = factory.openSession ();

            StudentDao studentDao = session.getMapper (StudentDao.class);

            int affectedRows = studentDao.delete (4);

            System.out.println (affectedRows);

            session.commit ();

            session.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }


//    @Test
//    public void testGetAutoIncrement () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            Student student = new Student ();
//
//            student.setName ("Tina");
//            student.setAge ((byte) 5);
//            student.setGender ("女");
//
//            student.setInfo ("为了女儿，我可以打败大魔王");
//
//            int affectedRows = studentDao.getAutoIncrement (student);
//
//            System.out.println ("受影响的行数：" + affectedRows);
//            System.out.println ("自增长的id：" + student.getId ());
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
//}
//    @Test
//    public void testGetAutoIncrement () {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
//
//            SqlSession session = factory.openSession ();
//
//            StudentDao studentDao = session.getMapper (StudentDao.class);
//
//            Student student = new Student ();
//
//            student.setName ("Tina");
//            student.setAge ((byte) 5);
//            student.setGender ("女");
//
//            student.setInfo ("为了女儿，我可以打败大魔王");
//
//            int affectedRows = studentDao.getAutoIncrement (student);
//
//            System.out.println ("受影响的行数：" + affectedRows);
//            System.out.println ("自增长的id：" + student.getId ());
//
//            session.commit ();
//
//            session.close ();
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }
//    }
//}    @Test
////    public void testGetAutoIncrement () {
////        try {
////            InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");
////
////            SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);
////
////            SqlSession session = factory.openSession ();
////
////            StudentDao studentDao = session.getMapper (StudentDao.class);
////
////            Student student = new Student ();
////
////            student.setName ("Tina");
////            student.setAge ((byte) 5);
////            student.setGender ("女");
////
////            student.setInfo ("为了女儿，我可以打败大魔王");
////
////            int affectedRows = studentDao.getAutoIncrement (student);
////
////            System.out.println ("受影响的行数：" + affectedRows);
////            System.out.println ("自增长的id：" + student.getId ());
////
////            session.commit ();
////
////            session.close ();
////        } catch (IOException e) {
////            e.printStackTrace ();
////        }
////    }
@Test
public void testGetAutoIncrement () {
    try {
        InputStream inputStream = Resources.getResourceAsStream ("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (inputStream);

        SqlSession session = factory.openSession ();

        StudentDao studentDao = session.getMapper (StudentDao.class);

        Student student = new Student ();

        student.setName ("Tina");
        student.setAge ((byte) 5);
        student.setGender ("女");

        student.setInfo ("为了女儿，我可以打败大魔王");

        int affectedRows = studentDao.getAutoIncrement (student);

        System.out.println ("受影响的行数：" + affectedRows);
        System.out.println ("自增长的id：" + student.getId ());

        session.commit ();

        session.close ();
    } catch (IOException e) {
        e.printStackTrace ();
    }
}
}



