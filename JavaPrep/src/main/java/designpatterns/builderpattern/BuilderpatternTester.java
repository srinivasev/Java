package designpatterns.builderpattern;

import designpatterns.builderpattern.ProductOrder.ProductOrderBuilder;

public class BuilderpatternTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOrder order = new ProductOrder.ProductOrderBuilder("123","IRM order").buildForNewOrder();
		System.out.println(order);
	}

}
