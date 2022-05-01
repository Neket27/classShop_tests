package Shop;

import java.util.Date;

public class Appliances extends Product  {

    int voltage, power, width,height,weight;
    double powerCordLength;


    public Appliances(String category, String title, double price, int year, int warranty, Date currentDate, int voltage, int power, int width, int height, int weight, double powerCordLength,int count_in_stock) {
        super(category,title,price,year,warranty,currentDate,count_in_stock);
        this.voltage = voltage;
        this.power = power;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.powerCordLength = powerCordLength;
    }


    public int getVoltage() {return voltage;}
    public void setVoltage(int voltage) {this.voltage = voltage;}
    public int getPower() {return power;}
    public void setPower(int power) {this.power = power;}
    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}
    public int getHeight() {return height;}
    public void setHeight(int height) {this.height = height;}
    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
    public double getPowerCordLength() {return powerCordLength;}
    public void setPowerCordLength(double powerCordLength) {this.powerCordLength = powerCordLength;}


    public void printAppliances(){
        System.out.println("Telephone");
        for(int i=0; i<telephones.size();i++){
            System.out.println("���������: "+getAppliances(i).getCategory()+" "+
                    " ��������: "+getAppliances(i).getTitle()+" "+
                    " ��������: "+getAppliances(i).getPower()+" "+
                    " �������: "+getAppliances(i).getVoltage()+" "+
                    " ������: "+ getAppliances(i).getWidth()+" "+
                    " ������: "+ getAppliances(i).getHeight()+" "+
                    " ���: "+ getAppliances(i).getWeight()+" "+
                    " ����� �������: "+ getAppliances(i).getPowerCordLength()+" "+
                    " ����: "+getAppliances(i).getPrice()+" "+
                    " ��� �������: "+getAppliances(i).getYear()+" "+
                    " ��������: "+ getAppliances(i).getWarranty()

            );

        }    }

}
