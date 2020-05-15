package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class TestDish {
    public enum CaloricLevel { DIET, NORMAL, FAT }
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("beef",false,700,Dish.Type.MEAT),
                new Dish("chicken",false,400,Dish.Type.MEAT),
                new Dish("french fries",true,530,Dish.Type.OTHER),
                new Dish("rice",true,350,Dish.Type.OTHER),
                new Dish("season fruit",true,120,Dish.Type.OTHER),
                new Dish("pizza",true,550,Dish.Type.OTHER),
                new Dish("prawns",false,300,Dish.Type.FISH),
                new Dish("salmon",false,450,Dish.Type.FISH)
        );
        //选出卡路里前三的食物名
        menu.sort(Comparator.comparing(Dish::getCalories).reversed());
        List<String> threeHighCaloricDishName = menu.stream()
                .limit(3)
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(threeHighCaloricDishName);

        //将每个类型的菜品分类
        Map<Dish.Type, List<Dish>> group = menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(group);//返回一个map{FISH=[salmon, prawns], OTHER=[pizza, french fries, rice, season fruit], MEAT=[pork, beef, chicken]}
        System.out.println(group.get(Dish.Type.MEAT).get(1));

        //算出所有菜品的总卡路里
        int maxCalories = menu.stream().mapToInt(Dish::getCalories).sum();//mapToInt(dish -> dish.getCalories())
        Double maxCalories1 = menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println(maxCalories);

        //算出总共有多少菜品
        int typeSum = menu.stream().mapToInt(d -> 1).sum();
        System.out.println(typeSum);

        //筛选出所有主食
        Predicate<Dish> meatFilter =  new Predicate<Dish>() {
            @Override
            public boolean test(Dish dish) {
                return dish.getType() == Dish.Type.MEAT;
            }
        };//等同 dish -> dish.getType() == Dish.Type.MEAT;
        List<Dish> meat = menu.stream().filter(meatFilter).collect(toList());
        System.out.println(meat);

        //分组
        Map<CaloricLevel,List<Dish>> dishesByCaloricLevel = menu.stream().collect(groupingBy(dish -> {
            if(dish.getCalories() <= 400) return CaloricLevel.DIET;
            else if(dish.getCalories() <= 700) return CaloricLevel.NORMAL;
            else return CaloricLevel.FAT;
        }));
        System.out.println(dishesByCaloricLevel);

        //多级分组
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = menu.stream().collect(
                groupingBy(Dish::getType,
                        groupingBy(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        } )
                )
        );
        System.out.println(dishesByTypeCaloricLevel);

    }


}
