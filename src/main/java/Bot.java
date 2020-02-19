import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Chat;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;
import repository.BotUser;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {

    UserService service;


    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }


    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        sendMessage.setChatId(message.getChatId().toString());

        sendMessage.setReplyToMessageId(message.getMessageId());

        sendMessage.setText(text);

        if (message.getText().equals("/class")) {
            try {

                setButtons(sendMessage);
                execute(sendMessage);

            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        } else if (message.getText().equals("/duel")) {
            try {
                execute(sendMessage);

            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else {
            try {
                execute(sendMessage);

            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }


    public void onUpdateReceived(Update update) {

        String name = "dokuton";

        Message message = update.getMessage();
        Chat chat = message.getChat();


        if (chat.getId() == 231139905) {
            if (message != null && message.hasText()) {
                switch (message.getText()) {
                    case "/help":
                        sendMsg(message, "/help\n/fight");
                        break;
                    case "/fight":
                        sendMsg(message, "Start battle");
                        sendMsg(message, BattleService.startBattle(Stats.getArchetype("Слива"), Stats.getArchetype("Душила")));
                        break;
                    case "/duel":
                        sendMsg(message, "Prepare to battle @NikroOm");
                    default:
                }
            }
        } else if (message != null && message.hasText()) {
            switch (message.getText()) {
                case "/help":
                    sendMsg(message, "/help\n/setting\n/class");
                    break;
                case "/setting":
                    sendMsg(message, "Что будем настраивать?");
                    break;
                case "/class":
                    sendMsg(message, "Выбери свой класс");
                    break;
                case "/sliwa":
                    sendMsg(message, "удар сливой");
                    sendMsg(message, getSliwa().toString());
                    break;
                case "/fight":
                    sendMsg(message, "Start battle");
                    sendMsg(message, BattleService.startBattle(Stats.getArchetype("Слива"), Stats.getArchetype("Душила")));
                    break;
                case "/duel":

                    sendMsg(message, "Prepare to battle @" + BattleService.getRandomUser());
                default:
                    if (message.getText().equals("Слива")) {
                        sendMsg(message, Stats.getArchetypeStats("Слива"));
                        break;
                    }
                    if (message.getText().equals("Душила")) {
                        sendMsg(message, Stats.getArchetypeStats("Душила"));
                        break;
                    }
            }
        }
    }

    public Card getSliwa() {

        Card card = new Card("Бросок сливы", "Закидывает сливу в чат противника", "Basic");
        card.setAction(ACTION.getByActName(card.getTitle()));

        return card;
    }


    public void setButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton(ArchetypeNames.DUWILA.getName()));
        keyboardFirstRow.add(new KeyboardButton(ArchetypeNames.SLIVA.getName()));

        keyboardRowList.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

    public String getBotUsername() {
        return "nikrom_bot";
    }

    public String getBotToken() {
        return "1035190724:AAGNAfhUuAI9puYgawa2p5lXf9MBFxuY6PA";
    }
}
