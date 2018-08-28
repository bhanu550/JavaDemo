package com.esl.spring;

/**
 * @author bhanu
 **/
public class HelloIndia {
    private String message1;
    private String message2;
    private String message3;


    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage1() {
        System.out.println("Your Message : " + message1);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage2() {
        System.out.println("Your Message : " + message2);

    }

    public String getMessage3() {
        return message3;
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }
}
