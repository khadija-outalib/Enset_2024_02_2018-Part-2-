package pres;

import dao.DeoImpl;
import metier.MetierImpl;

public class Persentation {

	public static void main(String[] args) {
		
		/*
		 * injection des dependances par 
		 instation statique ==>new
		 *
		 */
		DeoImpl dao = new DeoImpl();
		MetierImpl m = new MetierImpl(dao);
	//	m.setDao(dao);
		System.out.println("injection des dependances par instation statique");
		
		System.out.println("Res : "+m.calcul());
	}
}
