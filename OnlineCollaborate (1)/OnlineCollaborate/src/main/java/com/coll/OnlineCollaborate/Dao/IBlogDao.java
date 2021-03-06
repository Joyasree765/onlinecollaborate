package com.coll.OnlineCollaborate.Dao;
import java.util.List;

import com.coll.OnlineCollaborate.model.Blog;

public interface IBlogDao {
	List<Blog> getAllBlogs();
	List<Blog> getBlogsByStatus(String status);
	List<Blog> getUsersBlogs(int id);
	Blog getBlogById(int blogId);
	boolean addBlog(Blog blog);
	boolean updateBlog(Blog blog);
	boolean deleteBlog(Blog blog);

}
