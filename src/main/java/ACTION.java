public enum ACTION {

    sliva("Бросок сливы", 3),
    bottle("Бутылка", 5),
    netDeneg("Deneg net", 0);

    private String actionName;
    private int action;

    ACTION(String actionName, int action) {
        this.actionName = actionName;
        this.action = action;
    }

    public String getActionName() {
        return actionName;
    }

    public int getAction() {
        return action;
    }

    public static ACTION getByActName(String actionName) {
        for (ACTION o : ACTION.values()) {
            if (o.getActionName().equalsIgnoreCase(actionName)) {
                return o;
            }
        }
        return null;
    }
}
