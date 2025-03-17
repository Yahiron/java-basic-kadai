package kadai_028;

import java.util.HashMap;
//import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {//自分のじゃんけんの手を入力し、正しい入力であるか判定するメゾット

		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner Player1 = new Scanner(System.in);

		//入力した内容を取得する
		String P1input = Player1.next();
		while (true) {
			if (P1input.equals("r") || P1input.equals("s") || P1input.equals("p")) {//入力が一致しているかの判断

				break;//繰り返しを終了

			} else {//入力が間違っていた場合
				System.out.println("入力が正しくありません。\n"
						+ "再度入力をしてください。\n");

				return getMyChoice();//再入力をさせる
			}


		}
		return P1input;//インプットに戻すであってるのか？

	}

	public String getRandom() { //	対戦相手のじゃんけんの手を乱数で選ぶメゾット

		String[] Player2 = { "r", "p", "s" };//0～2で格納
		int i = (int) Math.floor(Math.random() * 3);//0～2をランダムで選出
		return Player2[i];

	}

	public void playGame() { //	じゃんけんを行う(結果）メゾット

		HashMap<String, String> rPs = new HashMap<String, String>();

		rPs.put("r", "グー");
		rPs.put("p", "パー");
		rPs.put("s", "チョキ");

		String P1 = getMyChoice();
		String P2 = getRandom();

		System.out.println("自分の手は" + rPs.get(P1) + "です");
		System.out.println("対戦相手の手は" + rPs.get(P2) + "です");

		if (P1.equals(P2)) {
			System.out.println("あいこです。");

		} else if (P1.equals("r") && P2.equals("s")
				|| P1.equals("p") && P2.equals("r")
				|| P1.equals("s") && P2.equals("p")) {
			System.out.println("自分の勝ちです。");
		} else {
			System.out.println("自分の負けです。");
		}

	}
}