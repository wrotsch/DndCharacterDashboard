package csi203.f18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.Random;
import java.util.Scanner;
public class WeaponSlotsPanel extends JPanel{

	//Create labels for text field areas
	JLabel weaponNameLabel = new JLabel("Name");
	JLabel attackBonusLabel = new JLabel("ATK Bonus");
	JLabel damageLabel = new JLabel("Damage");
	JLabel damageBonusLabel = new JLabel("Damage Bonus");
	
	//Create text fields for weapon 1 information
	JTextField weaponName1 = new JTextField();
	JTextField weaponAttack1 = new JTextField();
	JTextField weaponDamage1 = new JTextField();
	JTextField weaponDamageBonus1 = new JTextField();
	
	//Create text fields for weapon 2 information
	JTextField weaponName2 = new JTextField();
	JTextField weaponAttack2 = new JTextField();
	JTextField weaponDamage2 = new JTextField();
	JTextField weaponDamageBonus2 = new JTextField();
	
	//Create text fields for weapon 3 information
	JTextField weaponName3 = new JTextField();
	JTextField weaponAttack3 = new JTextField();
	JTextField weaponDamage3 = new JTextField();
	JTextField weaponDamageBonus3 = new JTextField();
	
	JPanel blank = new JPanel();
	
	//create buttons for weapon use
	JButton jbtWeapon1 = new JButton("Use");
	JButton jbtWeapon2 = new JButton("Use");
	JButton jbtWeapon3 = new JButton("Use");
	
	Random rand = new Random();
	
	TitledBorder weaponsBorder = new TitledBorder("Weapons");
	
