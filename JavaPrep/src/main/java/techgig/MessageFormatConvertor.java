package techgig;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MessageFormatConvertor {
	public static String outputMessage="";
	public static String input = "0800161234567891234567000898169876543215678945"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String format = "MTI(4 digit) + [2 digit Length] PAN(16 or 19 digit) + "
				+ "Stan(6 digit)+ [2 digit length]Track2data(Max length 37)";
		
		Map<String,Integer> xmlTags = new LinkedHashMap<String,Integer>();
		List<Integer> lengthValues = new LinkedList<Integer>(); 
		
		String[] formatStr = format.split("\\+");
		
		for(String token:formatStr){
			if(token.indexOf('[')!=-1){
				token = token.substring(token.indexOf('['), token.indexOf(']')+1);
				char[] chars = token.toCharArray();
				for(char length:chars)
					if(Character.isDigit(length)){
						lengthValues.add(Character.getNumericValue(length));
					}
				}
			else{
				
				char[] chars = token.toCharArray();
				for(char length:chars){
					if(Character.isDigit(length)){
						lengthValues.add(Character.getNumericValue(length));
					}
				}
			}
		}
		Iterator itr = lengthValues.iterator();
		int outputContent = 1;
		while(itr.hasNext()){
			buildMessage((int)itr.next(),outputContent);
			outputContent++;
			//break;
			//@0800:@Card No: 1234567891234567@/Card No:@Audit No:000898@/Audit No:@Track2Data:9876543215678945@/Track2Data:
		}
	}

	private static void buildMessage(int length, int outputContent) {
		// TODO Auto-generated method stub
		switch(outputContent){
			case 1:
				outputMessage = outputMessage.concat("@"+input.substring(0, length));
				input = input.replace(input.substring(0, length),"");
				
				break;
			case 2:
				int lengthPan = Integer.valueOf(input.substring(0, length));
				input = input.replace(input.substring(0, lengthPan),"");
				outputMessage = outputMessage.concat(":@Card No: "+input.substring(0, lengthPan));
				input = input.replace(input.substring(0, lengthPan),"");
				System.out.println(outputMessage);
				break;
			case 3:
				int stanLength = Integer.valueOf(input.substring(0, length));
				outputMessage = outputMessage.concat("@/Card No:@Audit No:"+input.substring(0, stanLength));
				input = input.replace(input.substring(0, stanLength),"");
				break;
			case 4:
				int trackData = Integer.valueOf(input.substring(0, length));
				input = input.replace(input.substring(0, trackData),"");
				outputMessage = outputMessage.concat("@/Audit No:@Track2Data:"+input.substring(0, trackData));
				outputMessage = outputMessage.concat("@/Track2Data:");
				input = input.replace(input.substring(0, trackData),"");
				System.out.println(outputMessage);
				break;
		}
	}
}
