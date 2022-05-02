package Shop;

import java.util.Date;

public interface EventProduct {


    public String getCountry();
    public void  setCountry(String country);
    public String getType();
    public void setType(String type);
    public String getModel();
    public void setModel(String model);
    public void checkInStock();

    public Product create(String category, String title, double price, int year, int warranty, Date currentDate, int count_in_stock);
}
