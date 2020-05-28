package csi203.f18;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class BiographyPanel extends JPanel {

	//Set combo box choice arrays
	String[] races = {"Hill Dwarf", "Mountain Dwarf", "High Elf", "Wood Elf", "Dark Elf (Drow)", "Lightfoot Halfling",
			"Stout Halfling", "Human", "Dragonborn", "Forest Gnome", "Rock Gnome", "Half-Elf", "Half-Orc", "Tiefling"};
	String[] backgrounds = {"Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Guild Artisan", "Hermit", 
			"Noble", "Outlander", "Sage", "Sailor", "Soldier", "Urchin"};
	String[] alignments = {"Lawful Good", "Netural Good", "Chaotic Good", "Lawful Neutral", "Neutral", "Chaotic Neutral", 
			"Lawful Evil", "Neutral Evil", "Chaotic Evil"};
	
	//create TextFields and ComboBoxes
	JTextField name = new JTextField(10);
	JTextField classLevel = new JTextField(10);
	JComboBox race = new JComboBox(races);
	JComboBox background = new JComboBox(backgrounds);
	JComboBox alignment = new JComboBox(alignments);
	JTextField playerName = new JTextField(10);
	JTextField experiencePoints = new JTextField(10);
	
	//create character info JLabels
	JLabel nameLabel = new JLabel("Character Name:");
	JLabel classLevelLabel = new JLabel("Class & Level:");
	JLabel raceLabel = new JLabel("Race:");
	JLabel backgroundLabel = new JLabel("Background:");
	JLabel alignmentLabel = new JLabel("Alignment:");
	JLabel playerNameLabel = new JLabel("Player Name:");
	JLabel experiencePointsLabel = new JLabel("Experience Points:");
	
	TitledBorder characterInformationBorder = new TitledBorder("Character Information");
	
	public BiographyPanel() {
		//set combo boxes to be editable for custom entries
		race.setEditable(true);
		background.setEditable(true);
		alignment.setEditable(true);

		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		//add all components to panel
		this.add(nameLabel);
		this.add(name);
		this.add(classLevelLabel);
		this.add(classLevel);
		this.add(raceLabel);
		this.add(race);
		this.add(backgroundLabel);
		this.add(background);
		this.add(alignmentLabel);
		this.add(alignment);
		this.add(playerNameLabel);
		this.add(playerName);
		this.add(experiencePointsLabel);
		this.add(experiencePoints);
		this.setBorder(characterInformationBorder);
		
		//set Tool Tip Texts
		name.setToolTipText("Enter Character Name");
		classLevel.setToolTipText("Enter Class and Level of Character");
		race.setToolTipText("Choose or Enter Race of Character");
		background.setToolTipText("Choose or Enter Background of Character");
		alignment.setToolTipText("Choose Alignment of Character");
		playerName.setToolTipText("Enter Player Name");
		experiencePoints.setToolTipText("Enter Experience points of Character (if applicable)");
	}
}
