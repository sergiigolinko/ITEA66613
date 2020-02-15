package les9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CatFactory {
    public static void main(String[] args) {

        farshabilityCat(new Cat("Borys", "Grey", 2, false));
        farshabilityCat(new HomelessCat("Myrka", "White", 5, true));
        farshabilityCat(new FatCat("Marsik", "Silver", 6, true));

    }

    public static void farshabilityCat(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Method method : methods
        ) {
            if (method.getAnnotation(Lapa.class).quantity() == 2) {
                System.out.println(obj.getClass().getSimpleName() + " --> " + " GOES TO FARSH ");
            } else {
                System.out.println(obj.getClass().getSimpleName() + " --> " + " DOES NOT GO TO FARSH ");
            }
        }
        for (Field field : fields) {
            if (field.getAnnotation(LuckyCat.class).value()) {
                System.out.println(obj.getClass().getSimpleName() + " --> " + " GOES TO FARSH ");
            } else {
                System.out.println(obj.getClass().getSimpleName() + " --> " + " DOES NOT GO TO FARSH ");
            }
        }
        if (!obj.getClass().isAnnotationPresent(Blohable.class)) {
            System.out.println(obj.getClass().getSimpleName() + " --> " + " GOES TO FARSH ");
        } else {
            System.out.println(obj.getClass().getSimpleName() + " --> " + " DOES NOT GO TO FARSH ");
        }
    }

}
