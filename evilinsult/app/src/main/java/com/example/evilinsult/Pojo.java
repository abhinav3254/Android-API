package com.example.evilinsult;

public class Pojo {

    @Override
    public String toString() {
        return "Pojo{" +
                "number='" + number + '\'' +
                ", language='" + language + '\'' +
                ", insult='" + insult + '\'' +
                ", created='" + created + '\'' +
                ", shown='" + shown + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", active='" + active + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public String number;
    public String language;
    public String insult;
    public String created;
    public String shown;
    public String createdBy;
    public String active;
    public String comment;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getInsult() {
        return insult;
    }

    public void setInsult(String insult) {
        this.insult = insult;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getShown() {
        return shown;
    }

    public void setShown(String shown) {
        this.shown = shown;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
