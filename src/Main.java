import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Model> mobiles = new ArrayList<>();
        Model model1 = new Model("Samsung", "M20", 8, 64);
        Model model2 = new Model("Samsung", "A20", 8, 128);
        Model model3 = new Model("Samsung", "A21s", 4, 64);
        Model model4 = new Model("Realme", "C12", 4, 64);
        Model model5 = new Model("Realme", "Narzo 10", 6, 128);
        Model model6 = new Model("Vivo", "Y12", 4, 32);
        Model model7 = new Model("Vivo", "Y15", 4, 32);
        Model model8 = new Model("Vivo", "Y20", 8, 128);
        Model model9 = new Model("Vivo", "V5", 6, 128);

        mobiles.add(model1);
        mobiles.add(model2);
        mobiles.add(model3);
        mobiles.add(model4);
        mobiles.add(model5);
        mobiles.add(model6);
        mobiles.add(model7);
        mobiles.add(model8);
        mobiles.add(model9);

        Mobile mobile = new Mobile();
        mobile.getMobile(mobiles,"Samsung");
        mobile.getMobile(mobiles,8);
        mobile.getMobile(mobiles,"Vivo",4);


    }
}
