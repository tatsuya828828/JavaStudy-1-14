import job.Hero;

public class Main {
	// mainメソッドを呼び出すときは必ずインスタンスを生成する前なので必ずstaticがつく
	public static void main(String[] args) {
		// 静的メソッドや静的フィールドはインスタンス生成前でも呼び出すことができる
		Hero.setRandomMoney();
		System.out.println(Hero.getMoney() +"円入った財布が落ちている。さらに、5000円入れておいてあげよう。");
		Hero.setMoney(Hero.getMoney() +5000);

		Hero h1 = new Hero("たかし");
		System.out.println(h1.getName() +"は財布を拾った。");
		System.out.println(h1.getName() +"の所持金:"+ h1.getMoney());
		Hero h2 = new Hero("ひろし");
		System.out.println(h1.getName() +"たちの所持金"+ h1.getMoney());
		System.out.println(h2.getName() +"は1000円を拾った。");
		// moneyは静的フィールドなので共通の財布に入れられる
		h2.setMoney(h2.getMoney() + 1000);
		System.out.println(h1.getName() +"たちの所持金"+ h1.getMoney());
	}
}
