package Shop;

import java.util.Date;

public class Telephones extends Product implements EventProduct {
    String country, type, model, cpu, gpu, display;
    boolean wi_fi;
    public void checkInStock(){
        if(getCount_in_stock()<10){
            throw new RuntimeException("�������� �����");
        }
    }

    public Telephones() {}
    public Telephones(String category, String title, double price, int year, Date currentYear, String country, String type, String model, String cpu, String gpu, int warranty ,boolean wi_fi, String display,int count_in_stock) {
        super(category, title, price, year, warranty, currentYear,count_in_stock);
        this.country = country;
        this.type = type;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
        this.wi_fi = wi_fi;
        this.display = display;


        checkCorrectnessDates();

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
    public String getDisplay() {return display;}
    public void setDisplay(String display) {this.display = display;}
    public boolean isWi_fi() {return wi_fi;}
    public void setWi_fi(boolean wi_fi) {this.wi_fi = wi_fi;}


    public void printTelephones(){
        System.out.println("Telephone");
        for(int i=0; i<telephones.size();i++){
            System.out.println("���������: "+getTelephones(i).getCategory()+" "+
                    " ������: "+getTelephones(i).getModel()+" "+
                    " ��������: "+getTelephones(i).getTitle()+" "+
                    " ���������: "+getTelephones(i).getCpu()+" "+
                    " ����������: "+ getTelephones(i).getGpu()+" "+
                    " ����: "+getTelephones(i).getPrice()+" "+
                    " ��� �������: "+getTelephones(i).getYear()+" "+
                    " ��������: "+ getTelephones(i).getWarranty()

            );

        }    }




}