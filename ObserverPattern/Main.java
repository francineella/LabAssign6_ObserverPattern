package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        ConcreteNewsAgency agency = new ConcreteNewsAgency();

        Subscriber subs1 = new NewsSubs("Elle");
        Subscriber subs2 = new NewsSubs("Francesca");
        Subscriber subs3 = new NewsSubs("Ivory");

        agency.subscribe(subs1);
        agency.subscribe(subs2);
        agency.subscribe(subs3);

        agency.notifySubscribers("BINI blossoms in three-day ‘Grand BINIverse’ concert.");

        agency.unsubscribe(subs2);
        
        agency.notifySubscribers("AI adoption at 46% among Filipino workers—Jobstreet study");

        Subscriber subs4 = new NewsSubs("Izaiah");

        agency.subscribe(subs4);

        agency.notifySubscribers("Philippines' 1st World Cat Show set this weekend in Makati");

    }
}