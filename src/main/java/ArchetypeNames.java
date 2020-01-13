public enum ArchetypeNames {
    DUWILA ("Душила"),
    SLIVA ("Слива");

    private String name;

    ArchetypeNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ArchetypeNames{" +
                "name='" + name + '\'' +
                '}';
    }
}
