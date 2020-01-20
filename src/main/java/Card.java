public class Card extends Item {
    public ACTION action;

    public Card(String title, String description, String rare) {
        super(title, description, rare);
    }

    public ACTION getAction() {
        return action;
    }

    public void setAction(ACTION action) {
        this.action = action;
    }


    @Override
    public String toString() {
        return "Скилл: " + action.getActionName() + " наносит " + action.getAction() + " урона";
    }
}
