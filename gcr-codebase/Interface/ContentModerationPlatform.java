interface TextModeration {
    void analyzeText(String post);
    
    default void displayModerationPolicy() {
        System.out.println("Policy: Spam and offensive content are not allowed.");
    }
}

interface SpamDetection {
    void analyzeSpam(String post);
    
    default void displayModerationPolicy() {
        System.out.println("Policy: Multiple identical messages are flagged as spam.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    public static boolean containsRestrictedWords(String post) {
        String[] restricted = {"hate", "spam_link", "offensive"};
        for (String word : restricted) {
            if (post.toLowerCase().contains(word)) return true;
        }
        return false;
    }

    @Override
    public void analyzeText(String post) {
        if (containsRestrictedWords(post)) {
            System.out.println("Post flagged as Offensive: " + post);
        } else {
            System.out.println("Post is Valid: " + post);
        }
    }

    @Override
    public void analyzeSpam(String post) {
        if (post.contains("buy now") || post.contains("subscribe to my channel")) {
            System.out.println("Post flagged as Spam: " + post);
        }
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModerationPlatform {
    public static void main(String[] args) {
        String[] posts = {
            "Hello world!",
            "I hate this product",
            "buy now and get 50% off",
            "What a lovely day"
        };
        
        ContentModerator moderator = new ContentModerator();
        moderator.displayModerationPolicy();
        
        for (String post : posts) {
            moderator.analyzeText(post);
            moderator.analyzeSpam(post);
        }
    }
}