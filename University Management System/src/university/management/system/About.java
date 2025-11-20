package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/About.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 0, 250, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>MIT Academy of Engineering</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(heading);
        
       
        
        JLabel contact = new JLabel("<html>MIT Academy of Engineering (MITAOE), Alandi, Pune, was established in 1999 under MAEER by the honorable</br> Prof. Dr. Vishwanath D. Karad, Founder and Executive President of MIT Group. The institute offers seven UG programs (B.Tech) and three PG programs (M.Tech). Recently, the UGC has honored the institute with ‘Academic Autonomy’ considering the quality of pedagogical practices, research, faculty and the state-of-the-art infrastructure that meets global standards.\n" +
"\n" +
"The Savitribai Phule Pune University (SPPU) has honored the institute with the ‘Best Engineering College (Professional Courses) award. The institute has made its mark by excelling in academics and research and it continues to grow as a ‘Centre of Excellence’ in engineering education and research. The NBA Accreditation to all branches, ‘A’ Grade by NAAC and the 2(F) & 12(B) status from the UGC, are the testimony to our pursuit of excellence.\n" +
"\n" +
"Learning-centered approach, personal attention to all the students and effective implementation of their valuable suggestions received through the continual feedback mechanism and ‘Student Teacher Interaction pedagogy’, make the teaching & learning process more effective. Selection and retention of the most efficient and talented staff members to enhance the quality of education and administration, is our key to success. A special emphasis is laid on their quality improvement by sponsoring the staff members for pursuing research and higher studies. Another significant feature is the ‘Tutor System for Counseling’.\n" +
"\n" +
"The institute endeavors to impart holistic education to its students in order to contribute to their all round development. The students at MITAOE get an opportunity to not only enhancing their technical skills but also their communication and soft skills. We are committed for their bright future and hence facilitate them to realize their dreams.<html>");
        contact.setBounds(70, 220, 550, 220);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 10));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
