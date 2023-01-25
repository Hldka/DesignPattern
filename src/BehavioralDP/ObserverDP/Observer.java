package BehavioralDP.ObserverDP;

public class Observer {
    public static void main(String[] args) {
        Observer observer=new Observer();
        observer.observerDemo();

    }
    void observerDemo(){
        Channel channel1=new NewsChannel();
        Channel channel2=new NewsChannel();
        Channel channel3=new NewsChannel();
        NewsAgency agency=new NewsAgency();

        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);
        agency.sendNews("Java dili artik TechPro ile cok daha kolay");
        agency.sendNews("SpringBoot artik kolay");
        agency.sendNews("Spring securty sac beyazlatir");
        System.out.println("Cahnel 1 haberleri : ");
        channel1.printNews();
        System.out.println("**********************");
        System.out.println("Cahnel 2 haberleri : ");
        channel2.printNews();
        System.out.println("**********************");
        System.out.println("Cahnel 3 haberleri : ");
        channel3.printNews();
        System.out.println("**********************");
    }
}
