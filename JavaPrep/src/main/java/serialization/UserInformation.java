package serialization;

import java.io.DataOutputStream;
import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class UserInformation implements Externalizable{
	
	private String password;
	private String name;
	
	

	public UserInformation(String password, String name) {
		super();
		this.password = password;
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		out.writeObject(name);
		//out.writeObject("");
		out.writeObject(password);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fOut = new FileOutputStream("./open.txt");
			ObjectOutputStream dOut = new ObjectOutputStream(fOut);
			dOut.writeObject(new UserInformation("hi password", "srinivas"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
