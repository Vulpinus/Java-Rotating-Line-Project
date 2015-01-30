import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Interactive {
	public static void main(String[]args){

		//RotatingLine i = new RotatingLine();

				JFrame frame = new JFrame();
				// set size of frame here
				frame.setSize (650, 700);
				frame.setTitle("Rotating Line");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				frame.setLayout(new BorderLayout());
				
				// calling addButton() method to create a JButton (start/stop button)
				
				//frame.add(i.addButton(), BorderLayout.NORTH);
				
		
		
		
		long startTime = System.currentTimeMillis();
		long beforeSecond = 0;
		RotatingLine i = new RotatingLine (0);
		frame.add(i);
		frame.setVisible(true);
		while (true){

			long elapsedTime = System.currentTimeMillis() - startTime;
			long elapsedSeconds = elapsedTime / 1000;
			//long secondsDisplay = elapsedSeconds % 5;
			
			i = new RotatingLine (elapsedSeconds);
			frame.repaint();
			
//			if (elapsedSeconds == beforeSecond + 1){
//				System.out.println(elapsedSeconds);
//				beforeSecond++;
//			}



		}


	}
	
	
	
	// r = 1
	public  static double rotate(String type, long timeElapsed){
		// edit rate later (36)
		double theta = timeElapsed * 36;
		// r = 1 below
		if (type == "x1"){
			return 1 * Math.cos(theta);
		}
		if (type == "y1"){
			return 1 * Math.sin(theta);
		}
		if (type == "x2"){
			return 1 * Math.cos(theta + 180);
		}
		if (type == "y2"){
			return 1 * Math.sin(theta + 180);
		}
		// if error occurs
		return 5;
	}
	
	
	
	
}