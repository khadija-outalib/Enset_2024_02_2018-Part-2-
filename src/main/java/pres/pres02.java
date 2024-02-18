package pres;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class pres02 {
	
	/*
     * Injection des dépendances par instanciation dynamique ==> fichier de configuration
     */
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
    
        try {
           
            
            Scanner sc= new Scanner (new File("config.txt"));
            String daoClassName = sc.nextLine();
            Class cDao = Class.forName(daoClassName);
			IDao dao = (IDao) cDao.newInstance();
			

            
            String metierClassName = sc.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();
            Method method = cMetier.getMethod("setDao", IDao.class);

            // metier.setDao(dao)
            method.invoke(metier, dao);
            
           

           System.out.println("Res : " + metier.calcul());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}

}
