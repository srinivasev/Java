package designpatterns.builderpattern;

public class ProductOrder {
	
	private String orderId;
	private String orderName;
	private String customerAccountId;
	
	private ProductOrder(){
		
	}
	
	public final static class ProductOrderBuilder{
		
		private final ProductOrder productOrder;
		
		public ProductOrderBuilder(){
			this.productOrder = new ProductOrder();
		}
		
		public ProductOrderBuilder(String orderId,String orderName){
			this.productOrder = new ProductOrder();
			this.productOrder.orderId = orderId;
			this.productOrder.orderName = orderName;
		}
		
		public ProductOrderBuilder setOrderId(String orderId){
			this.productOrder.orderId = orderId;
			return this;
		}
		
		public ProductOrderBuilder setOrderName(String orderName){
			this.productOrder.orderName = orderName;
			return this;
		}
		
		
		public ProductOrder buildForNewOrder(){
			this.productOrder.customerAccountId = "srinivas";
			return this.productOrder;
		}
	}

	@Override
	public String toString() {
		return "ProductOrder [orderId=" + orderId + ", orderName=" + orderName
				+ ", customerAccountId=" + customerAccountId + "]";
	}
	
	

}
