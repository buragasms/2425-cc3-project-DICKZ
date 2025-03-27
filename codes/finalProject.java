import javax.swing.*;
import java.awt.*;

public class finalProject{

	public static void main(String[]args){
	
	
	JFrame frame1 = new JFrame();
	frame1.setSize(1500, 1000);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame1.setLayout(new BorderLayout());

	 JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));


	 JButton homeButton = new JButton("HOME");
		homeButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));

        	JButton bookingButton = new JButton("BOOKING");
       	 	JButton reviewsButton = new JButton("REVIEWS");
        	JButton signInButton = new JButton("SIGN-IN");



			panel.add(homeButton);
      	 	panel.add(bookingButton);
       		panel.add(reviewsButton);
     		panel.add(signInButton);

	
	JPanel borderLayoutPanel = new JPanel (new BorderLayout());
			JLabel DICKZ = new JLabel("D.I.C.K.Z Hotel", SwingConstants.LEFT);
			DICKZ.setFont(new Font("Arial", Font.BOLD, 24));
				
	borderLayoutPanel.add(DICKZ, BorderLayout.CENTER);
		
	

	JPanel combinedTopPanel = new JPanel(new BorderLayout());
		combinedTopPanel.add(borderLayoutPanel, BorderLayout.CENTER);
		combinedTopPanel.add(panel, BorderLayout.SOUTH);
	

	
		
	frame1.add(combinedTopPanel, BorderLayout.NORTH);







			JButton startButton = new JButton("Let's Start");
				startButton.setMargin(new Insets(20, 40, 20, 40));
				

			JPanel centerPanel = new JPanel(new GridBagLayout());

			centerPanel.add(startButton);

			frame1.add(centerPanel, BorderLayout.CENTER);



		
		

	frame1.setVisible(true);
}
}