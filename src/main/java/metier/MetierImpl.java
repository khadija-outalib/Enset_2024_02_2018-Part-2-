package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IDao;

@Component ("metier")
public class MetierImpl implements IMetier {
	
	@Autowired
	private IDao dao ;
	
	
	
	public MetierImpl(IDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public double calcul() {
		double tmp = dao.getData();
		double res = tmp*540/Math.cos(tmp*Math.PI);
		
		return res;

	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	

}
