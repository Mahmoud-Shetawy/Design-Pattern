package observer.afterUseObserver;

public class Customer implements Subscriber {
    private String name;

    public Customer(String name ) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    @Override
    public void notify(String message) {
        System.out.println("Notifying User: "+ name +" about: "+ message);

    }
}
