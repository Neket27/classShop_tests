package Shop;

import java.util.Date;

public class Computers extends Product implements EventProduct, EventComputer{
    String country, type, model, cpu, gpu;
    boolean wi_fi;

    public Computers(Product product) {
        super(product);
    }


    public void checkInStock(){
        if(getCount_in_stock()<5){
            throw new RuntimeException("Закупить товар");
        }
    }

    @Override
    public Product create(String category, String title, double price, int year, int warranty, Date currentDate, int count_in_stock) {
        return null;
    }

    public Computers(){}
    public Computers(String category,String title,double price,int year ,Date currentDate,String country, String type, String model, String cpu, String gpu, int warranty, boolean wi_fi,int count_in_stock) {
        super(category,title,price,year,warranty,currentDate,count_in_stock);
        this.country = country;
        this.type = type;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
        this.wi_fi = wi_fi;






        if((getCurrentDate().getYear()+1900)-year >= 4)
            setPrice(price*9.16);
        else if ((getCurrentDate().getYear()+1900)-year >= 3)
            setPrice(price*9.15);
        else if((getCurrentDate().getYear()+1900)-year >= 2)
            setPrice(price*9.13);
        else if((getCurrentDate().getYear()+1900)-year >= 1)
            setPrice(price*9.1);


    }

    @Override
    public Computers create(CreateComputerArgument createComputerArgument) {

        return null;
    }

    @Override
    public String getCountry() {return country;}
    @Override
    public void setCountry(String country) {this.country=country;}
    @Override
    public String getType() {return type;}
    @Override
    public void setType(String type) {this.type = type;}
    @Override
    public String getModel() {return model;}
    @Override
    public void setModel(String model) {this.model = model;}


    public String getCpu() {return cpu;}
    public void setCpu(String cpu) {this.cpu = cpu;}
    public String getGpu() {return gpu;}
    public void setGpu(String gpu) {this.gpu = gpu;}
    public boolean isWi_fi() {return wi_fi;}
    public void setWi_fi(boolean wi_fi) {this.wi_fi = wi_fi;}


        public void printComputers() {
            System.out.println("Computer");
            for (int i = 0; i < computers.size(); i++) {
                System.out.println("Категория: " + getComputers(i).getCategory() + " " +
                        "Модель: " + getComputers(i).getModel() + " " +
                        "Название: " + getComputers(i).getTitle() + " " +
                        "Процессор: " + getComputers(i).getCpu() + " " +
                        "Видеокарта: " + getComputers(i).getGpu() + " " +
                        "Цена: " + getComputers(i).getPrice() + " " +
                        "Год выпуска: " + getComputers(i).getYear() + " " +
                        "Гарантия: " + getComputers(i).getWarranty()
                );

            }
        }



}