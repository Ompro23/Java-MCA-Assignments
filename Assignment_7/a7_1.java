
package ass_7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a7_1 extends JFrame implements ActionListener {
    private String[] questions = {
        "Q1: Which language is used for Android development?",
        "Q2: Which planet is known as the Red Planet?",
        "Q3: Who developed Java?"
    };

    private String[][] options = {
        {"A. Java", "B. Kotlin", "C. Python", "D. C++"},
        {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
        {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"}
    };

    private int[] answers = {1, 1, 0};

    private JLabel questionLabel;
    private JRadioButton[] optionButtons;
    private ButtonGroup optionGroup;
    private JButton nextBtn, submitBtn, quitBtn;
    private JLabel scoreLabel;
    private JProgressBar progressBar;

    private int currentQuestion = 0;
    private int score = 0;

    public a7_1() {
        setTitle("Quiz Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        questionLabel = new JLabel(questions[currentQuestion]);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        optionButtons = new JRadioButton[4];
        optionGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton(options[currentQuestion][i]);
            optionGroup.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        nextBtn = new JButton("Next");
        submitBtn = new JButton("Submit");
        quitBtn = new JButton("Quit");
        nextBtn.addActionListener(this);
        submitBtn.addActionListener(this);
        quitBtn.addActionListener(this);
        buttonPanel.add(nextBtn);
        buttonPanel.add(submitBtn);
        buttonPanel.add(quitBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        JPanel topPanel = new JPanel(new FlowLayout());
        scoreLabel = new JLabel("Score: 0");
        progressBar = new JProgressBar(0, questions.length);
        progressBar.setValue(1);
        progressBar.setStringPainted(true);
        topPanel.add(scoreLabel);
        topPanel.add(progressBar);
        add(topPanel, BorderLayout.WEST);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextBtn) {
            checkAnswer();
            if (currentQuestion < questions.length - 1) {
                currentQuestion++;
                loadQuestion();
            } else {
                JOptionPane.showMessageDialog(this, "No more questions! Please submit.");
            }
        } else if (e.getSource() == submitBtn) {
            checkAnswer();
            JOptionPane.showMessageDialog(this, "Final Score: " + score + "/" + questions.length);
        } else if (e.getSource() == quitBtn) {
            System.exit(0);
        }
    }

    private void checkAnswer() {
        for (int i = 0; i < 4; i++) {
            if (optionButtons[i].isSelected()) {
                if (i == answers[currentQuestion]) {
                    score++;
                    JOptionPane.showMessageDialog(this, "Correct!");
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect! Correct answer: " +
                            options[currentQuestion][answers[currentQuestion]]);
                }
                break;
            }
        }
        scoreLabel.setText("Score: " + score);
        progressBar.setValue(currentQuestion + 1);
    }

    private void loadQuestion() {
        questionLabel.setText(questions[currentQuestion]);
        optionGroup.clearSelection();
        for (int i = 0; i < 4; i++) {
            optionButtons[i].setText(options[currentQuestion][i]);
        }
    }

    public static void main(String[] args) {
        new a7_1();
    }
}
