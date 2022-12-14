package com.tddapp.springboottddapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {

    private int id;
    private String creationDate;
    private String completioDate;
    private String description;
    private String text;
    private boolean state;
    private String link;
    private String mentions;
    private boolean priority;

    public Note( int id,String creationDate, String completioDate, String description, String text, boolean state, String link, String mentions, boolean priority) {
        this.id = id;
        // Autoincrement
        this.creationDate = creationDate;
        this.completioDate = completioDate;
        this.description = description;
        this.text = text;
        this.state = state;
        this.link = link;
        this.mentions = mentions;
        this.priority = priority;
    }

    public Note() {

    }

    public int getId() {
        return id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCompletioDate() {
        return completioDate;
    }

    public void setCompletioDate(String completioDate) {
        this.completioDate = completioDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMentions() {
        return mentions;
    }

    public void setMentions(String mentions) {
        this.mentions = mentions;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", completioDate=" + completioDate +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                ", state=" + state +
                ", link='" + link + '\'' +
                ", mentions='" + mentions + '\'' +
                ", priority=" + priority +
                '}';
    }

    public void update(String completionDate, String description, String text, boolean state) {

        setCompletioDate(completionDate);
        setDescription(description);
        setText(text);
        setState(state);
    }

    public String differentiateLink(){
        if (this.getLink().contains("@")){
            return "email";
        }else if(this.getLink().toUpperCase().contains("YOUTUBE")){
            return "Youtube link";
        }else if (this.getLink().toUpperCase().contains("PDF")){
            return "Pdf file";
        }else{
            return "Normal Webpage";
        }
    }

    public String differentiateProfile(){
        if (this.getMentions().toUpperCase().contains("TWITTER")){
            return "Twitter Profile";
        }else if(this.getMentions().toUpperCase().contains("INSTAGRAM")){
            return "Integram Profile";
        }else if (this.getMentions().toUpperCase().contains("FACEBOOK")){
            return "Facebook Profile";
        }else{
            return "No Profile";
        }
    }

    public boolean compareDates() throws ParseException {
        Date completionDate=new SimpleDateFormat("dd/MM/yyyy").parse(this.completioDate);
        Date creationDate=new SimpleDateFormat("dd/MM/yyyy").parse(this.creationDate);
        return completionDate.after(creationDate);
    }
}
