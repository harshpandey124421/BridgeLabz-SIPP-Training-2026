// Topic: LeetCode - 1797 Design Authentication Manager (Basic Implementation)
import java.util.HashMap;
import java.util.Map;

public class LCAuthenticationManager {
    int timeToLive;
    Map<String, Integer> tokens;

    public LCAuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        this.tokens = new HashMap<>();
    }
    
    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime + timeToLive);
    }
    
    public void renew(String tokenId, int currentTime) {
        if (tokens.containsKey(tokenId) && tokens.get(tokenId) > currentTime) {
            tokens.put(tokenId, currentTime + timeToLive);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (int expiry : tokens.values()) {
            if (expiry > currentTime) count++;
        }
        return count;
    }
}