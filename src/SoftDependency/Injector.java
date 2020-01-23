package SoftDependency;

public class Injector {

    public static void main(String[] args){

        //Constructor injection
        Service service1 = new ServiceA();

        ClientA clioent1 = new ClientA(service1);

        clioent1.doSomething();
        //Constructor injection

        //setter injection
        Service service2 = new ServiceA();
        ClientB client2 = new ClientB();
        client2.setService(service2);

        client2.doSomething();
        //setter injection



    }
}
