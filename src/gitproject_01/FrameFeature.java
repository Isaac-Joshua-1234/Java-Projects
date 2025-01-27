package gitproject_01;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

//importion of the frame requirements
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameFeature {

	public static void main(String[] args) {
		
		
		//Frame creation area
		JFrame frame=new JFrame();
		Random random=new Random();
		
		
		//Label creation area
		JLabel label=new JLabel();//Java component of  label
		label.setText("JAVA FRAME PROGRAM");//Text that will appear in the frame
		label.setFont(new Font("Arial",Font.BOLD,25));//The font size and type of the font that will appear in the frame
		label.setBounds(90,10,400,50);//Aligning the font to appear
		label.setForeground(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));//Random color change of the label
		
		//Codes that have created the Frame
		frame.add(label);//add the label to the frame
		frame.setTitle("Java Frame");//title of the frame
		frame.setSize(500,500);//size of the frame in width and height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Closing, hiding and maximizing and minimizing of the frame		
		frame.setLocationRelativeTo(null);//The frame will be at the center
		frame.getContentPane().setBackground(Color.gray);//Setting the background of the frame
		frame.getContentPane().setLayout(null);//layout of the frame been nothing or null
		frame.setVisible(true);//Making the frame to be seen or visible

	}

}
