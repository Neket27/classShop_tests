package Shop;
import java.util.Date;
import java.util.*;

public class Product {
   private String category, title;
   private int year,warranty,count_in_stock;
   double price;
   private Date currentDate;
   private Map<java.lang.String,java.lang.String> HashMap;
   Map<String,String> description = new HashMap<String,String>();
   Map<String,String> reviews = new HashMap<String,String>();

    ArrayList<Computers> computers = new ArrayList<>();
    ArrayList<Telephones> telephones = new ArrayList<>();
    ArrayList<Appliances> appliances = new ArrayList<>();

    public  Product(){}
    public Product(String category, String title, double price, int year, int warranty, Date currentDate, int count_in_stock) {
        this.category = category;
        this.title = title;
        this.price = price;
        this.year = year;
        this.warranty=warranty;
        this.currentDate=currentDate;
        this.count_in_stock=count_in_stock;

        //checkCorrectnessDates();
    }
    //get and set
    public String getCategory() {return category;}
    public String getTitle() {return title;}
    public double getPrice() {return price;}
    public int getYear() {return year;}
    public void setCategory(String category) {this.category = category;}
    public void setTitle(String title) {this.title = title;}
    public void setPrice(double price) {this.price = price;}
    public void setYear(int year) {this.year = year;}
    public int getWarranty(){return warranty;}
    public void setWarranty(int warranty){this.warranty=warranty;}
    public Date getCurrentDate() {return currentDate;}
    public void setCurrentDate(Date currentDate) {this.currentDate = currentDate;}
    public int getCount_in_stock() {return count_in_stock;}
    public void setCount_in_stock(int count_in_stock) {this.count_in_stock = count_in_stock;}

    public void addComputers(Computers computers){this.computers.add(computers);}
    public void addTelephones(Telephones telephones){this.telephones.add(telephones);}
    public void addAppliances(Appliances appliances){this.appliances.add(appliances);}
    public Computers  getComputers(int num)  {return computers.get(num);}
    public Telephones getTelephones(int num) {return telephones.get(num);}
    public Appliances getAppliances(int num) {return  appliances.get(num);}


    public void checkCorrectnessDates(){
       // System.out.println("year= "+year);
        if((getCurrentDate().getYear()+1900)-year > 5) {
            //System.out.println((getCurrentDate().getYear() + 1900) - year);
            throw new RuntimeException("product old, delete it");
        }

        if(warranty<0){throw new RuntimeException("problem with warranty");}

    }





    public void product() {


    }
}
