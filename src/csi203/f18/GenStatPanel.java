package csi203.f18;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GenStatPanel extends JPanel {
	
	//create JTextFields and JTextAreas
	JTextField strengthField = new JTextField(5);
	JTextArea strengthAdv = new JTextArea();
	JTextField dexterityField = new JTextField(5);
	JTextArea dexterityAdv = new JTextArea();
	JTextField constitutionField = new JTextField(5);
	JTextArea constitutionAdv = new JTextArea();
	JTextField intelligenceField = new JTextField(5);
	JTextArea intelligenceAdv = new JTextArea();
	JTextField wisdomField = new JTextField(5);
	JTextArea wisdomAdv = new JTextArea();
	JTextField charismaField = new JTextField(5);
	JTextArea charismaAdv = new JTextArea();
	
	//create JLabels
	JLabel strengthLabel = new JLabel("Strength");
	JLabel dexterityLabel = new JLabel("Dexterity");
	JLabel constitutionLabel = new JLabel("Constitution");
	JLabel intelligenceLabel = new JLabel("Intelligence");
	JLabel wisdomLabel = new JLabel("Wisdom");
	JLabel charismaLabel = new JLabel("Charisma");
	
	//add Inspiration Panel to Panel
	InspirationPanel inspiration = new InspirationPanel();
	
	int advantageInt;
	
	public GenStatPanel(){
		//Set BoxLayout Manager
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		//add all components to panel
		this.add(inspiration);
		this.add(strengthLabel);
		this.add(strengthField);
		this.add(strengthAdv);
		this.add(dexterityLabel);
		this.add(dexterityField);
		this.add(dexterityAdv);
		this.add(constitutionLabel);
		this.add(constitutionField);
		this.add(constitutionAdv);
		this.add(intelligenceLabel);
		this.add(intelligenceField);
		this.add(intelligenceAdv);
		this.add(wisdomLabel);
		this.add(wisdomField);
		this.add(wisdomAdv);
		this.add(charismaLabel);
		this.add(charismaField);
		this.add(charismaAdv);
		
		//set Tool Tip Text for all components
		strengthField.setToolTipText("Enter Strength stat (ex. 18) and hit Enter");
		strengthAdv.setToolTipText("Strength Modifier (Calculated from Strength stat)");
		dexterityField.setToolTipText("Enter Dexterity stat (ex.18) and hit Enter");
		dexterityAdv.setToolTipText("Dexterity Modifier (Calculated from Dexterity stat");
		constitutionField.setToolTipText("Enter Constitution stat (ex.18) and hit Enter");
		constitutionAdv.setToolTipText("Consitution Modifier (Calculated from Constitution stat");
		intelligenceField.setToolTipText("Enter Intelligence stat (ex. 18) and hit Enter");
		intelligenceAdv.setToolTipText("Intelligence Modifier (Calculated from Intelligence stat");
		wisdomField.setToolTipText("Enter Wisdom stat (ex. 18) and hit Enter");
		wisdomAdv.setToolTipText("Wisdom Modifier (Calculated from Wisdom stat");
		charismaField.setToolTipText("Enter Charisma stat (ex. 18) and hit Enter");
		charismaAdv.setToolTipText("Charisma Modifier (Calculated from Charisma stat");
	}
	
	//advantage calculator
	public int calculateAdvInt(JTextField j) {
		int stat = Integer.parseInt(j.getText());//set text field data to int
		int advantageInt = Math.floorDiv((stat-10),2);//calculate advantage by set formula
		//catches for exception cases
		if(stat == 9)
			advantageInt = -1;
		if(stat == 13|| stat == 12)
			advantageInt = 1;
		//return value
		return advantageInt;
	}
	//Advantage creator
	public String calculateAdv(JTextField j) {
	String advantage;
	int stat = Integer.parseInt(j.getText());//set text field data to int
	int advantageInt = calculateAdvInt(j);
	advantage = Integer.toString(advantageInt);//set advantage to string
	//if positive, add + to front of string
	if(advantageInt >= 0)
		advantage = "+" + advantage;
	return advantage;
	}
	
}
