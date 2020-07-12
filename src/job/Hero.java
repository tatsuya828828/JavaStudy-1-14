package job;

public class Hero {
	String name;
	int hp;

	public Hero() {
		this("たかし", 100);
	}

	public Hero(String name) {
		this(name, 100);
	}

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	// 新しいクラスを開発する際toStringとequalsをオーバーライドする必要性がないか検討する必要がある

	// そのまま呼び出しても意味のわからない内容が表示されるため
	// オーバーライドして表示する内容を定義する
	public String toString() {
		return "名前:"+ this.name +"/HP:"+ this.hp;
	}

	// equalsはそのまま使っても何を持って等価なのかを判定することができない場合があるため
	// 場合によってはオーバーライドして定義しなければならない
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		} else if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}
