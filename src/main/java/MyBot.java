import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    private static final String TOKEN="1753197021:AAH1hiMeTt-wPE3YAH4L7OIauNkw8K-6UIg";
    private static final String USERNAME="RuslanJavaBot";
    public MyBot(DefaultBotOptions options){super(options);}
    public String getBotUsername() {
        return USERNAME;
    }

    public String getBotToken() {
        return TOKEN;
    }
    public void onUpdateReceived(Update update) {
    if (update.getMessage()!=null && update.getMessage().hasText()){
        long chatId=update.getMessage().getChatId();
        try {
            execute(new SendMessage(chatId,"Hi "+update.getMessage().getText()));
        } catch (TelegramApiException e){e.printStackTrace(); }
    }
    }
}
