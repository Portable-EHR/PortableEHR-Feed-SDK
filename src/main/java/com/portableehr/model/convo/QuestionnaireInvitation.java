package com.portableehr.model.convo;

public class QuestionnaireInvitation {

    private int    surveyId;
    private String title;
    private String participantToken;

    public QuestionnaireInvitation() {
    }

    public QuestionnaireInvitation(int surveyId, String title, String participantToken) {
        this.surveyId = surveyId;
        this.title = title;
        this.participantToken = participantToken;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParticipantToken() {
        return participantToken;
    }

    public void setParticipantToken(String participantToken) {
        this.participantToken = participantToken;
    }
}
