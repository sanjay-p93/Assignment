package springCoreQ5;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Required;

@Named
public class SomeCDIBusiness {

	@Inject
	SomeCDIDAO SomeCDIDAO;
	int id;

	@Required
	public void setId(Integer id) {
		this.id = id;
	}

	public SomeCDIDAO getSomeCDIDAO() {
		return SomeCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		SomeCDIDAO = someCDIDAO;
	}

}
