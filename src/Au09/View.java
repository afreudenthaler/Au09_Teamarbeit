package Au09;
import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
/** Date: 17.11.2016
 * @author Armin
 *	Version 1.0
 */
public class View extends JFrame{
    private Model m;
    private Controller c;
//    private drawPanel d;

    private JButton[][] button;
    
    
    
    
    //Konstruktor
    public View(Model m, Controller c){
        super();
        
        
        this.button = new JButton[7][7];

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
            	button[i][j] = new JButton();
        		button[i][j].setBackground(Color.yellow);;
        		button[i][j].addActionListener(c);
            	this.add(button[i][j]);
            }
        }
        this.m = m;
        this.c = c;

//        this.d = new drawPanel(m, c);
       
        
        this.setLayout(new GridLayout(0,7));
        this.button[0][0].setVisible(false);
        this.button[0][1].setVisible(false);
        this.button[0][2].setVisible(false);
        this.button[0][3].setVisible(false);
        this.button[0][4].setVisible(false);
        this.button[0][5].setVisible(false);
        this.button[0][6].setVisible(false);
        
        this.button[1][0].setVisible(false);
        this.button[2][0].setVisible(false);
        this.button[3][0].setVisible(false);
        this.button[4][0].setVisible(false);
        this.button[5][0].setVisible(false);
        this.button[6][0].setVisible(false);
        
        this.button[1][6].setVisible(false);
        this.button[2][6].setVisible(false);
        this.button[3][6].setVisible(false);
        this.button[4][6].setVisible(false);
        this.button[5][6].setVisible(false);
        this.button[6][6].setVisible(false);
        
        this.button[6][1].setVisible(false);
        this.button[6][2].setVisible(false);
        this.button[6][3].setVisible(false);
        this.button[6][4].setVisible(false);
        this.button[6][5].setVisible(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        this.setTitle("Lights-Out");

        this.setSize(400, 400);


        this.setVisible(true);
    }

    
    
    

    public void compare(JButton b){
    	for(int i = 0; i < button.length; i++){
    		for(int j = 0; j < button[i].length;++j){
    			if(button[i][j] == b){
    				if(this.m.getOneChecken(i, j) == true){
    					if(this.button[i][j].getBackground() == Color.black){ button[i][j].setBackground(Color.yellow); }else{ button[i][j].setBackground(Color.black); }
    					if(this.button[i-1][j].getBackground() == Color.black){ button[i-1][j].setBackground(Color.yellow); }else{ button[i-1][j].setBackground(Color.black); }
    					if(this.button[i][j-1].getBackground() == Color.black){ button[i][j-1].setBackground(Color.yellow); }else{ button[i][j-1].setBackground(Color.black); }
    					if(this.button[i][j+1].getBackground() == Color.black){ button[i][j+1].setBackground(Color.yellow); }else{ button[i][j+1].setBackground(Color.black); }
    					if(this.button[i+1][j].getBackground() == Color.black){ button[i+1][j].setBackground(Color.yellow); }else{ button[i+1][j].setBackground(Color.black); }
    					this.m.checken(i, j);
    				}else{
    					if(this.button[i][j].getBackground() == Color.black){ button[i][j].setBackground(Color.yellow); }else{ button[i][j].setBackground(Color.black); }
    					if(this.button[i-1][j].getBackground() == Color.black){ button[i-1][j].setBackground(Color.yellow); }else{ button[i-1][j].setBackground(Color.black); }
    					if(this.button[i][j-1].getBackground() == Color.black){ button[i][j-1].setBackground(Color.yellow); }else{ button[i][j-1].setBackground(Color.black); }
    					if(this.button[i][j+1].getBackground() == Color.black){ button[i][j+1].setBackground(Color.yellow); }else{ button[i][j+1].setBackground(Color.black); }
    					if(this.button[i+1][j].getBackground() == Color.black){ button[i+1][j].setBackground(Color.yellow); }else{ button[i+1][j].setBackground(Color.black); }
    					this.m.checken(i, j);
    				}
    			}
    		}
    	}
		System.out.println("hans");
    }

	/**
	 * @return the button
	 */
	public JButton[][] getButton() {
		return button;
	}
	
	/**
	 * @param button the button to set
	 */
	public void setButton(JButton[][] button) {
		this.button = button;
	}

	public JButton getOneButton(int i, int j) {
		return button[i][j];
	}
	
    }
    
    
    
    
    

