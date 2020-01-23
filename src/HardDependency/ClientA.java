package HardDependency;


public class ClientA {
    private ServiceB service1;

    public void doSomething(){
        service1 = new ServiceB();
       service1.getInfo();
    }

    public static void main(String[] args) {
        ClientA client1 = new ClientA();
        client1.doSomething();
    }


}


