package kr.co.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("초기화 완료.");

        UserBean userBean = (UserBean)ac.getBean("userBean");
        userBean.setName("kim");
        System.out.println(userBean.getName());

        // application context deer zaasan idgar awah
        // UserBean userBean - new UserBean();
        UserBean userBean2 = (UserBean)ac.getBean("userBean");
        if(userBean == userBean2) {
            System.out.println("같은 인스턴스이다.");
        }
    }
}
