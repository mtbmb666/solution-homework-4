public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("🔹 Max Users: " + configManager.getConfig("maxUsers"));
        System.out.println("🔹 Language Preference: " + configManager.getConfig("languagePreference"));
        configManager.printConfig();

        System.out.println("\n====================\n");

        LegacyChatService legacyChatService = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChatService);

        chatService.sendMessage("Welcome to the new chat system!");
        chatService.sendUserNotification("Bob", "Your request has been approved!");
        chatService.logChatMessage("System log: User activity recorded.");
    }
}   