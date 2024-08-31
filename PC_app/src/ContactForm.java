import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    public ContactForm() {
        super("Опрос");
        super.setBounds(200, 100, 200, 200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(2,1,2, 10));

        JLabel text1 = new JLabel("Хуй");
        JLabel text2 = new JLabel("Хер");
        JButton send_button = new JButton("Кнопка");
        container.add(text1);
        container.add(text2);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager());
    }

    static class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Пошел на хуй", "Лох", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
