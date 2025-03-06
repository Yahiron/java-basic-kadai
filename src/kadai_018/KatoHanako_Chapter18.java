package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {//子クラス

	public KatoHanako_Chapter18() {

		setfamilyName();
		setgivenName();
		setaddress();
	}

	public void setfamilyName() {
		this.familyName = "加藤";

	}

	public void setgivenName() {
		this.givenName = "花子";

	}

	public void setaddress() {
		this.address = "東京都中野区〇×";

	}

	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
