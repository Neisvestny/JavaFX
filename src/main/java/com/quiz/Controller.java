package com.quiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.util.ArrayList;

public class Controller {
    public static ArrayList<String> questions = new ArrayList<>();
    public static ArrayList<String[]> answers = new ArrayList<>();
    public static int numberOfQuestion = 0;
    public ToggleGroup group;
    public RadioButton radio1;
    public RadioButton radio2;
    public RadioButton radio3;
    public RadioButton radio4;
    @FXML
    private Label question;
    @FXML
    private Button buttonAnswer;

    @FXML
    private void buttonClicked() {
        RadioButton selection = (RadioButton) group.getSelectedToggle();
        buttonAnswer.setDisable(true);

        if (!selection.isSelected()) return;


        if (selection.getText().equals(answers.get(numberOfQuestion/* - 1*/)[4])) {
            System.out.print(true + " ");
        } else {
            System.out.print(false + " ");
        }
        System.out.println(selection.getText());
        selection.setSelected(false);

        if (questions.size() == numberOfQuestion + 1) {
            System.out.println("EXIT");
            return;
        }
        numberOfQuestion += 1;

        question.setText(questions.get(numberOfQuestion));
        radio1.setText(answers.get(numberOfQuestion)[0]);
        radio2.setText(answers.get(numberOfQuestion)[1]);
        radio3.setText(answers.get(numberOfQuestion)[2]);
        radio4.setText(answers.get(numberOfQuestion)[3]);
    }

    @FXML
    private void radioClicked() {
        buttonAnswer.setDisable(false);
    }
}