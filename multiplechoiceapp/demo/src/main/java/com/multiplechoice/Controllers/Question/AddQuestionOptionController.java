package com.multiplechoice.Controllers.Question;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddQuestionOptionController implements Initializable {
    @FXML public Label questionOptionLabel;
    @FXML TextField questionOptionInput;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	questionOptionInput.setPromptText("đáp án sai");
    }

    public String getQuestionOptionLabelText() {
        return questionOptionLabel.getText();
    }

    public String getQuestionOptionInputText() {
        return questionOptionInput.getText();
    }

    public void setQuestionOptionLabelText(String text) {
        questionOptionLabel.setText(text);
    }

    public void setQuestionOptionInputText(String text) {
        questionOptionInput.setText(text);
    }
    
    public TextField getQuestionOptionInput() {
    	return questionOptionInput;
    }
}
