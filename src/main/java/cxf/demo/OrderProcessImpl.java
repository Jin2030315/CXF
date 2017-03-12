package cxf.demo;

import javax.jws.WebService;

@WebService
public class OrderProcessImpl implements OrderProcess {

	@Override
	public String processOrder(Order order) {
		return null;
	}

}

