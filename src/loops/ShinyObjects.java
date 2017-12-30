//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ShinyObjects {
	public static void main(String[] args) {

		// 2. Ask the user how many shiny objects they want
		String n1 = JOptionPane.showInputDialog("Shiny objects #?");
		// 3. Play the sound that many times
		int n2 = Integer.parseInt(n1);
		// 1. Call the method below
		for (int i = 0; i < n2; i++) {
			playMisterZee();
		}

	}

	public static void playMisterZee() {
		try {

			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(ShinyObjects.class.getResource("shiny-objects.wav")));
			clip.start();
			Thread.sleep(36);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
