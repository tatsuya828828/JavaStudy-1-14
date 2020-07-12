

import java.util.Random;

public class Cleric {
	private String name;
	private int hp = 50;
	static final private int MAXHP = 50;
	private int mp = 10;
	static final private int MAXMP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
	}

	public void pray(int sec) {
		int recovery = sec + new Random().nextInt(3);
		this.mp += recovery;
		if(this.mp > this.MAXMP) {
			recovery -= (this.mp - this.MAXMP);
			this.mp = this.MAXMP;
			System.out.println("MPを"+ recovery +"回復した");
		} else {
			System.out.println("MPを"+ recovery +"回復した");
		}
	}
}
