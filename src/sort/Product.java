package sort;

public class Product implements Comparable<Product>{
    private int id;
	private String productName;
	private String categoryName;
	private double price;

	public Product() {
	}
	
	public Product(int id, String productName, String categoryName, double price) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}

	
	public String toString() {
		return "Product{id=" + id + ", name=" + productName
				+ ", category=" + categoryName + ", price=" + price +"}\n";
	}

	
	public int getId() {
		return this.id;
	}

	
	public String getProductName() {
		return this.productName;
	}
	
	
	public String getCategoryName() {
		return this.categoryName;
	}

	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

    /*
     * Método da interface Comparable para criar um comparador personalizado.
     * compara o objeto atual (this) com o recebido.
     * É necessário para utilizar o Collections.sort();
     */
	public int compareTo(Product otherProduct) {
		return this.id - otherProduct.getId();
	}

}
