package exercises.java.advanced.factory;

import java.lang.reflect.Constructor;

public interface Food {
    public String getType();
}
class Pizza implements Food {
    public Pizza(){}

    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public Cake(){}

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        try {
            Class<?> clazz = Class.forName(FoodFactory.class.getPackage().getName() + "."
                    + capitalizeWord(order));
            Constructor<?> ctor = clazz.getConstructor();
            return (Food) ctor.newInstance();
        }
        catch (Exception error){
            throw new RuntimeException(error);
        }
    }

    private String capitalizeWord(String str){
        return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();
    }
}
