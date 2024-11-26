package ObserverPattern;

public class NewsSubs implements Subscriber {
    private String name;

    public NewsSubs(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String news) {
        System.out.println("[" + name + "] Recieved breaking news: " + news);
    }

    public String getName(){
        return name;
    }
}