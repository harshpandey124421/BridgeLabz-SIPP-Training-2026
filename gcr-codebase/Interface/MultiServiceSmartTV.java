interface StreamingService {
    void playMovie(String movieName);
    
    default void showSubscriptionDetails() {
        System.out.println("Streaming Service Subscription: Active");
    }
}

interface GamingService {
    void playGame(String gameName);
    
    default void showSubscriptionDetails() {
        System.out.println("Gaming Service Subscription: Active");
    }
}

class SmartTV implements StreamingService, GamingService {
    @Override
    public void playMovie(String movieName) {
        System.out.println("Playing movie: " + movieName);
    }

    @Override
    public void playGame(String gameName) {
        System.out.println("Playing game: " + gameName);
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
        System.out.println("SmartTV Premium Package Active.");
    }
}

public class MultiServiceSmartTV {
    public static void main(String[] args) {
        String[] movies = {"Inception", "Interstellar"};
        String[] games = {"Cyberpunk", "FIFA"};
        
        SmartTV tv = new SmartTV();
        tv.showSubscriptionDetails();
        
        for (String movie : movies) {
            tv.playMovie(movie);
        }
        for (String game : games) {
            tv.playGame(game);
        }
    }
}