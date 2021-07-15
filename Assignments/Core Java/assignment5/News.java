package stream;

public class News {
	private int newsId;
	private String postByUser;
	private String commentByUser;
	private String comment;
	
	public News(int newsId, String postByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postByUser = postByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostByUser() {
		return postByUser;
	}

	public void setPostByUser(String postByUser) {
		this.postByUser = postByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
