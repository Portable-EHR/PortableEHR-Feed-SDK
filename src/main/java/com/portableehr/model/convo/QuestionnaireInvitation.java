package com.portableehr.model.convo;

import java.util.List;

public class QuestionnaireInvitation {

    private int    surveyId;
    private String title;
    private List<QuestionnaireParticipant> participants;

    public QuestionnaireInvitation() {
    }

    public QuestionnaireInvitation(int surveyId, String title, List<QuestionnaireParticipant> participants) {
        this.surveyId = surveyId;
        this.title = title;
        this.participants = participants;
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

    public List<QuestionnaireParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<QuestionnaireParticipant> participants) {
        this.participants = participants;
    }
}
