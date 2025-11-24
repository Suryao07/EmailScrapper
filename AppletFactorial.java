import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AppletFactorial.class" width=300 height=300></applet> */

public class AppletFactorial extends Applet implements ActionListener {
    Label i1, i2, i3;
    TextField tf1, tf2;
    Button b1;

    public void init() {
        setSize(400, 200);
        setLayout(new FlowLayout());

        i1 = new Label("enter value");
        i1.setForeground(Color.BLUE);
        add(i1);

        tf1 = new TextField(5);
        tf1.setText("0");
        add(tf1);

        b1 = new Button("compute");
        b1.addActionListener(this);
        add(b1);

        i3 = new Label();
        add(i3);

        i2 = new Label("factorial:");
        i2.setForeground(Color.BLUE);
        add(i2);

        tf2 = new TextField(5);
        add(tf2);
    }

    public void actionPerformed(ActionEvent ae) {
        long n = Integer.parseInt(tf1.getText());
        long f = 1;
        while (n != 0) {
            f = f * n;
            n--;
        }
        tf2.setText(String.valueOf(f));
    }
}
