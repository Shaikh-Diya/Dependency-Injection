package SoftDependency;

public class ClientB {
    private Service service;

    public void setService(Service service) {

        this.service = service;
    }

    public void doSomething(){
        service.getInfo();

    }
}
