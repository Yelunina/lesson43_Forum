package ait.forum.model;

import java.time.LocalDateTime;

public class Post {
    private int postId;
    private String title;
    private String author;
    private String content;
    LocalDateTime date;
    private int likes;

    public Post(int postId, String title, String author, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
        date = LocalDateTime.now();
    }

    public int getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getLikes() {
        return likes;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int addLike() {
        return ++likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", likes=" + likes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;

        if (getPostId() != post.getPostId()) return false;
        if (getLikes() != post.getLikes()) return false;
        if (getTitle() != null ? !getTitle().equals(post.getTitle()) : post.getTitle() != null) return false;
        if (getAuthor() != null ? !getAuthor().equals(post.getAuthor()) : post.getAuthor() != null) return false;
        if (getContent() != null ? !getContent().equals(post.getContent()) : post.getContent() != null) return false;
        return getDate() != null ? getDate().equals(post.getDate()) : post.getDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getPostId();
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + getLikes();
        return result;
    }
}
