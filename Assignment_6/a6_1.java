package ass_6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a6_1 extends JFrame implements ActionListener {
    
    private TextField nameField, ageField;
    private JRadioButton maleBtn, femaleBtn, otherBtn;
    private ButtonGroup genderGroup;
    private JCheckBox mathBox, scienceBox, englishBox;
    private Choice deptChoice;
    private List hobbyList;
    private TextArea detailsArea;
    private JButton submitBtn, clearBtn;

    public a6_1() {
        setTitle("Student Data Form");
        setSize(500, 500);
        setLayout(new GridLayout(9, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        add(new JLabel("Name:"));
        nameField = new TextField(20);
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new TextField(20);
        add(ageField);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout());
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        otherBtn = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);
        genderGroup.add(otherBtn);
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);
        genderPanel.add(otherBtn);
        add(genderPanel);

        add(new JLabel("Subjects:"));
        JPanel subjectPanel = new JPanel(new FlowLayout());
        mathBox = new JCheckBox("Mathematics");
        scienceBox = new JCheckBox("Science");
        englishBox = new JCheckBox("English");
        subjectPanel.add(mathBox);
        subjectPanel.add(scienceBox);
        subjectPanel.add(englishBox);
        add(subjectPanel);

        add(new JLabel("Department:"));
        deptChoice = new Choice();
        deptChoice.add("CSE");
        deptChoice.add("ECE");
        deptChoice.add("ME");
        add(deptChoice);

        add(new JLabel("Hobbies:"));
        hobbyList = new List(3, true);
        hobbyList.add("Sports");
        hobbyList.add("Music");
        hobbyList.add("Art");
        hobbyList.add("Reading");
        add(hobbyList);

        
        add(new JLabel("Additional Details:"));
        detailsArea = new TextArea(3, 20);
        add(detailsArea);

    
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        add(submitBtn);
        add(clearBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            String name = nameField.getText().trim();
            String ageText = ageField.getText().trim();

            
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty!");
                return;
            }
            int age;
            try {
                age = Integer.parseInt(ageText);
                if (age <= 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Age must be a valid positive number!");
                return;
            }

            String gender = "";
            if (maleBtn.isSelected()) gender = "Male";
            else if (femaleBtn.isSelected()) gender = "Female";
            else if (otherBtn.isSelected()) gender = "Other";

            String subjects = "";
            if (mathBox.isSelected()) subjects += "Mathematics ";
            if (scienceBox.isSelected()) subjects += "Science ";
            if (englishBox.isSelected()) subjects += "English ";

            String dept = deptChoice.getSelectedItem();

            String hobbies = "";
            for (String h : hobbyList.getSelectedItems()) {
                hobbies += h + " ";
            }

            String details = detailsArea.getText();

            
            String message = "Name: " + name + "\nAge: " + age +
                    "\nGender: " + gender + "\nSubjects: " + subjects +
                    "\nDepartment: " + dept + "\nHobbies: " + hobbies +
                    "\nAdditional Details: " + details;

            JOptionPane.showMessageDialog(this, message, "Student Data", JOptionPane.INFORMATION_MESSAGE);

        } else if (e.getSource() == clearBtn) {
            nameField.setText("");
            ageField.setText("");
            genderGroup.clearSelection();
            mathBox.setSelected(false);
            scienceBox.setSelected(false);
            englishBox.setSelected(false);
            deptChoice.select(0);
            hobbyList.deselect(hobbyList.getSelectedIndex());
            detailsArea.setText("");
        }
    }

    public static void main(String[] args) {
        new a6_1();
    }
}
