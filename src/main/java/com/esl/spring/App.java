package com.esl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * @author bhanu
 **/
public class App {

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        System.out.println("demo");
//   HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//            obj.getMessage();

//        SpringBean springBean = (SpringBean) context.getBean("springBean");
//        System.out.println(springBean.getText());
//        HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
//        helloIndia.getMessage2();
//        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//        textEditor.spellCheck();
//        JavaCollection javaCollection =
//                (JavaCollection) context.getBean("javaCollection");
//        for (Person o : javaCollection.getPersons()) {
//            System.out.println(o);
//
//        }
//        for (Person o : javaCollection.getPersonsSet()) {
//            System.out.println(o);
//
//        }
//        Map<String, Person> personMap = javaCollection.getPersonMap();
//        for (String name : personMap.keySet()) {
//            System.out.println(personMap.get(name));
//            }
//        Properties properties = javaCollection.getProperties();
//        for (String o : properties.stringPropertyNames()) {
//            System.out.println(properties.getProperty(o));       }
        ApplicationContext context = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) context).
                register(TextEditorConfig.class);
        ((AnnotationConfigApplicationContext) context).refresh();
        TextEditor textEditor = (TextEditor)context.getBean("textEditor");
        textEditor.spellCheck();
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage1();

    }
}
