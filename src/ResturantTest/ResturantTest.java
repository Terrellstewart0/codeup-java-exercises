package ResturantTest;

public class ResturantTest {

    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 2000;
        dish.nameOfDish = "bread";
        dish.wouldRecommend = true;
        dish.eat();
    }

}
