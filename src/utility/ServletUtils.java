package utility;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import model.User;

public class ServletUtils {
	
	private static final Map<Integer, String> id_uri_map = new HashMap<Integer, String>();
	private static final Map<String, Integer> uri_id_map = new HashMap<String, Integer>();
	
	public static int storeUser(HttpSession session, User loggedUser) {
		session.setAttribute("loggedUser", loggedUser);
		return 0;
	}
	
	public static User getLoggedUser(HttpSession session) {
		User loggedUser = (User) session.getAttribute("loggedUser");
		return loggedUser;
	}
}
