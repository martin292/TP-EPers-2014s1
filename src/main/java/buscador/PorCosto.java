package buscador;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

public class PorCosto extends Orden{

	@Override
	public Criteria ordenar(Criteria c) {
		return c.addOrder(Order.desc("costo"));
	}

}
