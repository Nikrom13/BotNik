package repository;

public class BotUser {
    private int id;
    private String name;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    private String alias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BotUser(int id, String name, String alias) {
        this.id = id;
        this.name = name;
        this.alias = alias;
    }

    public BotUser() {
    }
}
