package controllers;

import models.products;
import models.Detail;
import play.Play;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static products productss;
    public static Detail detail;
    public static String name;
    public static products cpu;
    public static Form<products> product_from = Form.form(products.class);
    public static List<Detail> detailList = new ArrayList<Detail>();
    public static Form<Detail> detailForm = Form.form(Detail.class);
    public static String comPicPath = Play.application().configuration().getString("com_pic_path");


    public static Result index() {

        String name;
        name = "Mr.Panuwat wangwong ";
        return ok(index.render());
    }

    public static Result pomo() {

        String name;
        name = "Mr.Panuwat wangwong ";
        return ok(promothion.render());
    }

    public static Result p_show_form() {

        productss = new products();

        DynamicForm Form_product = Form.form().bindFromRequest();

        String p_id, p_name, p_ban, p_price, p_cot;

        p_id = Form_product.get("p_id");
        p_name = Form_product.get("p_name");
        p_cot = Form_product.get("p_count");
        p_ban = Form_product.get("p_brand");
        p_price = Form_product.get("p_price");

        double i_pricer;
        i_pricer = Double.valueOf(p_price);

        int i_cout;
        i_cout = Integer.valueOf(p_cot);


        productss.setP_id(p_id);
        productss.setP_name(p_name);
        productss.setP_brand(p_ban);
        productss.setPrice(i_pricer);
        productss.setCount(i_cout);


        return ok(p_show_form.render(productss));
    }


    public static Result P_in_from() {


        return ok(p_in_form.render());

    }

    public static Result help_in() {
        detailForm = Form.form(Detail.class);
        return ok(form_help.render(detailForm));

    }

    public static Result help_show() {

        Form<Detail> newDetailForm = detailForm.bindFromRequest();

        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart picture = body.getFile("pic");
        if (newDetailForm.hasErrors()) {

            return ok(form_help.render(newDetailForm));
        } else {


            String fileName, contentType;

            if (picture != null) {

                File file = picture.getFile();
                fileName = picture.getFilename();

                detail = newDetailForm.get();
                fileName = detail.getP_id() + fileName.substring(fileName.lastIndexOf("."));
                file.renameTo(new File(comPicPath, fileName));
                detail.setPic(fileName);
                detailList.add(detail);

            }

            return ok(form_help_show.render(detailList));

        }


    }

}
