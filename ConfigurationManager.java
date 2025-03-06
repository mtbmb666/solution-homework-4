public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String maxUsers = "150";
    private String languagePreference = "fr";
    private String gameMode = "hard";

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        switch (key) {
            case "maxUsers": return maxUsers;
            case "languagePreference": return languagePreference;
            case "gameMode": return gameMode;
            default: return "Invalid Key";
        }
    }

    public void printConfig() {
        System.out.println("📌 Current Settings:");
        System.out.println("maxUsers → " + maxUsers);
        System.out.println("languagePreference → " + languagePreference);
        System.out.println("gameMode → " + gameMode);
    }
} 