import java.lang.reflect.Proxy;
public class ProxyDemo {
    public static void main(String[] args) {
        Service realService = new RealService();
        Service proxyInstance = (Service) Proxy.newProxyInstance(
                realService.getClass().getClassLoader(),
                realService.getClass().getInterfaces(),
                new LoggingInvocationHandler(realService)
        );

        proxyInstance.performAction();
    }
}
