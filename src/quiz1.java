package quiz10;

import java.util.Random;

import javax.swing.JOptionPane;

public class quiz1 {
public static void main(String[] args) {
	int score=0;
	String question= JOptionPane.showInputDialog(null, "How many questions do you want :)");
	int num=Integer.parseInt(question);
	Random num1=new Random();
	
	for(int i=0;i<num; i++){
		int num3=num1.nextInt(200);
		int num4=num1.nextInt(100);
		int num5=num3+num4;
		JOptionPane.showInputDialog("find the anwser "+ num3+" + " +num4);
		if (num5==num3+num4) {
		score= score+1;	
			
		}
	}	
	JOptionPane.showMessageDialog(null, "and your score is "+score+" / "+num);



}
}