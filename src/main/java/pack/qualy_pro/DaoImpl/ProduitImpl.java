package pack.qualy_pro.DaoImpl;

import pack.qualy_pro.models.*;
import org.hibernate.SessionFactory;

import com.IDao.config.DAO;

public class ProduitImpl extends DAO<Produit> {

	public ProduitImpl(SessionFactory sf) {
		super(sf);
		// TODO Auto-generated constructor stub
	}

}
