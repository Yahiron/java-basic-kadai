package kadai_015;

public class Car_Chapter15 {
	//クラス
	
	
  private int gear  =1; //1速から5速のギアを表す 変数　初期値　1
  private int  speed =10;  //ギアチェンジ後の速度を表す　変数　初期値　10
    //フィールド
  
  public Car_Chapter15() { 
	  //CarExec_Chapter15がアクセスできるようにする。（メゾット）
	
  
  }
  
  //ここまでが車クラスのインスタンス
  
 public void gearChange(int afterGear) {     //ギアの値により速度を変えるメゾット
	 
	 int beforeGear=this.gear;	 
	 this.gear = afterGear;
	 
	 
	 this.speed=switch(afterGear) {
    case 1  -> 10;   //1速＝10ｋｍ
    case 2  -> 20;   //2速＝20ｋｍ
    case 3  -> 30;   //3速＝30ｋｍ
    case 4  -> 40;   //4速＝40ｋｍ
    case 5  -> 50;   //5速＝50ｋｍ
    default -> 10;   //その他＝10ｋｍ
	     
	 };
	 
	 
	 System.out.println("ギア"+beforeGear+"から"+afterGear+"に切り替えました"); 
	//結果の表示
 }

	 public void run() {      //ギアチェンジ後の速度を表示するメゾット
	
	 System.out.println("速度は時速" + speed +"kmです");
	//結果の表示
	}	
	
	}


