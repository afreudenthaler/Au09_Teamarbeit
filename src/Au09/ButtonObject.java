/**
 * 
 */
package Au09;

import javax.swing.*;

/**
 * @author Jan Langela
 * @version 17.11.2016
 */
public class ButtonObject {
	private JButton knopf;
	private int x;
	private int y;
	private boolean active;
	
	public ButtonObject(int x, int y, boolean active){
		this.knopf = new JButton();
		this.x = x;
		this.y = y;
		this.active = active;
	}
}
