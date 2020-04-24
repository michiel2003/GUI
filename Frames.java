package jframe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Frames{
	
	int ValueOnScreen = 0;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("ADD");
	JButton remove = new JButton("REMOVE");
	JTextField numbers = new JTextField();
	
	public static void main(String[] args) {
		Frames exec = new Frames();
		exec.CreateFrame();
	}
	
	public void CreateFrame() {
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddOne();
			}
		});
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TakeOne();
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		numbers.setText("0");
		panel.add(remove);
		panel.add(numbers);
		panel.add(add);
		frame.add(panel);
		frame.pack();
		frame.setSize(new Dimension(800,600));
		numbers.setPreferredSize(new Dimension(200,20));
		frame.setVisible(true);
	}
	
	public void AddOne() {
		ValueOnScreen++;
		numbers.setText(ValueOnScreen + "");
	}
	
	public void TakeOne() {
		ValueOnScreen--;
		numbers.setText(ValueOnScreen + "");
	}
}
