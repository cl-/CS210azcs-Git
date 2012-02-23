import java.util.*;

@SuppressWarnings("serial")
public class programFlow extends ArrayList<activity>{
	//constructors
	public programFlow (){super();}
	
	//hasClash method
	//return: true if there is an activity clash
	//return: false if there is no clash
	//para: none
	//precond: program flow not empty
	//postcond: none
	public boolean hasClash(){
		for (int i =0; i< size()-1;i++){
			for (int j =i+1; j< size(); j++){
				if (get(i).getTimeStart() < get(j).getTimeEnd() && get(j).getTimeStart() < get(i).getTimeEnd() ||
					get(i).getTimeStart() > get(j).getTimeEnd() && get(j).getTimeStart() > get(i).getTimeEnd()) return true;
			}
		}
		return false;
	}
}