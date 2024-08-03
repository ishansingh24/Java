public class ProxyDemo {
    public static void main(String[] args) {
        Service realService = new RealService();
        Service proxyService = new ServiceProxy(realService);

        proxyService.performAction();
    }
}