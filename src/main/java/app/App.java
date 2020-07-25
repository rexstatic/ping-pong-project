package app;

import javax.swing.JFrame;

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        JFrame obj1 = new JFrame();
        obj1.setBounds(600, 250, 700, 600);
        obj1.setResizable(false);
        obj1.setVisible(true);
        obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
