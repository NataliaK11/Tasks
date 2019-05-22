package pl.PDF.From.Tasks.Blog;

import java.util.LinkedList;
import java.util.List;

public class Post extends Entry {
    List<Comment> comments=new LinkedList<>();

    public Post(int id,double date,User user, String contend){
        super(id,date,user,contend);


        }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}

