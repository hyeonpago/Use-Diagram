public class Server {
    private Restaurant restaurant = new Restaurant();
    private DeliveryAgent delivery = new DeliveryAgent();

    public void receiveOrder(String foodName) {
        System.out.println("Server: Forwarding order to restaurant");
        restaurant.prepareFood(foodName);
        System.out.println("Server: Requesting delivery");
        delivery.deliverFood(foodName);
    }
}