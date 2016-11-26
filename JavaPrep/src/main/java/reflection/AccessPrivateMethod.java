package reflection;

import java.lang.reflect.Method;  

public class AccessPrivateMethod {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class classVar = Class.forName("reflection.PrivateMethod");
		Object o = classVar.newInstance();
		
		Method privateMethod = classVar.getDeclaredMethod("displayMessage", null);
		privateMethod.setAccessible(true);
		privateMethod.invoke(o, null);	
	}
}
