import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import jeuControleur.TimerTest3;

public class TimerTest3 extends JPanel {
 	JLabel label;
 	Timer timer;
 	int current = 0;

 	public TimerTest3() {
 		this.add(this.getLabel());
 		this.go();
 	}

 	public JLabel getLabel() {
 		if (this.label == null) {
 			this.label = new JLabel(this.current + "");
 			this.label.setPreferredSize(new Dimension(100, 22));
 		}
 		return this.label;
 	}

 	public void go() {
 		ActionListener action = new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				label.setText(++current + "");
 			}
 		};
 		this.timer = new Timer(1000, action);
 		this.timer.start();
 	}

 	public static void main(String[] args) {
 		JFrame frame = new JFrame();
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setContentPane(new TimerTest3());
 		frame.setSize(200, 75);
 		frame.setVisible(true);
 	}
 }