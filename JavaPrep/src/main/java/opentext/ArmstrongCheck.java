package opentext;

public class ArmstrongCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfCubes = 0;
		int number = 153;
		int numberTotest = number;
		while(numberTotest > 0){
			int loopNumber = numberTotest % 10;
			sumOfCubes += Math.pow(loopNumber, 3);
			numberTotest = numberTotest/10;
		}
		if(sumOfCubes == number){
			System.out.println("it is a armstrong");
		}
	}
}
