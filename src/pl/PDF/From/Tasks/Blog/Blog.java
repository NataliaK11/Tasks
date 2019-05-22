package pl.PDF.From.Tasks.Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<User> users;
    List<Post> posts;

    public Blog() {
        users = new ArrayList<>();
        posts = new ArrayList<>();

        users.add(new User(1, "Natalia", "K", "Nat"));
        users.add(new User(2, "M", "Kot", "MKK"));
    }

    public void publishPost(int userId, String c) {

        int a = posts.size() + 1;
        posts.add(new Post(a, 32, users.get(userId-1), c));
        System.out.println(users.get(userId-1).getNick()+" posted just now: "+c);
    }

    public void commentPost(int userId, int postId, String c) {
        int a = posts.get(postId-1).comments.size() + 1;

        posts.get(postId-1).comments.add(new Comment(a, 11, users.get(userId-1), c));
        System.out.println(users.get(userId-1).getNick()+" comennted "+posts.get(postId-1).getAuthor().getNick()+"'s post: "+c);
    }

    public void displayUserEntries(int userId) {
        System.out.println(users.get(userId-1).getNick()+"'s entries: ");
        for (int i = 0; i < posts.size(); i++) {

            if (posts.get(i).getAuthor().hashCode() == users.get(userId-1).hashCode())
                System.out.println("(POST) "+posts.get(i).getContent());
            for (int j = 0; j < posts.get(i).comments.size(); j++)
                if (posts.get(i).comments.get(j).getAuthor().hashCode() == users.get(userId-1).hashCode())
                    System.out.println("(COMMENT) "+posts.get(i).comments.get(j).getContent());
        }
    }
}
