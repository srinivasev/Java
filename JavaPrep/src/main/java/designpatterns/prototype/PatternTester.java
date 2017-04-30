package designpatterns.prototype;

public class PatternTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaruthiMusicSystem maruthiObj = new MaruthiMusicSystem();
		System.out.println(" Object -- "+ maruthiObj);
		MaruthiMusicSystem maruthiObj2 = (MaruthiMusicSystem) maruthiObj.makeCopy();
		maruthiObj2.getMusicUnits().add("srinivas");
		System.out.println(" Object makeCopy -- "+ maruthiObj2);
	}
}
