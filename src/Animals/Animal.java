package Animals;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Krieolin
 */
public class Animal implements Comparable<Animal>, Serializable {

	private String name;
	private String age;
	private String type;
	private String gender;
	private String breed;
	private ArrayList<String> likes;
	private ArrayList<String> dislikes;
	private String imagePath;
	private String description;
	private String username;
	private String password;

	/**
	 * constructor
	 */
	public Animal() {
		super();
	}

	/**
	 * Constructor with fields
	 * 
	 * @param name
	 * @param age
	 * @param type
	 * @param gender
	 * @param breed
	 * @param likes
	 * @param dislikes
	 * @param imagePath
	 * @param description
	 */
	public Animal(String name, String age, String type, String gender, String breed, ArrayList<String> likes,
			ArrayList<String> dislikes, String description, String imagePath, String username, String password) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
		this.gender = gender;
		this.breed = breed;
		this.likes = likes;
		this.dislikes = dislikes;
		this.imagePath = imagePath;
		this.description = description;
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the type to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the likes
	 */
	public ArrayList<String> getLikes() {
		return likes;
	}

	/**
	 * @param likes the likes to set
	 */
	public void setLikes(ArrayList<String> likes) {
		this.likes = likes;
	}

	/**
	 * @return the dislikes
	 */
	public ArrayList<String> getDislikes() {
		return dislikes;
	}

	/**
	 * @param dislikes the dislikes to set
	 */
	public void setDislikes(ArrayList<String> dislikes) {
		this.dislikes = dislikes;
	}

	/**
	 * this method adds a like to the list
	 * 
	 * @param like
	 */
	public void addLike(String like) {
		likes.add(like);
	}

	/**
	 * this method adds a dislike to the list
	 * 
	 * @param dislike
	 * 
	 */
	public void addDislike(String dislike) {
		dislikes.add(dislike);
	}

	/**
	 * @return the image path
	 */
	public String getimagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setimagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setdescription(String description) {
		this.description = description;
	}

	/**
	 * This method updates this object to new instances
	 * 
	 * @param obj an instance of animal object to store
	 */
	public void updateObject(Animal obj) {
		this.name = obj.name;
		this.age = obj.age;
		this.type = obj.type;
		this.gender = obj.gender;
		this.breed = obj.breed;
		this.likes = obj.likes;
		this.dislikes = obj.dislikes;
		this.imagePath = obj.imagePath;
		this.description = obj.description;
		this.username = obj.username;
		this.password = obj.password;
	}

	/**
	 * This method had to be implemented because this class implements comparable as
	 * of the time being it returns 0
	 * 
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Animal o) {
		return 0;
	}

}
