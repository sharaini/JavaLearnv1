package preferences;
import java.util.prefs.Preferences;

import collEctions.demo;
//api was meant to store small amounts of data like user specific setting fontstyle fontlayout
/**
 * 
 *
 * string,int,bytearrays,etc..,allows one for userpref and one for sys preferences
 * @author Sharath
 *
 */
public class preference {
	public void example(){
		Preferences userp=Preferences.userRoot();
		Preferences systemp=Preferences.systemRoot();
		//store an int to userp with string key
		userp.putInt("X_DEFAULT",10);
		//retrieve an entry from user pref,the num sent as a sec is ret if the key doesnt exist
		int numberOfRows=userp.getInt("X_DEFAULT",5);
		userp.remove("X_DEFAULT");
		//pref can be used by other program which is runng on total dif runtime env
		//migh not be best thing coz of overwrites
		Preferences userprefpack=Preferences.userNodeForPackage(demo.class);
		//better to imp based on the pack which is not aware by them using subroots with custom logical root names accessed by package or 
		Preferences userprefcustomnodeforpack=Preferences.userRoot().node("/user/custom/root");
		userprefcustomnodeforpack.put("USER_LANGUAGE", "DUTCH");
		Preferences userprefcustom=Preferences.userRoot().node("/user/custom/root");
		userprefcustom.put("USER_LANGUAGE", "SPANISH");
	}
}
