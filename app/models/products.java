package models;


public class products {

    private  String p_id , p_name ,p_brand ;
    private  double price;
    private  int count;




    public products() {
    }

    public products(String p_id, String p_name, String p_brand, double price, int count) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_brand = p_brand;
        this.price = price;
        this.count = count;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_brand() {
        return p_brand;
    }

    public void setP_brand(String p_brand) {
        this.p_brand = p_brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}