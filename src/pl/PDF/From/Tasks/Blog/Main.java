package pl.PDF.From.Tasks.Blog;

public class Main {
    public static void main(String[] args) {
        Blog blog=new Blog();
        blog.publishPost(1,"Hej jestem Natalia");
        blog.publishPost(2,"Jaka jutro pogoda??");
        blog.commentPost(1,2,"Hmm, nie wiem, zobaczymy jutro");
        blog.displayUserEntries(1);

    }
}
