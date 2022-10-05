package com.selin.formapp.createWindow.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="createWindow")
@Data
public class Create {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String formName;
    String formDesc;
    String question;
    String question2;
    String question3;
    String question4;
    String question5;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getFormName() {
        return formName;
    }
    public void setFormName(String formName) {
        this.formName = formName;
    }
    public String getFormDesc() {
        return formDesc;
    }
    public void setFormDesc(String formDesc) {
        this.formDesc = formDesc;
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }
}
