package models;

/**
 * Created by Gvd-Pc on 07/30/18.
 */
public class detils extends products {

    private  String company,type,barcode,volume;
private  int powver;


    public detils() {
    }

    public detils(String p_id, String p_name, String p_brand, double price, int count, String company, String type, String barcode, String volume, int powver) {
        super(p_id, p_name, p_brand, price, count);
        this.company = company;
        this.type = type;
        this.barcode = barcode;
        this.volume = volume;
        this.powver = powver;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getPowver() {
        return powver;
    }

    public void setPowver(int powver) {
        this.powver = powver;
    }
}
