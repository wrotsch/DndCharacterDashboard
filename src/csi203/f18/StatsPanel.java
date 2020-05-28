package csi203.f18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StatsPanel extends JPanel {

	//create GenStatPanel and StatPanelRight objects
	GenStatPanel genStats = new GenStatPanel();
	StatsPanelRight rightStats = new StatsPanelRight();
	
	String advantage;
	
	StatsPanel(){
		//set Layout and add genStats and rightStats objects to panel
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(genStats);
		this.add(rightStats);
		
		//action Listener for strengthField entry
		genStats.strengthField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate advantage from Field data
				advantage = genStats.calculateAdv(genStats.strengthField);
				//set advantage to appropriate fields
				genStats.strengthAdv.setText(advantage);
				rightStats.savingThrows.strengthSaveText.setText(advantage);
				rightStats.skills.athleticsText.setText(advantage);
			}
		});
		//action Listener for dexterityField entry
		genStats.dexterityField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate advantage from field data
				advantage = genStats.calculateAdv(genStats.dexterityField);
				//set advantage to appropriate fields
				genStats.dexterityAdv.setText(advantage);
				rightStats.savingThrows.dexteritySaveText.setText(advantage);
				rightStats.skills.acrobaticsText.setText(advantage);
				rightStats.skills.sleightOfHandText.setText(advantage);
				rightStats.skills.stealthText.setText(advantage);
			}
		});
		//action Listener for constitutionField entry
		genStats.constitutionField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate advantage from field data
				advantage = genStats.calculateAdv(genStats.constitutionField);
				//set advantage to appropriate fields
				genStats.constitutionAdv.setText(advantage);
				rightStats.savingThrows.constitutionSaveText.setText(advantage);
			}
		});
		//action Listener for intelligenceField entry
		genStats.intelligenceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate advantage from field data
				advantage = genStats.calculateAdv(genStats.intelligenceField);
				//set advantage to appropriate fields
				genStats.intelligenceAdv.setText(advantage);
				rightStats.savingThrows.intelligenceSaveText.setText(advantage);
				rightStats.skills.arcanaText.setText(advantage);
				rightStats.skills.historyText.setText(advantage);
				rightStats.skills.investigationText.setText(advantage);
				rightStats.skills.natureText.setText(advantage);
				rightStats.skills.religionText.setText(advantage);
			}
		});
		//action Listener for wisdomField entry
		genStats.wisdomField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate advantage from field data
				advantage = genStats.calculateAdv(genStats.wisdomField);
				//set advantage to appropriate fields
				genStats.wisdomAdv.setText(advantage);
				rightStats.savingThrows.wisdomSaveText.setText(advantage);
				rightStats.skills.animalHandlingText.setText(advantage);
				rightStats.skills.insightText.setText(advantage);
				rightStats.skills.medicineText.setText(advantage);
				rightStats.skills.perceptionText.setText(advantage);
				rightStats.skills.survivalText.setText(advantage);
			}	
		});
		//action Listener for wisdomField entry
		genStats.charismaField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate advantage from field data
				advantage = genStats.calculateAdv(genStats.charismaField);
				//set advantage to appropriate fields
				genStats.charismaAdv.setText(advantage);
				rightStats.savingThrows.charismaSaveText.setText(advantage);
				rightStats.skills.deceptionText.setText(advantage);
				rightStats.skills.intimidationText.setText(advantage);
				rightStats.skills.performanceText.setText(advantage);
				rightStats.skills.persuasionText.setText(advantage);
			}
		});
		//action Listener for acrobatics proficiency button
		rightStats.skills.acrobaticsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.acrobaticsButton.getModel().isSelected();//variable for selection state of button
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.dexterityField);
				if(selected == true)//increment skill stat by proficiency stat if button selected
					if(base + bonus >= 0)
						rightStats.skills.acrobaticsText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.acrobaticsText.setText(Integer.toString(bonus + base));
				else if(selected == false)//return skill stat to base if deselected
					if(base >= 0)
						rightStats.skills.acrobaticsText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.acrobaticsText.setText(Integer.toString(base));
			}
		});
		//action listener for animal handling proficiency button
		rightStats.skills.animalHandlingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.animalHandlingButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.wisdomField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.animalHandlingText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.animalHandlingText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.animalHandlingText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.animalHandlingText.setText(Integer.toString(base));
			}
		});
		//action listener for animal handling proficiency button
		rightStats.skills.arcanaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.arcanaButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.intelligenceField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.arcanaText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.arcanaText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.arcanaText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.arcanaText.setText(Integer.toString(base));
			}
		});
		//action listener for animal handling proficiency button
		rightStats.skills.athleticsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.athleticsButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.strengthField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.athleticsText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.athleticsText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.athleticsText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.athleticsText.setText(Integer.toString(base));
			}
		});
		//action listener for deception proficiency button
		rightStats.skills.deceptionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.deceptionButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.charismaField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.deceptionText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.deceptionText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.deceptionText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.deceptionText.setText(Integer.toString(base));
			}
		});
		//action listener for history proficiency button
		rightStats.skills.historyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.historyButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.intelligenceField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.historyText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.historyText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.historyText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.historyText.setText(Integer.toString(base));
			}
		});
		//action listener for insight proficiency button
		rightStats.skills.insightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.insightButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.wisdomField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.insightText.setText("+" + Integer.toString(bonus + base));
					else 
							rightStats.skills.insightText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.insightText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.insightText.setText(Integer.toString(base));
			}
		});
		//action listener for intimidation proficiency button
		rightStats.skills.intimidationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.intimidationButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.charismaField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.intimidationText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.intimidationText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.intimidationText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.intimidationText.setText(Integer.toString(base));
			}
		});
		//action listener for investigation proficiency button
		rightStats.skills.investigationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.investigationButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.intelligenceField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.investigationText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.investigationText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.investigationText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.investigationText.setText(Integer.toString(base));
			}
		});
		//action listener for medicine proficiency button
		rightStats.skills.medicineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.medicineButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.wisdomField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.medicineText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.medicineText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.medicineText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.medicineText.setText(Integer.toString(base));
			}
		});
		//action listener for nature proficiency button
		rightStats.skills.natureButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.natureButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.intelligenceField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.natureText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.natureText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.natureText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.natureText.setText(Integer.toString(base));
			}
		});
		//action listener for perception proficiency button
		rightStats.skills.perceptionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.perceptionButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.wisdomField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.perceptionText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.perceptionText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.perceptionText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.perceptionText.setText(Integer.toString(base));
			}
		});
		//action listener for performance proficiency button
		rightStats.skills.performanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.performanceButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.charismaField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.performanceText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.performanceText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.performanceText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.performanceText.setText(Integer.toString(base));
			}
		});
		//action listener for persuasion proficiency button
		rightStats.skills.persuasionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.persuasionButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.charismaField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.persuasionText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.persuasionText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.persuasionText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.persuasionText.setText(Integer.toString(base));
			}
		});
		//action listener for religion proficiency button
		rightStats.skills.religionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.religionButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.intelligenceField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.religionText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.religionText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.religionText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.religionText.setText(Integer.toString(base));
			}
		});
		//action listener for sleight of hand proficiency button
		rightStats.skills.sleightOfHandButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.sleightOfHandButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.dexterityField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.sleightOfHandText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.sleightOfHandText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.sleightOfHandText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.sleightOfHandText.setText(Integer.toString(base));
			}
		});
		//action listener for stealth proficiency button
		rightStats.skills.stealthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.stealthButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.dexterityField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.stealthText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.stealthText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.stealthText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.stealthText.setText(Integer.toString(base));
			}
		});
		//action listener for survival proficiency button
		rightStats.skills.survivalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.skills.survivalButton.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.wisdomField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.skills.survivalText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.skills.survivalText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.skills.survivalText.setText("+" + Integer.toString(base));
					else 
						rightStats.skills.survivalText.setText(Integer.toString(base));
			}
		});
		//action listener for strength saving throw proficiency button
		rightStats.savingThrows.jtbStrengthSaveMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.savingThrows.jtbStrengthSaveMod.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.strengthField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.savingThrows.strengthSaveText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.savingThrows.strengthSaveText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.savingThrows.strengthSaveText.setText("+" + Integer.toString(base));
					else 
						rightStats.savingThrows.strengthSaveText.setText(Integer.toString(base));
			}
		});
		//action listener for dexterity saving throw proficiency button
		rightStats.savingThrows.jtbDexteritySaveMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.savingThrows.jtbDexteritySaveMod.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.dexterityField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.savingThrows.dexteritySaveText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.savingThrows.dexteritySaveText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.savingThrows.dexteritySaveText.setText("+" + Integer.toString(base));
					else 
						rightStats.savingThrows.dexteritySaveText.setText(Integer.toString(base));
			}
		});
		//action listener for constitution saving throw proficiency button
		rightStats.savingThrows.jtbConstitutionSaveMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.savingThrows.jtbConstitutionSaveMod.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.constitutionField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.savingThrows.constitutionSaveText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.savingThrows.constitutionSaveText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.savingThrows.constitutionSaveText.setText("+" + Integer.toString(base));
					else 
						rightStats.savingThrows.constitutionSaveText.setText(Integer.toString(base));
			}
		});
		//action listener for intelligence saving throw proficiency button
		rightStats.savingThrows.jtbIntelligenceSaveMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.savingThrows.jtbIntelligenceSaveMod.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.intelligenceField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.savingThrows.intelligenceSaveText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.savingThrows.intelligenceSaveText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.savingThrows.intelligenceSaveText.setText("+" + Integer.toString(base));
					else 
						rightStats.savingThrows.intelligenceSaveText.setText(Integer.toString(base));
			}
		});
		//action listener for wisdom saving throw proficiency button
		rightStats.savingThrows.jtbWisdomSaveMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.savingThrows.jtbWisdomSaveMod.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.wisdomField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.savingThrows.wisdomSaveText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.savingThrows.wisdomSaveText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.savingThrows.wisdomSaveText.setText("+" + Integer.toString(base));
					else 
						rightStats.savingThrows.wisdomSaveText.setText(Integer.toString(base));
			}
		});
		//action listener for charisma saving throw proficiency button
		rightStats.savingThrows.jtbCharismaSaveMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = rightStats.savingThrows.jtbCharismaSaveMod.getModel().isSelected();
				int bonus = Integer.parseInt(genStats.inspiration.proficiencyBonusText.getText());
				int base = genStats.calculateAdvInt(genStats.charismaField);
				if(selected == true)
					if(base + bonus >= 0)
						rightStats.savingThrows.charismaSaveText.setText("+" + Integer.toString(bonus + base));
					else 
						rightStats.savingThrows.charismaSaveText.setText(Integer.toString(bonus + base));
				else if(selected == false)
					if(base >= 0)
						rightStats.savingThrows.charismaSaveText.setText("+" + Integer.toString(base));
					else 
						rightStats.savingThrows.charismaSaveText.setText(Integer.toString(base));
			}
		});
	}	
}
