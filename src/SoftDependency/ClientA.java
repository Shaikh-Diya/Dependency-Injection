package SoftDependency;
//constructor injection
public class ClientA {
    private Service service;

    public ClientA(Service service){//-->constructor injection

        this.service = service;
    }
    public void doSomething(){

        service.getInfo();
    }

}
