// @author - Carl Phillips
// @Description - servlet utilities to store a user to get results
// logs the user in
// get what user is currently logged in

package utility;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import model.User;

public class ServletUtils {
	
	public static void storeUser(HttpSession session, User loggedUser) {
		session.setAttribute("loggedUser", loggedUser);
	}
	
	public static void loginUser(HttpSession session, User curUser) {
		session.setAttribute("curUser", curUser);
	}
	public static User getLoggedUser(HttpSession session) {
		User loggedUser = (User) session.getAttribute("loggedUser");
		return loggedUser;
	}
}
