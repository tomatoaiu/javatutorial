import javax.swing.*;


class UI extends JFrame{
    public static void main(String[] args) {
        UI frame = new UI();

        frame.setTitle("UI test");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}