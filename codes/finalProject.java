import javax.swing.*;
import java.awt.*;

public class finalProject{

	public static void main(String[]args){
	JFrame frame1 = new JFrame();
	frame1.setSize(1500, 1000);


	JButton startButton = new JButton("Let's Start");
	frame1.getContentPane().add(BorderLayout.CENTER,startButton);

	frame1.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

		JButton homeButton = new JButton("HOME");
        	JButton bookingButton = new JButton("BOOKING");
       	 	JButton reviewsButton = new JButton("REVIEWS");
        	JButton signInButton = new JButton("SIGN-IN");
		

	
	
		frame1.add(homeButton);
      	 	frame1.add(bookingButton);
       		frame1.add(reviewsButton);
     		frame1.add(signInButton);
		

		
		

	frame1.setVisible(true);
}
}