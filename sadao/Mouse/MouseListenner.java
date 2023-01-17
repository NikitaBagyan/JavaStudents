package sadao.Mouse;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenner implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX()+ " " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
class Main {

    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setSize(500,250);
        jf.setVisible(true);
        MouseListenner mouseListenner = new MouseListenner();
        jf.addMouseListener(mouseListenner);
    }

}
