public class User {
    public void placeOrder(App app, String foodName) {
        System.out.println("User: Ordering " + foodName);
        app.processOrder(this, foodName);
    }
}