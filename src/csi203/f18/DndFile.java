package csi203.f18;

import java.awt.*;
import java.io.*;

import javax.swing.*;

public class DndFile implements java.io.Serializable{

	//one variable for each variable in the dashboard
	String strengthField;
	String strengthAdv;
	String dexterityField;
	String dexterityAdv;
	String constitutionField;
	String constitutionAdv;
	String intelligenceField;
	String intelligenceAdv;
	String wisdomField;
	String wisdomAdv;
	String charismaField;
	String charismaAdv;
	boolean inpsirationButton;
	String proficiencyBonusText;
	String acrobaticsText;
	boolean acrobaticsButton;
	String animalHandlingText;
	boolean animalHandlingButton;
	String arcanaText;
	boolean arcanaButton;
	String athleticsText;
	boolean athleticsButton;
	String deceptionText;
	boolean deceptionButton;
	String historyText;
	boolean historyButton;
	String insightText;
	boolean insightButton;
	String intimidationText;
	boolean intimidationButton;
	String investigationText;
	boolean investigationButton;
	String medicineText;
	boolean medicineButton;
	String natureText;
	boolean natureButton;
	String perceptionText;
	boolean perceptionButton;
	String performanceText;
	boolean performanceButton;
	String persuasionText;
	boolean persuasionButton;
	String religionText;
	boolean religionButton;
	String sleightOfHandText;
	boolean sleightOfHandButton;
	String stealthText;
	boolean stealthButton;
	String survivalText;
	boolean survivalButton;
	String strengthSaveText;
	boolean strengthSaveMod;
	String dexteritySaveText;
	boolean dexteritySaveMod;
	String constitutionSaveText;
	boolean constitutionSaveMod;
	String intelligenceSaveText;
	boolean intelligenceSaveMod;
	String wisdomSaveText;
	boolean wisdomSaveMod;
	String charismaSaveText;
	boolean charismaSaveMod;
	String characterName;
	String characterClassLevel;
	Object characterRace;
	Object characterBackground;
	Object characterAlignment;
	String playerName;
	String experiencePoints;
	String proficiencies;
	String armor;
	String armorAC;
	String copper;
	String silver; 
	String electrum;
	String gold;
	String platinum;
	String equipment;
	String characterArmorClass;
	String initiative;
	String speed;
	String currentHitPoints;
	String hitPointMaximum;
	String temporaryHitPoints;
	String totalHitDice;
	String hitDiceType;
	boolean deathSaveSuccess1;
	boolean deathSaveSuccess2;
	boolean deathSaveSuccess3;
	boolean deathSaveFailure1;
	boolean deathSaveFailure2;
	boolean deathSaveFailure3;
	String weaponName1;
	String weaponName2;
	String weaponName3;
	String weaponAttack1;
	String weaponAttack2;
	String weaponAttack3;
	String weaponDamage1;
	String weaponDamage2;
	String weaponDamage3; 
	
	//Zero Parameter constructor for downloading .dnd files
	public DndFile() {
		
	};
	
