package algonquin.cst2335.soha0222.ui.data;

public class ChatMessage {
    String message;
    String timeSent;
    boolean isSentButton;

    ChatMessage(String m, String t, boolean sent)
    {
        message = m;
        timeSent = t;
        isSentButton = sent;
    }

}