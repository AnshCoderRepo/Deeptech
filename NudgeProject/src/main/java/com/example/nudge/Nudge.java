package com.example.containerrouting.model;

import java.time.LocalDateTime;

public class Nudge {
    private String eventTag;
    private String title;
    private String coverImage; // URL or path to the image
    private LocalDateTime sendTime;
    private String description;
    private String icon; // URL or path to the icon
    private String invitationLine;

    public Nudge() {
    }

    public Nudge(String eventTag, String title, String coverImage, LocalDateTime sendTime, String description, String icon, String invitationLine) {
        this.eventTag = eventTag;
        this.title = title;
        this.coverImage = coverImage;
        this.sendTime = sendTime;
        this.description = description;
        this.icon = icon;
        this.invitationLine = invitationLine;
    }

    public String getEventTag() {
        return eventTag;
    }

    public void setEventTag(String eventTag) {
        this.eventTag = eventTag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getInvitationLine() {
        return invitationLine;
    }

    public void setInvitationLine(String invitationLine) {
        this.invitationLine = invitationLine;
    }
}
