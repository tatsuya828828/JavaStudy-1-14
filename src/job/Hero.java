package job;

public class Hero {
	private String name;
	private int hp;
	// static をつけたフィールドは静的フィールドと呼ばれる
	// 静的フィールドはインスタンス毎ではなくクラスに1つだけ用意される
	// そういった理由から、クラス変数と呼ばれることもある
	// なので、名前やhpはそれぞれ違うため独立しているが財布は全員共通のものにしたい場合静的フィールドを用いることで可能になる
	private static int money;

	public Hero() {
		this("太郎", 100);
	}

	public Hero(String name) {
		this(name, 100);
	}

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.money += 100;
		System.out.println("勇者"+ this.name +"が誕生しました。100円をプレゼントします。");
	}

	public static int getMoney() {
		return Hero.money;
	}

	public static void setMoney(int money) {
		Hero.money = money;
	}

	public String getName() {
		return this.name;
	}

	// staticはメソッドにつけることもでき、静的メソッドやクラスメソッドと呼ばれる
	// 静的メソッドの中に記述するコードは
	// 同一クラス内のstaticがついていないフィールドやメソッドは使えない
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 10000);
	}
}
