package ext;

import dao.IDao;

public class DaoImp2 implements IDao {

	@Override
	public double getData() {
		System.out.println("Version Capteurs");
		return 100;
	}

}
