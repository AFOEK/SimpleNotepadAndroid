package com.example.simplenotepadandroid;

public class NoteBuilder {
    private String title, content;

    public NoteBuilder() {
    }

    public NoteBuilder(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}