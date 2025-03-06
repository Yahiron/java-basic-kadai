package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {//子クラス

	public KatoIchiro_Chapter18() {

		setfamilyName();
		setgivenName();
		setaddress();
	}

	public void setfamilyName() {
		this.familyName = "加藤";

	}

	public void setgivenName() {
		this.givenName = "一郎";

	}

	public void setaddress() {
		this.address = "東京都中野区〇×";

	}

	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");

	}

}
