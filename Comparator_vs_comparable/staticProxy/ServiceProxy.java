public class ServiceProxy implements Service {
    private final Service realService;

    public ServiceProxy(Service realService) {
        this.realService = realService;
    }

    @Override
    public void performAction() {
        System.out.println("Logging before method");
        realService.performAction();
        System.out.println("Logging after method");
    }
}
