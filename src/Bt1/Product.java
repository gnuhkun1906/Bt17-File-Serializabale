package Bt1;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String productType;
    private float price;

    public Product() {
    }

    public Product(int productId, String productName, String productType, float price) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", price=" + price +
                '}';
    }
  void inputData(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the productId");
      this.productId=Integer.parseInt(sc.nextLine());
      System.out.println("Enter the productName");
      this.productName=sc.nextLine();
      System.out.println("Enter the productType");
      this.productType= sc.nextLine();
      System.out.println("Enter the price");
      this.price=Float.parseFloat(sc.nextLine());
  }
}
