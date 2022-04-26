package fi.tuni.prog3.sisu;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class Degree {
    private final String id;
    private final String code;
    private final String language;
    private final String groupId;
    private final String name;
    private final int creditsMin;

    private JsonArray modules;
    private ArrayList<StudyModule> studyModules;
    private ArrayList<Course> courses;


    public Degree(String id, String code, String language, String groupId, String name, int creditsMin) {
        this.id = id;
        this.code = code;
        this.language = language;
        this.groupId = groupId;
        this.name = name;
        this.creditsMin = creditsMin;


        modules = new JsonArray();
        studyModules = new ArrayList<>();
        courses = new ArrayList<>();
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

    public void setModules(JsonObject module) {
        this.modules.add(module);
    }
    public void setStudyModules(StudyModule studyModule) {
        this.studyModules.add(studyModule);
    }

    public JsonArray getModules() {
        return this.modules;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
