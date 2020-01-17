package app.pack.model;

public class History {

	Product product;
	String status;
	int qua;
	
	public int getQua() {
		return qua;
	}
	public void setQua(int qua) {
		this.qua = qua;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "History [product=" + product + ", status=" + status + ", qua=" + qua + "]";
	}
	
}

	


