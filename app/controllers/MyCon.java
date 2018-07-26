package controllers;

import models.products;
import play.mvc.*;
import views.html.*;



public class MyCon extends Controller {

//private  static  String name ,add;

public  static products cpu;
    public  static products cpu2;
    public  static  products cpu3;
    public  static  products cpu4;
    public  static  products cpu5;
    public  static  products cpu6;




    public static  Result detil() {


        cpu = new products();

        cpu.setCount(20);
        cpu.setP_brand("Intel");
        cpu.setP_name("CPU Intel Core i7 - 7700K ");
        cpu.setP_id("E001");
        cpu.setPrice(9700);


        cpu2 = new products();

        cpu2.setCount(20);
        cpu2.setP_brand("Intel");
        cpu2.setP_name("CPU Intel Core i3 - 8100  ");
        cpu2.setP_id("E002");
        cpu2.setPrice(3850);

        cpu3 = new products();

        cpu3.setP_name("CPU Intel Core i5 - 7400 ");
        cpu3.setCount(10);
        cpu3.setP_brand("Intel");
        cpu3.setP_id("E003");
        cpu3.setPrice(5600);

        cpu4 = new products();

        cpu4.setP_name("CPU Intel Core i5 - 7600");
        cpu4.setCount(10);
        cpu4.setP_brand("Intel");
        cpu4.setP_id("E004");
        cpu4.setPrice(7990);

        cpu5 = new products();

        cpu5.setP_name("CPU Intel Pentium G5400");
        cpu5.setCount(15);
        cpu5.setP_brand("Intel");
        cpu5.setP_id("E005");
        cpu5.setPrice(2200);

        cpu6 = new products();

        cpu6.setP_name("CPU Intel Core i7 - 8700");
        cpu6.setCount(15);
        cpu6.setP_brand("Intel");
        cpu6.setP_id("E006");
        cpu6.setPrice(11990);

        return  ok(detil.render(cpu,cpu2,cpu3,cpu4,cpu5,cpu6));



    }






}

