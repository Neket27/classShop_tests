package Shop;

import java.util.Arrays;
import java.util.Date;
public class Shop  {
        public Shop() {}

    public static void main(String[] args) {

        Date date=new Date();
        int a=date.getYear();
        System.out.println(a+1900);
      //  Computers comp= new Computers();
        Computers comp = new Computers("����������",
                "hp",
                15000,
                2022,
                date,
                "Russia",
                "��������� ��������",
                "honor magexbook 15",
                "i7",
                "amd99",
                2,
                true,
                4);
      //  @builder
//        comp.createComputer(
//                "����������",
//                    "honor",
//                    15000,
//                2020,
//                date,
//                "Russia",
//                "��������� ��������",
//                "honor magexbook 15",
//                "i7",
//                "amd99",
//                2,
//                true
//                //.buidl();
//        );

        comp.addComputers(comp);
        comp.printComputers();
       // Category category =new Category();


        System.out.println("������");

        Telephones tel = new Telephones ("��������",
                "apple",
                80000,
                2022,
                 date,
                "Russia",
                "���������",
                "apple phone 12",
                "m1",
                "amd99",
                3,
                true,
                "amoled",
                    3);

        tel.addTelephones(tel);
        tel.printTelephones();

       Category category = new Category(Arrays.asList(comp,tel));
       //System.out.println("category: "+category.printList());
          category.printList();


    }
}