	//One parameter constructor for creating .dnd files
	public DndFile(DashboardFrame frame) {
		
		//set each variable to its respective variable value 
		strengthField = frame.stats.genStats.strengthField.getText();
		strengthAdv = frame.stats.genStats.strengthAdv.getText();
		dexterityField = frame.stats.genStats.dexterityField.getText();
		dexterityAdv = frame.stats.genStats.dexterityAdv.getText();
		constitutionField = frame.stats.genStats.constitutionField.getText();
		constitutionAdv = frame.stats.genStats.constitutionAdv.getText();
		intelligenceField = frame.stats.genStats.intelligenceField.getText();
		intelligenceAdv = frame.stats.genStats.intelligenceAdv.getText();
		wisdomField = frame.stats.genStats.wisdomField.getText();
		wisdomAdv = frame.stats.genStats.wisdomAdv.getText();
		charismaField = frame.stats.genStats.charismaField.getText();
		charismaAdv = frame.stats.genStats.charismaAdv.getText();
		inpsirationButton = frame.stats.genStats.inspiration.inspirationButton.getModel().isSelected();
		proficiencyBonusText = frame.stats.genStats.inspiration.proficiencyBonusText.getText();
		acrobaticsText = frame.stats.rightStats.skills.acrobaticsText.getText();
		acrobaticsButton = frame.stats.rightStats.skills.acrobaticsButton.getModel().isSelected();
		animalHandlingText = frame.stats.rightStats.skills.animalHandlingText.getText();
		animalHandlingButton = frame.stats.rightStats.skills.animalHandlingButton.getModel().isSelected();
		arcanaText = frame.stats.rightStats.skills.arcanaText.getText();
		arcanaButton = frame.stats.rightStats.skills.arcanaButton.getModel().isSelected();
		athleticsText = frame.stats.rightStats.skills.athleticsText.getText();
		athleticsButton = frame.stats.rightStats.skills.athleticsButton.getModel().isSelected();
		deceptionText = frame.stats.rightStats.skills.deceptionText.getText();
		deceptionButton = frame.stats.rightStats.skills.deceptionButton.getModel().isSelected();
		historyText = frame.stats.rightStats.skills.historyText.getText();
		historyButton = frame.stats.rightStats.skills.historyButton.getModel().isSelected();
		insightText = frame.stats.rightStats.skills.insightText.getText();
		insightButton = frame.stats.rightStats.skills.insightButton.getModel().isSelected();
		intimidationText = frame.stats.rightStats.skills.intimidationText.getText();
		intimidationButton = frame.stats.rightStats.skills.intimidationButton.getModel().isSelected();
		investigationText = frame.stats.rightStats.skills.investigationText.getText();
		investigationButton = frame.stats.rightStats.skills.investigationButton.getModel().isSelected();
		medicineText = frame.stats.rightStats.skills.medicineText.getText();
		medicineButton = frame.stats.rightStats.skills.medicineButton.getModel().isSelected();
		natureText = frame.stats.rightStats.skills.natureText.getText();
		natureButton = frame.stats.rightStats.skills.natureButton.getModel().isSelected();
		perceptionText = frame.stats.rightStats.skills.perceptionText.getText();
		perceptionButton = frame.stats.rightStats.skills.perceptionButton.getModel().isSelected();
		performanceText = frame.stats.rightStats.skills.performanceText.getText();
		performanceButton = frame.stats.rightStats.skills.performanceButton.getModel().isSelected();
		persuasionText = frame.stats.rightStats.skills.persuasionText.getText();
		persuasionButton = frame.stats.rightStats.skills.persuasionButton.getModel().isSelected();
		religionText = frame.stats.rightStats.skills.religionText.getText();
		religionButton = frame.stats.rightStats.skills.religionButton.getModel().isSelected();
		sleightOfHandText = frame.stats.rightStats.skills.sleightOfHandText.getText();
		sleightOfHandButton = frame.stats.rightStats.skills.sleightOfHandButton.getModel().isSelected();
		stealthText = frame.stats.rightStats.skills.stealthText.getText();
		stealthButton = frame.stats.rightStats.skills.stealthButton.getModel().isSelected();
		survivalText = frame.stats.rightStats.skills.survivalText.getText();
		survivalButton = frame.stats.rightStats.skills.survivalButton.getModel().isSelected();
		strengthSaveText = frame.stats.rightStats.savingThrows.strengthSaveText.getText();
		strengthSaveMod = frame.stats.rightStats.savingThrows.jtbStrengthSaveMod.getModel().isSelected();
		 dexteritySaveText = frame.stats.rightStats.savingThrows.dexteritySaveText.getText();
		dexteritySaveMod = frame.stats.rightStats.savingThrows.jtbDexteritySaveMod.getModel().isSelected();
		constitutionSaveText = frame.stats.rightStats.savingThrows.constitutionSaveText.getText();
		constitutionSaveMod = frame.stats.rightStats.savingThrows.jtbConstitutionSaveMod.getModel().isSelected();
		intelligenceSaveText = frame.stats.rightStats.savingThrows.intelligenceSaveText.getText();
		intelligenceSaveMod = frame.stats.rightStats.savingThrows.jtbIntelligenceSaveMod.getModel().isSelected();
		wisdomSaveText = frame.stats.rightStats.savingThrows.wisdomSaveText.getText();
		wisdomSaveMod = frame.stats.rightStats.savingThrows.jtbWisdomSaveMod.getModel().isSelected();
		charismaSaveText = frame.stats.rightStats.savingThrows.charismaSaveText.getText();
		charismaSaveMod = frame.stats.rightStats.savingThrows.jtbCharismaSaveMod.getModel().isSelected();
		characterName = frame.bio.name.getText();
		characterClassLevel = frame.bio.classLevel.getText();
		characterRace = frame.bio.race.getSelectedItem();
		characterBackground = frame.bio.background.getSelectedItem();
		characterAlignment = frame.bio.alignment.getSelectedItem();
		playerName = frame.bio.playerName.getText();
		experiencePoints = frame.bio.experiencePoints.getText();
		proficiencies = frame.bottom.proficiencies.proficiencies.getText();
		armor = frame.bottom.equipment.armor.armor.getText();
		armorAC = frame.bottom.equipment.armor.ac.getText();
		copper = frame.bottom.equipment.currency.copperText.getText();
		silver = frame.bottom.equipment.currency.silverText.getText();
		electrum = frame.bottom.equipment.currency.electrumText.getText();
		gold = frame.bottom.equipment.currency.goldText.getText();
		platinum = frame.bottom.equipment.currency.platinumText.getText();
		equipment = frame.bottom.equipment.equipment.getText();
		characterArmorClass = frame.combat.topstats.armorClass.armorClassText.getText();
		initiative = frame.combat.topstats.initiative.initiativeText.getText();
		speed = frame.combat.topstats.speed.speedText.getText();
		currentHitPoints = frame.combat.hitpoints.currentHitPoints.getText();
		hitPointMaximum = frame.combat.hitpoints.hitPointMaximum.hitPointMaximumText.getText();
		temporaryHitPoints = frame.combat.hitpoints.temporaryHitPoints.temporaryHitPoints.getText();
		totalHitDice = frame.combat.bottom.hitDice.totalHitDiceText.getText();
		hitDiceType = frame.combat.bottom.hitDice.diceType.getText();
		deathSaveSuccess1 = frame.combat.bottom.deathSaves.jrbsuccess1.isSelected();
		deathSaveSuccess2 = frame.combat.bottom.deathSaves.jrbsuccess2.isSelected();
		deathSaveSuccess3 = frame.combat.bottom.deathSaves.jrbsuccess3.isSelected();
		deathSaveFailure1 = frame.combat.bottom.deathSaves.jrbfailure1.isSelected();
		deathSaveFailure2 = frame.combat.bottom.deathSaves.jrbfailure2.isSelected();
		deathSaveFailure3 = frame.combat.bottom.deathSaves.jrbfailure3.isSelected();
		weaponName1 = frame.wAndD.weapons.weapons.weaponName1.getText();
		weaponName2 = frame.wAndD.weapons.weapons.weaponName2.getText();
		weaponName3 = frame.wAndD.weapons.weapons.weaponName3.getText();
		weaponAttack1 = frame.wAndD.weapons.weapons.weaponAttack1.getText();
		weaponAttack2 = frame.wAndD.weapons.weapons.weaponAttack2.getText();
		weaponAttack3 = frame.wAndD.weapons.weapons.weaponAttack3.getText();
		weaponDamage1 = frame.wAndD.weapons.weapons.weaponDamage1.getText();
		weaponDamage2 = frame.wAndD.weapons.weapons.weaponDamage2.getText();
		weaponDamage3 = frame.wAndD.weapons.weapons.weaponDamage3.getText();
	}
	
	public void createFile(String fileName) {
		try {
			//establish stream out to file
			FileOutputStream ofstream = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(ofstream);
			
			//write all variable info onto file
			out.writeObject(this);
			
			//close output stream
			out.close();
			ofstream.close();
			
		}
		catch(IOException io){
			JOptionPane.showMessageDialog(null, "IO Excpetion has been caught.");
		}
	}
}
