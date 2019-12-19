// This is the Facebook_Graphics class
// Dr. Xiaolin Hu
// 04/05/2011

import java.awt.*;

import jpb.*;

public class Facebook_Graphics_HW5 {

	private String name;
	private String content;
	DrawableFrame df;
	private Graphics g;
	private Point offset;

	public Facebook_Graphics_HW5(String nm, Graphics g, Point startingPoint) {
		content = "undefined";
		name = nm;

		this.offset = startingPoint;
		this.g = g;
		// display name
		g.drawString(name + "'s mood is undefined.", startingPoint.x + 20,
				startingPoint.y + 75);
		g.drawRect(startingPoint.x, startingPoint.y, 200, 150);

	}

	public void setContent(String newContent) {
		content = newContent;
		if (content.equals("happy")) {
			g.setColor(Color.red);
			g.fillRect(this.offset.x + 0, this.offset.y + 0, 200, 150);
			g.setColor(Color.black);
			// display mood
			g.drawString(name + "'s mood is:" + "happy", this.offset.x + 20,
					this.offset.y + 75);
		} else if (content.equals("sad")) {
			g.setColor(Color.green);
			g.fillRect(this.offset.x + 0, this.offset.y + 0, 200, 150);
			g.setColor(Color.black);
			g.drawString(name + "'s mood is:" + content, this.offset.x + 20,
					this.offset.y + 75);
		} else {
			g.setColor(Color.white);
			g.fillRect(this.offset.x + 0, this.offset.y + 0, 200, 150);
			g.setColor(Color.black);
			g.drawString(name + "'s mood is:" + content, this.offset.x + 20,
					this.offset.y + 75);
		}
		g.drawRect(offset.x, offset.y, 200, 150);
	}

	public String getContent() {
		return content;
	}

}