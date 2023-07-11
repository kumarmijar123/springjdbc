package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started......" );
        //spring jdbc=> JdbcTemplate
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class); 
         
//        JdbcTemplate template =  context.getBean("jdbcTemplate",JdbcTemplate.class);
//         
//         //insert query
//         String query="insert into student(id,name,city) values(?,?,?)";
//         
//         //fire the query
//         int result = template.update(query,457,"Ram Yadav", "Chitwan"); 
//         System.out.println("number of record inserted.." + result);
        
//        
//        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        
//       Insert  
//        Student student=new Student();
//        student.setId(663);
//        student.setName("Niraj");
//        student.setCity("Shikharpur");  	
//        
//        int result = studentDao.insert(student);
//        
//        System.out.println("student added "+result);
        
         // Update
//        
//        Student student=new Student();
//        student.setId(456);
//        student.setName("Raj Kumar");
//        student.setCity("Kavrepalanchwok");
//        int result = studentDao.change(student);
//        System.out.println("data changed "+result);
        
        //Delete
//        int result = studentDao.delete(457);
//        System.out.println("Deleted");
        
//        
//        Student student = studentDao.getStudent(222);
//        System.out.println(student);
//        
        List<Student> students = studentDao.getAllStudent();
        for (Student s : students) {
        	System.out.println(s);
        }
    }
}
