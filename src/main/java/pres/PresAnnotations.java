package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class PresAnnotations {

	public static void main(String[] args) {
		
	ApplicationContext context = 
		new AnnotationConfigApplicationContext("dao","metier");
	
	IMetier me = context.getBean(IMetier.class);
	
	System.out.println("Res "+me.calcul());
		
	} 
}
