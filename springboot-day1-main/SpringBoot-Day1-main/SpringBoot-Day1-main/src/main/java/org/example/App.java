package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");
        Student s= (Student) context.getBean("st");
        s.internship();
        Springboot f= (Springboot) context.getBean("fun");
        f.Hello("siva");
        task1 t1= (task1) context.getBean("t1");
        t1.Hello("name1");
        task2 t2= (task2) context.getBean("t2");
        t2.Hello("name2");
        task3 t3= (task3) context.getBean("t3");
        t3.Hello("name3");
    }
}