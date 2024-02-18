package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PersXML {
	
	public static void main(String[] args) {
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IMetier me = (IMetier) context.getBean("metier");
		
		System.out.println("Res "+me.calcul());
		
	
	
	}

}
