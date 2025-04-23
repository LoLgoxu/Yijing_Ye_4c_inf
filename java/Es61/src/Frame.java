import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    /***
     *
     * @param title
     */
    public Frame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setVisible(true);
        setLayout(new GridLayout(3,1));

        JButton button = new JButton("aggiungi");

        JTextField textField = new JTextField(10);

        JTextArea textArea = new JTextArea("");

        button.addActionListener(e -> {
            String inputText = textField.getText().trim();
            if (inputText.isEmpty()) {
                textArea.append("Avviso: campo vuoto!\n");
            } else {
                textArea.append(inputText + "\n");
            }
            textField.setText(""); // clear the JTextField after adding the text
        });

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(textField);
        add(scrollPane);
        add(button);

    }

}
