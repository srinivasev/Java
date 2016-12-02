package opentext;

public enum WordCounts {
	ONE(1),
	TWO(2),
	THREE(3);
	
	private int value;
	private WordCounts(int valueInt){
		this.value = valueInt;
	}
};
