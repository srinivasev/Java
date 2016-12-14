package opentext;

import java.util.LinkedHashMap;
import java.util.Map;


public class DisplayCountofWords {
	
	enum WordCount{
		ONE(1),
		TWO(2),
		THREE(3);
		
		private int value;
		private WordCount(int valueInt){
			this.value = valueInt;
		}
		public static WordCount getByValue(int i) {
            for(WordCount dt : WordCount.values()) {
                if(dt.value == i) {
                    return dt;
                }
            }
            throw new IllegalArgumentException("No datatype with " + i + " exists");
        }
	}
	enum WordCountKeys{
		ONE_LETTER_WORD,
		TWO_LETTER_WORD,
		THREE_LETTER_WORD
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Oh my god!!";
		/*
		 * Split on space
		 * replace all special characters on string array
		 * loop new string array - char count - into map
		 * key : No.of two letter words
		 * key : No.of one letter words
		 * 
		 */
		Map<Integer,Integer> result = new LinkedHashMap<Integer,Integer>();
		text = text.replaceAll("[^a-zA-Z0-9]","");
		String[] strText = text.split(" ");
		for(String strTexts:strText){
			switch(WordCount.getByValue(strTexts.length())){
			//case ONE : result.put(WordCount.ONE, (result.get(ONE)++));
			}
		}

	}

}
