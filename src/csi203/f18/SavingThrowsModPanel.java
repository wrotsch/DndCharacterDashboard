package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class SavingThrowsModPanel extends JPanel{
	
	//create Saving throws text areas
	JTextArea strengthSaveText = new JTextArea();
	JTextArea dexteritySaveText = new JTextArea();
	JTextArea constitutionSaveText = new JTextArea();
	JTextArea intelligenceSaveText = new JTextArea();
	JTextArea wisdomSaveText = new JTextArea();
	JTextArea charismaSaveText = new JTextArea();
	
	//create JLabels for saving throws
	JLabel strengthSaveLabel = new JLabel("Strength");
	JLabel dexteritySaveLabel = new JLabel("Dexterity");
	JLabel constitutionSaveLabel = new JLabel("Constitution");
	JLabel intelligenceSaveLabel = new JLabel("Intelligence");
	JLabel wisdomSaveLabel = new JLabel("Wisdom");
	JLabel charismaSaveLabel = new JLabel("Charisma");
	
	//create Toggle Buttons for Saving throw proficiency
	JToggleButton jtbStrengthSaveMod = new JRadioButton();
	JToggleButton jtbDexteritySaveMod = new JRadioButton();
	JToggleButton jtbConstitutionSaveMod = new JRadioButton();
	JToggleButton jtbIntelligenceSaveMod = new JRadioButton();
	JToggleButton jtbWisdomSaveMod = new JRadioButton();
	JToggleButton jtbCharismaSaveMod = new JRadioButton();
	
	TitledBorder savingThrowsBorder = new TitledBorder("Saving Throws");
	
	public SavingThrowsModPanel() {
		this.setLayout(new GridLayout(6,3));
		//add components to frame
		this.add(jtbStrengthSaveMod);
		this.add(strengthSaveLabel);
		this.add(strengthSaveText);
		this.add(jtbDexteritySaveMod);
		this.add(dexteritySaveLabel);
		this.add(dexteritySaveText);
		this.add(jtbConstitutionSaveMod);
		this.add(constitutionSaveLabel);
		this.add(constitutionSaveText);
		this.add(jtbIntelligenceSaveMod);
		this.add(intelligenceSaveLabel);
		this.add(intelligenceSaveText);
		this.add(jtbWisdomSaveMod);
		this.add(wisdomSaveLabel);
		this.add(wisdomSaveText);
		this.add(jtbCharismaSaveMod);
		this.add(charismaSaveLabel);
		this.add(charismaSaveText);
		this.setBorder(savingThrowsBorder);
		
		//set tool tip texts
		jtbStrengthSaveMod.setToolTipText("Set Strength Save Proficiency");
		strengthSaveText.setToolTipText("Strength Saving Throw Modifier");
		jtbDexteritySaveMod.setToolTipText("Set Dexterity Save Proficiency");
		dexteritySaveText.setToolTipText("Dexterity Saving Throw Modifier");
		jtbConstitutionSaveMod.setToolTipText("Set Constitution Save Proficiency");
		constitutionSaveText.setToolTipText("Constitution Saving Throw Modifier");
		jtbIntelligenceSaveMod.setToolTipText("Set Intelligence Save Proficiency");
		intelligenceSaveText.setToolTipText("Intelligence Saving Throw Modifier");
		jtbWisdomSaveMod.setToolTipText("Set Wisdom Save Proficiency");
		wisdomSaveText.setToolTipText("Wisdom Saving Throw Modifier");
		jtbCharismaSaveMod.setToolTipText("Set Charisma Save Proficiency");
		charismaSaveText.setToolTipText("Charisma Saving Throw Modifier");
	}

}
