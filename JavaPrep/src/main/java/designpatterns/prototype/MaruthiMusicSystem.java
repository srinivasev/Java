package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class MaruthiMusicSystem implements ICarMusicSystem{
	
	private List<String> musicUnits;
	
	public List<String> getMusicUnits() {
		return musicUnits;
	}

	public void setMusicUnits(List<String> musicUnits) {
		this.musicUnits = musicUnits;
	}

	public MaruthiMusicSystem(){
		List<String> musicList = new ArrayList<>();
		musicList.add("Bose");
		musicList.add("Bose 1");
		musicList.add("Bose 2");
		musicList.add("Bose 3");
		this.setMusicUnits(musicList);
	}

	@Override
	public ICarMusicSystem makeCopy() {
		MaruthiMusicSystem obj = null;
		try {
			obj =  (MaruthiMusicSystem) super.clone();
			List<String> temp = new ArrayList<>();
			for(String s:this.getMusicUnits()){
				temp.add(s);
			}
			obj.setMusicUnits(temp);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public String toString() {
		return "MaruthiMusicSystem [musicUnits=" + musicUnits + "]";
	}
}
