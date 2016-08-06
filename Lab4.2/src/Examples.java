import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

import javax.swing.*;

import java.util.*;

public class Examples extends JFrame {

	FlowLayout experimentLayout = new FlowLayout();

	public Examples(String name) {
		super(name);
	}

	public void addComponentsToPane(final Container pane) {
		// create a panel
		final JPanel compsToExperiment = new JPanel();
		compsToExperiment.setLayout(experimentLayout);
		// This value indicates that each row of components should be justified
		// to the trailing edge of the container's orientation,
		// for example, to the right in left-to-right orientations.
		experimentLayout.setAlignment(FlowLayout.CENTER);
		JPanel controls = new JPanel();
		controls.setLayout(new FlowLayout());

		// add buttons to the experiment layout
		final JLabel label1 = new JLabel("Label 1");
		compsToExperiment.add(label1);
		JButton jButton1 = new JButton("Button 1");
		jButton1.setForeground(Color.GREEN);
		compsToExperiment.add(jButton1);
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setFont(new Font("SansSerif", Font.BOLD, 10));
				compsToExperiment.validate();
				compsToExperiment.repaint();
			}
		});

		final JLabel label2 = new JLabel("Label 2");
		compsToExperiment.add(label2);
		JButton jButton2 = new JButton("Button 2");
		jButton2.setForeground(Color.RED);
		compsToExperiment.add(jButton2);
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setFont(new Font("SansSerif", Font.BOLD, 10));
				compsToExperiment.validate();
				compsToExperiment.repaint();
			}
		});

		final JLabel label3 = new JLabel("Label 3");
		compsToExperiment.add(label3);
		JButton jButton3 = new JButton("Button 3");
		jButton3.setForeground(new Color(100, 100, 100));
		compsToExperiment.add(jButton3);
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setFont(new Font("SansSerif", Font.BOLD, 10));
				compsToExperiment.validate();
				compsToExperiment.repaint();
			}
		});

		final JLabel label4 = new JLabel("Label 4");
		compsToExperiment.add(label4);
		JButton jButton4 = new JButton("Long-Named Button 4");
		jButton4.setForeground(new Color(100, 0, 0));
		compsToExperiment.add(jButton4);
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setFont(new Font("SansSerif", Font.BOLD, 10));
				compsToExperiment.validate();
				compsToExperiment.repaint();
			}
		});

		final JLabel label5 = new JLabel("Label 5");
		compsToExperiment.add(label5);
		JButton jButton5 = new JButton("5");
		jButton5.setForeground(new Color(100, 0, 100));
		compsToExperiment.add(jButton5);
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setFont(new Font("SansSerif", Font.BOLD, 10));
				compsToExperiment.validate();
				compsToExperiment.repaint();
			}
		});
		
		

		// Left to right component orientation is selected by default
		// Items run left to right and lines flow top to bottom.
		compsToExperiment.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		// Process the Apply component orientation button press
		pane.add(compsToExperiment, BorderLayout.CENTER);
		// The south layout constraint (bottom of container).
		pane.add(controls, BorderLayout.SOUTH);
		;
	}

	/**
	 * Create the GUI and show it. for thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		Examples frame = new Examples("Layout Demo");
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set up the content pane.
		frame.addComponentsToPane(frame.getContentPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Use an appropriate Look and Feel */
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}
}