	public WeaponSlotsPanel() {
		this.setLayout(new GridLayout(4,5));
		//add components to panel
		this.add(weaponNameLabel);
		this.add(attackBonusLabel);
		this.add(damageLabel);
		this.add(damageBonusLabel);
		this.add(blank);
		this.add(weaponName1);
		this.add(weaponAttack1);
		this.add(weaponDamage1);
		this.add(weaponDamageBonus1);
		this.add(jbtWeapon1);
		this.add(weaponName2);
		this.add(weaponAttack2);
		this.add(weaponDamage2);
		this.add(weaponDamageBonus2);
		this.add(jbtWeapon2);
		this.add(weaponName3);
		this.add(weaponAttack3);
		this.add(weaponDamage3);
		this.add(weaponDamageBonus3);
		this.add(jbtWeapon3);
		this.setBorder(weaponsBorder);
		
		//set tool tip texts
		weaponName1.setToolTipText("Enter the name of your first weapon");
		weaponAttack1.setToolTipText("Enter the attack bonus of your first weapon (ex. +5)");
		weaponDamage1.setToolTipText("Enter the damage dice for your first weapon (ex. 2d8");
		weaponDamageBonus1.setToolTipText("Enter the damage bonus for your first weapon (ex. +4)");
		jbtWeapon1.setToolTipText("Use your first weapon.");
		weaponName2.setToolTipText("Enter the name of your second weapon");
		weaponAttack2.setToolTipText("Enter the attack bonus of your second weapon (ex. +5)");
		weaponDamage2.setToolTipText("Enter the damage dice for your second weapon (ex. 2d8)");
		weaponDamageBonus2.setToolTipText("Enter the damage bonus for your second weapon (ex. +4)");
		jbtWeapon2.setToolTipText("Use your second weapon.");
		weaponName3.setToolTipText("Enter the name of your third weapon");
		weaponAttack3.setToolTipText("Enter the attack bonus of your third weapon (ex. +5)");
		weaponDamage3.setToolTipText("Enter the damage dice for your third weapon (ex. 2d8)");
		weaponDamageBonus3.setToolTipText("Enter the damage bonus for your third weapon (ex. +4)");
		jbtWeapon3.setToolTipText("Use your third weapon");
		
		//weapon 1 use weapon button listener
		jbtWeapon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String diceType = weaponDamage1.getText();//read information in text area
				int diceNum = diceType.charAt(0)- '0';//read in number of dice for weapon damage
				diceType = diceType.substring(1);//read in dice type
				int damageMod = Integer.parseInt(weaponDamageBonus1.getText());
				int damage = 0;
				
				if(diceType.equals("d20")) {//if the dice type is d20
					for(int i =0; i<diceNum; i++){//for each number of dice
						damage+=rand.nextInt(20)+1;//add random number from 1-20 to damage
					}
					damage+=damageMod;//increment damage by damage bonus
				}
				
				else if(diceType.equals("d12")) {//if the dice type is d12
					for(int i =0; i<diceNum; i++){//for each number of dice
						damage+=rand.nextInt(12)+1;//add random number from 1-12 to damage
					}
					damage+=damageMod;//add damage bonus to total
				}
				
				else if(diceType.equals("d10")) {//if the dice type is d10
					for(int i =0; i<diceNum; i++){//for each number of dice
						damage+=rand.nextInt(10)+1;//add random number from 1-10 to damage
					}
					damage+=damageMod;//add damage bonus to total
				}
				
				else if(diceType.equals("d8")) {//if the dice type is d8
					for(int i =0; i<diceNum; i++){//for each number of dice
						damage+=rand.nextInt(8)+1;//add random number from 1-8 to damage
					}
					damage+=damageMod;//add damage bonus to total
				}
				
				else if(diceType.equals("d6")) {//if the dice type is d6
					for(int i =0; i<diceNum; i++){//for each number of dice
						damage+=rand.nextInt(6)+1;//add random number from 1-6 to damage
					}
					damage+=damageMod;//add damage bonus to total
				}
				
				else if(diceType.equals("d4")) {//if the dice type is d4
					for(int i =0; i<diceNum; i++){//for each number of dice
						damage+=rand.nextInt(4)+1;//add random number from 1-4 to damage
					}
					damage+=damageMod;//add damage bonus to total
				}
				
				//Display damage total to user
				JOptionPane.showMessageDialog(null, "You have dealt " + damage + " points of damage with " + weaponName1.getText() + ".");
			}
		});
		
		//weapon 2 use weapon button listener
				jbtWeapon2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String diceType = weaponDamage2.getText();//read information in text area
						int diceNum = diceType.charAt(0)- '0';//read in number of dice for weapon damage
						diceType = diceType.substring(1);//read in dice type
						int damageMod = Integer.parseInt(weaponDamageBonus2.getText());
						int damage = 0;
						
						if(diceType.equals("d20")) {//if the dice type is d20
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(20)+1;//add random number from 1-20 to damage
							}
							damage+=damageMod;//increment damage by damage bonus
						}
						
						else if(diceType.equals("d12")) {//if the dice type is d12
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(12)+1;//add random number from 1-12 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						else if(diceType.equals("d10")) {//if the dice type is d10
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(10)+1;//add random number from 1-10 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						else if(diceType.equals("d8")) {//if the dice type is d8
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(8)+1;//add random number from 1-8 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						else if(diceType.equals("d6")) {//if the dice type is d6
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(6)+1;//add random number from 1-6 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						else if(diceType.equals("d4")) {//if the dice type is d4
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(4)+1;//add random number from 1-4 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						//Display damage total to user
						JOptionPane.showMessageDialog(null, "You have dealt " + damage + " points of damage with " + weaponName2.getText() + ".");
					}
				});
		
				//weapon 3 use weapon button listener
				jbtWeapon3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String diceType = weaponDamage3.getText();//read information in text area
						int diceNum = diceType.charAt(0)- '0';//read in number of dice for weapon damage
						diceType = diceType.substring(1);//read in dice type
						int damageMod = Integer.parseInt(weaponDamageBonus3.getText());
						int damage = 0;
						
						if(diceType.equals("d20")) {//if the dice type is d20
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(20)+1;//add random number from 1-20 to damage
							}
							damage+=damageMod;//increment damage by damage bonus
						}
						
						else if(diceType.equals("d12")) {//if the dice type is d12
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(12)+1;//add random number from 1-12 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						else if(diceType.equals("d10")) {//if the dice type is d10
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(10)+1;//add random number from 1-10 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						else if(diceType.equals("d8")) {//if the dice type is d8
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(8)+1;//add random number from 1-8 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						else if(diceType.equals("d6")) {//if the dice type is d6
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(6)+1;//add random number from 1-6 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						else if(diceType.equals("d4")) {//if the dice type is d4
							for(int i =0; i<diceNum; i++){//for each number of dice
								damage+=rand.nextInt(4)+1;//add random number from 1-4 to damage
							}
							damage+=damageMod;//add damage bonus to total
						}
						
						//Display damage total to user
						JOptionPane.showMessageDialog(null, "You have dealt " + damage + " points of damage with " + weaponName3.getText() + ".");
					}
				});
	}
}
