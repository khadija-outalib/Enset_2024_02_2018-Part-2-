package ext;

import dao.IDao;

public class DeoImplXML implements IDao {

	@Override
	public double getData() {
		System.out.println("Version XML");
		return 500;
	}

}
