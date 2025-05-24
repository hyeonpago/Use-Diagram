public class App {
    private Server server = new Server();

    public void processOrder(User user, String foodName) {
        System.out.println("App: Sending order to server");
        server.receiveOrder(foodName);
    }
}
