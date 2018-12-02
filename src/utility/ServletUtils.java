package utility;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import model.User;

public class ServletUtils {
	
	private static final Map<Integer, String> id_uri_map = new HashMap<Integer, String>();
	private static final Map<String, Integer> uri_id_map = new HashMap<String, Integer>();
	
	public static void storeUser(HttpSession session, User loggedUser) {
		session.setAttribute("loggedUser", loggedUser);
	}
	
	public static User getLoggedUser(HttpSession session) {
		User loggedUser = (User) session.getAttribute("loggedUser");
		return loggedUser;
	}
}
