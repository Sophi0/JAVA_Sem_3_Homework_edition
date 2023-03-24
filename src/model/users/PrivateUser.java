package model.users;

import java.util.ArrayList;

import model.Post;
import model.PostType;

public class PrivateUser extends User{
	
	private ArrayList<Post> allPrivatePosts = new ArrayList<>();
	private ArrayList<Post> allPublicPosts = new ArrayList<>();

	@Override
	public abstract void createPost(Post post, PostType type) {
	//TODO auto-generated method stub
		return null;
	}
}
