package java8.stream;

public class Dish {
    private final String name;//菜名
    private final Boolean vegetarian;//素食者
    private final int calories; //卡路里
    private final Type type;//

    public Dish(String name, Boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public enum  Type {MEAT,FISH,OTHER}
}
