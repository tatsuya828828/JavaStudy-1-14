import job.Hero;

public class Main {
	public static void main(String[] args) {
		Empty e = new Empty();
		// EmptyクラスはObjectクラスを継承しているためObjectクラスで定義されている
		// toString()メソッドを呼び出すことができる
		String s = e.toString();
		System.out.println(s);
		// ざっくり捉えれば全てのクラスはObjectと認識することができるため代入することもできる
		Object o = new Empty();

		printAnything(e);

		Hero h = new Hero();
		// HeroクラスでオーバーライドしたtoString()で定義した内容が表示される
		System.out.println(h.toString());


		// 等値と等価の違い
		// 等値(==)とは　完全に同一の存在、つまり同じアドレスを指していること
		// 等価(equals())とは　同じ内容であること、同じアドレスでなくても良い
		// String型を比較するときはequals()を使わなければ正しい判定にはならない
		Hero h1 = new Hero("たけし");
		Hero h2 = new Hero("たけし");
		// equalsをオーバーライドし同じ名前の勇者は同じ内容を見なすと定義したため「同じ内容です」が返ってくる
		if(h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}
	// どんな型のインスタンスでも引数として渡せるメソッドを作ることもできる
	public static void printAnything(Object o) {
		// ちなみにSystem.out.println()は渡されたオブジェクトのtoStringを利用することで
		// 文字列表現を得て、それを画面に出力している
		System.out.println(o.toString());
	}
}
