package project;

public class Degree {
    private final String id;
    private final String code;
    private final String language;
    private final String groupId;
    private final String name;
    private final int creditsMin;

    public Degree(String id, String code, String language, String groupId, String name, int creditsMin) {
        this.id = id;
        this.code = code;
        this.language = language;
        this.groupId = groupId;
        this.name = name;
        this.creditsMin = creditsMin;
    }

    public String getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    public int getCreditsMin() {
        return creditsMin;
    }

    public String getCode() {
        return code;
    }
}
