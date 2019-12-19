import java.awt.Graphics;
import java.awt.Point;

// This is the FacebookPerson_Graphics class
// Dr. Xiaolin Hu
// 04/05/2011

public class FacebookPerson_Graphics_HW5 {

	private String myName;
	private String myMood;
	private Facebook_Graphics_HW5 myfacebook;

	public FacebookPerson_Graphics_HW5(String name, Graphics g, Point offset) {
		myName = name;
		myfacebook = new Facebook_Graphics_HW5(myName, g, offset);
	}

	public String getName() {
		return myName;
	}

	public void setMood(String newMood) {
		myMood = newMood;
		myfacebook.setContent(myMood);
	}

	public String getMood() {
		return myMood;
	}

}