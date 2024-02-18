package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DeoImpl implements IDao {
	
	@Override
	public double getData () {
		///dATABASE
		System.out.println("Version DAta base");
		double temp =Math.random()*40;
		return temp;
	}

}
