package com.saksham.springdatajpa;

import com.saksham.springdatajpa.model.Student;
import com.saksham.springdatajpa.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

//        Student s1 = context.getBean(Student.class);
//        Student s2 = context.getBean(Student.class);
//        Student s3 = context.getBean(Student.class);
//
//        s1.setRollNo(101);
//        s1.setName("Ram");
//        s1.setMarks(45);
//
//        s2.setRollNo(102);
//        s2.setName("Shyam");
//        s2.setMarks(66);
//
//        s3.setRollNo(103);
//        s3.setName("Hari");
//        s3.setMarks(28);

//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

//        System.out.println(repo.findAll());
        Optional<Student> student = repo.findById(104);
        System.out.println(student.orElse(new Student()));

    }

}
