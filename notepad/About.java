
package notepad;
import javax.swing.*;
import java.awt.*;
public class About  extends JFrame{
    
    About(){
        setBounds(400,100,600,500);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(   i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(10, 30, 400, 80);
        add(headerIcon);
        
       
        JLabel text = new JLabel("<html>Gourav Kushwah<br>Version 0.1.0(OS Build Java)<br> Code For Gourav.All Rights reserved</html>");
        text.setBounds(150, 100, 500, 200);
     
        add(text);
            

        
    
        setVisible(true);   
            }
    
    public void action(ActionEvent ae){
        this.setVisible(false);
    }
    public static void main(String gg[])
    {
    new About();
    }
}
