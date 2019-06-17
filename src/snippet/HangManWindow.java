package snippet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class HangManWindow {

	private JFrame frame;
	private GameManager gm;
	JButton btnA = new JButton("a");
	JButton btnB = new JButton("b");
	JButton btnC = new JButton("c");
	JButton btnD = new JButton("d");
	JButton btnE = new JButton("e");
	JButton btnF = new JButton("f");
	JButton btnG = new JButton("g");
	JButton btnH = new JButton("h");
	JButton btnI = new JButton("i");
	JButton btnJ = new JButton("j");
	JButton btnK = new JButton("k");
	JButton btnL = new JButton("l");
	JButton btnM = new JButton("m");
	JButton btnN = new JButton("n");
	JButton btnO = new JButton("o");
	JButton btnP = new JButton("p");
	JButton btnQ = new JButton("q");
	JButton btnR = new JButton("r");
	JButton btnS = new JButton("s");
	JButton btnT = new JButton("t");
	JButton btnU = new JButton("u");
	JButton btnV = new JButton("v");
	JButton btnW = new JButton("w");
	JButton btnX = new JButton("x");
	JButton btnY = new JButton("y");
	JButton btnZ = new JButton("z");
	JTextPane textPane = new JTextPane();
	JLabel lblTriesLeft = new JLabel("tries left:");
	JLabel lblHangman = new JLabel("Hangman v.1");
	JLabel nTries = new JLabel("");
	JLabel imgLable = new JLabel("New label");
	JButton btnStartGame = new JButton("Start Game");
	Handler h = new Handler();
	String hidden;
	Integer numberOfTries = 10; 
	ArrayList<JButton> letters = new ArrayList<JButton>(); 
	
	String toHide = "";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangManWindow window = new HangManWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HangManWindow() {
		initialize();
		gm = new GameManager("res/output-onlinerandomtools.txt");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 417, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		btnA.setBounds(10, 334, 45, 23);
		btnA.addActionListener(h);
		frame.getContentPane().add(btnA);
		letters.add(btnA);
		
		btnB.setBounds(65, 334, 45, 23);
		btnB.addActionListener(h);
		frame.getContentPane().add(btnB);
		letters.add(btnB);
		
		btnC.setBounds(120, 334, 45, 23);
		btnC.addActionListener(h);
		frame.getContentPane().add(btnC);
		letters.add(btnC);
	
		btnD.setBounds(175, 334, 45, 23);
		btnD.addActionListener(h);
		frame.getContentPane().add(btnD);
		letters.add(btnD);
		
		btnE.setBounds(230, 334, 45, 23);
		btnE.addActionListener(h);
		frame.getContentPane().add(btnE);
		letters.add(btnE);
		
		btnF.setBounds(285, 334, 45, 23);
		btnF.addActionListener(h);
		frame.getContentPane().add(btnF);
		letters.add(btnF);
		
		btnG.setBounds(340, 334, 45, 23);
		btnG.addActionListener(h);
		frame.getContentPane().add(btnG);
		letters.add(btnG);
		
		btnH.setBounds(10, 368, 45, 23);
		btnH.addActionListener(h);
		frame.getContentPane().add(btnH);
		letters.add(btnH);
		
		btnI.setBounds(65, 368, 45, 23);
		btnI.addActionListener(h);
		frame.getContentPane().add(btnI);
		letters.add(btnI);
		
		btnJ.setBounds(120, 368, 45, 23);
		btnJ.addActionListener(h);
		frame.getContentPane().add(btnJ);
		letters.add(btnJ);
		
		btnK.setBounds(175, 368, 45, 23);
		btnK.addActionListener(h);
		frame.getContentPane().add(btnK);
		letters.add(btnK);
		
		btnL.setBounds(230, 368, 45, 23);
		btnL.addActionListener(h);
		frame.getContentPane().add(btnL);
		letters.add(btnL);
		
		btnM.setBounds(285, 368, 45, 23);
		btnM.addActionListener(h);
		frame.getContentPane().add(btnM);
		letters.add(btnM);
		
		btnN.setBounds(340, 368, 45, 23);
		btnN.addActionListener(h);
		frame.getContentPane().add(btnN);
		letters.add(btnN);
		
		btnO.setBounds(10, 402, 45, 23);
		btnO.addActionListener(h);
		frame.getContentPane().add(btnO);
		letters.add(btnO);
		
		btnP.setBounds(65, 402, 45, 23);
		btnP.addActionListener(h);
		frame.getContentPane().add(btnP);
		letters.add(btnP);	
		
		btnQ.setBounds(120, 402, 45, 23);
		btnQ.addActionListener(h);
		frame.getContentPane().add(btnQ);	
		letters.add(btnQ);
		
		btnR.setBounds(175, 402, 45, 23);
		btnR.addActionListener(h);
		frame.getContentPane().add(btnR);
		letters.add(btnR);
		
		btnS.setBounds(230, 402, 45, 23);
		btnS.addActionListener(h);
		frame.getContentPane().add(btnS);
		letters.add(btnS);
		
		btnT.setBounds(285, 402, 45, 23);
		btnT.addActionListener(h);
		frame.getContentPane().add(btnT);
		letters.add(btnT);
		
		btnU.setBounds(340, 402, 45, 23);
		btnU.addActionListener(h);
		frame.getContentPane().add(btnU);
		letters.add(btnU);
		
		btnV.setBounds(38, 436, 45, 23);
		btnV.addActionListener(h);
		frame.getContentPane().add(btnV);
		letters.add(btnV);
		
		btnW.setBounds(93, 436, 45, 23);
		btnW.addActionListener(h);
		frame.getContentPane().add(btnW);
		letters.add(btnW);
		
		btnX.setBounds(175, 436, 45, 23);
		btnX.addActionListener(h);
		frame.getContentPane().add(btnX);
		letters.add(btnX);
		
		btnY.setBounds(252, 436, 45, 23);
		btnY.addActionListener(h);
		frame.getContentPane().add(btnY);
		letters.add(btnY);
		
		btnZ.setBounds(307, 436, 45, 23);
		btnZ.addActionListener(h);
		frame.getContentPane().add(btnZ);
		letters.add(btnZ);
		
		textPane.setBounds(10, 283, 375, 40);
		frame.getContentPane().add(textPane);
		
		lblTriesLeft.setBounds(10, 258, 73, 14);
		frame.getContentPane().add(lblTriesLeft);
		
		lblHangman.setBounds(10, 240, 100, 14);
		frame.getContentPane().add(lblHangman);
		
		nTries.setBounds(90, 258, 48, 14);
		nTries.setText(numberOfTries.toString());
		frame.getContentPane().add(nTries);
		
		btnStartGame.setBounds(139, 249, 119, 23);
		btnStartGame.addActionListener(h);
		frame.getContentPane().add(btnStartGame);
		
		
		imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\test 1.png"));
		imgLable.setBounds(110, 11, 165, 221);
		frame.getContentPane().add(imgLable);
	}
	
	public class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnStartGame) {
				
				for (int i = 0; i < letters.size() ; i++) {
					letters.get(i).setEnabled(true);
				}
				toHide = gm.chooseWord();
				hidden = "";
				for(int i = 0; i < toHide.length() ; i++) {
					hidden = hidden + "-";
				}
				textPane.setText(hidden);
				numberOfTries = 10;
				nTries.setText(numberOfTries.toString());
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\0try.png"));
			}
			else if(e.getSource() == btnA) {
				btnA.setEnabled(false);
				if(gm.checkGuess('a')) {
					hidden = gm.rearange(hidden, 'a');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
				if(gm.checkWin(hidden)) {
					
				}
				else if(gm.checkLoose(numberOfTries)) {
					
				}
			}
			else if(e.getSource() == btnB) {
				btnB.setEnabled(false);
				if(gm.checkGuess('b')) {
					hidden = gm.rearange(hidden, 'b');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnC) {
				btnC.setEnabled(false);
				if(gm.checkGuess('c')) {
					hidden = gm.rearange(hidden, 'c');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnD) {
				btnD.setEnabled(false);
				if(gm.checkGuess('d')) {
					hidden = gm.rearange(hidden, 'd');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnE) {
				btnE.setEnabled(false);
				if(gm.checkGuess('e')) {
					hidden = gm.rearange(hidden, 'e');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnF) {
				btnF.setEnabled(false);
				if(gm.checkGuess('f')) {
					hidden = gm.rearange(hidden, 'f');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnG) {
				btnG.setEnabled(false);
				if(gm.checkGuess('g')) {
					hidden = gm.rearange(hidden, 'g');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnH) {
				btnH.setEnabled(false);
				if(gm.checkGuess('h')) {
					hidden = gm.rearange(hidden, 'h');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnI) {
				btnI.setEnabled(false);
				if(gm.checkGuess('i')) {
					hidden = gm.rearange(hidden, 'i');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnJ) {
				btnJ.setEnabled(false);
				if(gm.checkGuess('j')) {
					hidden = gm.rearange(hidden, 'j');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnK) {
				btnK.setEnabled(false);
				if(gm.checkGuess('k')) {
					hidden = gm.rearange(hidden, 'k');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnL) {
				btnL.setEnabled(false);
				if(gm.checkGuess('l')) {
					hidden = gm.rearange(hidden, 'l');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnM) {
				btnM.setEnabled(false);
				if(gm.checkGuess('m')) {
					hidden = gm.rearange(hidden, 'm');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnN) {
				btnN.setEnabled(false);
				if(gm.checkGuess('n')) {
					hidden = gm.rearange(hidden, 'n');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnO) {
				btnO.setEnabled(false);
				if(gm.checkGuess('o')) {
					hidden = gm.rearange(hidden, 'o');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnP) {
				btnP.setEnabled(false);
				if(gm.checkGuess('p')) {
					hidden = gm.rearange(hidden, 'p');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnQ) {
				btnQ.setEnabled(false);
				if(gm.checkGuess('q')) {
					hidden = gm.rearange(hidden, 'q');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnR) {
				btnR.setEnabled(false);
				if(gm.checkGuess('r')) {
					hidden = gm.rearange(hidden, 'r');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnS) {
				btnS.setEnabled(false);
				if(gm.checkGuess('s')) {
					hidden = gm.rearange(hidden, 's');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnT) {
				btnT.setEnabled(false);
				if(gm.checkGuess('t')) {
					hidden = gm.rearange(hidden, 't');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnU) {
				btnU.setEnabled(false);
				if(gm.checkGuess('u')) {
					hidden = gm.rearange(hidden, 'u');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnV) {
				btnV.setEnabled(false);
				if(gm.checkGuess('v')) {
					hidden = gm.rearange(hidden, 'v');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnW) {
				btnW.setEnabled(false);
				if(gm.checkGuess('w')) {
					hidden = gm.rearange(hidden, 'w');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnX) {
				btnX.setEnabled(false);
				if(gm.checkGuess('x')) {
					hidden = gm.rearange(hidden, 'x');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnY) {
				btnY.setEnabled(false);
				if(gm.checkGuess('y')) {
					hidden = gm.rearange(hidden, 'y');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
			else if(e.getSource() == btnZ) {
				btnZ.setEnabled(false);
				if(gm.checkGuess('z')) {
					hidden = gm.rearange(hidden, 'z');
					textPane.setText(hidden);
				}
				else{
					numberOfTries --;
					nTries.setText(numberOfTries.toString());
				}
			}
		
			if(gm.checkLoose(numberOfTries)) {
				
				for(int i = 0; i < letters.size() ; i++) {
					letters.get(i).setEnabled(false);
				}
					
			}
			if(gm.checkWin(hidden)) {
				for(int i = 0; i < letters.size() ; i++) {
					letters.get(i).setEnabled(false);
				}
			}
			
			if(numberOfTries == 9) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\1try.png"));
			}
			else if(numberOfTries == 8) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\2try.png"));
			}
			else if(numberOfTries == 7) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\3try.png"));
			}
			else if(numberOfTries == 6) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\4try.png"));
			}
			else if(numberOfTries == 5) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\5try.png"));
			}
			else if(numberOfTries == 4) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\6try.png"));
			}
			else if(numberOfTries == 3) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\7try.png"));
			}
			else if(numberOfTries == 2) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\8try.png"));
			}
			else if(numberOfTries == 1) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\9try.png"));
			}
			else if(numberOfTries == 0) {
				imgLable.setIcon(new ImageIcon("C:\\Users\\victo\\workspace\\Hang Man\\res\\10try.png"));
			}
			
		}
	}
}
