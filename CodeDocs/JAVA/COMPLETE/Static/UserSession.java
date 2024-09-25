class UserSession {
    // Static variable to keep track of the total number of sessions created
    private static int totalSessions = 0;
    
    // Instance variable to store the session ID for each user
    private String sessionId;
    
    // Constructor to initialize a new session for a user
    public UserSession(String sessionId) {
        // 'this' refers to the current object's sessionId
        this.sessionId = sessionId;
        // Increment the static counter for total sessions
        totalSessions++;
    }
    
    // Static method to get the total number of sessions created
    public static int getTotalSessions() {
        return totalSessions;
    }
    
    // Instance method to display the current session information
    public void displaySessionInfo() {
        System.out.println("Session ID: " + this.sessionId);  // 'this' refers to the current session
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating new user sessions
        UserSession user1 = new UserSession("USER123");
        UserSession user2 = new UserSession("USER456");
        
        // Display session information for both users
        user1.displaySessionInfo();
        user2.displaySessionInfo();
        
        // Get the total number of sessions created
        System.out.println("Total sessions created: " + UserSession.getTotalSessions());
    }
}
