

/**
 *
 * @author Krieolin
 */
public class loggedInInfo {

	private static String username = "";
    private static String password = "";
   
    /**
	 * @return the username
	 */
	public static String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public static void setUsername(String username) {
		loggedInInfo.username = username;
	}
	/**
	 * @return the password
	 */
	public static String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public static void setPassword(String password) {
		loggedInInfo.password = password;
	}
 
    
}
