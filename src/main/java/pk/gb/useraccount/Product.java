package pk.gb.useraccount;

import java.util.ArrayList;

public class Product {
    private String productName;
    private String category;
    private int totPrice;
    private int productPrice;
    public static ArrayList<Product> cart = new ArrayList<Product>();
    public Product(){
        productName = "";
        category = "";
        totPrice = 0;
    }
    public Product(String n,String c, int p){
        productName = n;
        category = c;
        totPrice = 0;
        productPrice = p;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTotPrice(int totPrice) {
        this.totPrice = totPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public int getTotPrice() {
        return totPrice;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void addProduct(Product p){
        cart.add(p);
    }
    public void calcTotPrice(){
        for(int i = 0;i<cart.size();i++){
            totPrice+=cart.get(i).productPrice;
        }
    }


}
