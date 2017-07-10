package customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MySchool
{
	String name();
	int addressId();
}

@MySchool(addressId = 15, name = "chs")
class School{
	
}

public class CustomAnnotation {
	public static void main(String[] args) {
		School schoolObj = new School();
		Class c = schoolObj.getClass();
		
		MySchool mySchool = (MySchool) c.getAnnotation(MySchool.class);
		System.out.println(mySchool.addressId());
	}
}
