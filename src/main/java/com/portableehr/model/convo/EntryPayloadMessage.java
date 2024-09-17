package com.portableehr.model.convo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class EntryPayloadMessage extends EntryPayload {

    private String text;
    private List<AttachmentEnvelop> attachments;
    private List<QuestionnaireInvitation> questionnaires;

    public EntryPayloadMessage() {
    }

    public EntryPayloadMessage(String text, List<AttachmentEnvelop> attachments, List<QuestionnaireInvitation> questionnaires) {
        this.text = text;
        this.attachments = attachments;
        this.questionnaires = questionnaires;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<AttachmentEnvelop> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentEnvelop> attachments) {
        this.attachments = attachments;
    }

    public List<QuestionnaireInvitation> getQuestionnaires() {
        return questionnaires;
    }

    public void setQuestionnaires(List<QuestionnaireInvitation> questionnaires) {
        this.questionnaires = questionnaires;
    }
}
