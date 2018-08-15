public class Main {

  public static void main(String[] args) {
    BlogPost post1 = new BlogPost();
    post1.authorName = "John Doe";
    post1.publicationDate = "2000.05.04.";
    post1.title = "Lorem Ipsum";
    post1.text = "Lorem ipsum dolor sit amet.";

    BlogPost post2 = new BlogPost();
    post1.authorName = "Tim Urban";
    post1.publicationDate = "2010.10.10.";
    post1.title = "Wait but why";
    post1.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost post3 = new BlogPost();
    post1.authorName = "William Turton";
    post1.publicationDate = "2017.03.28.";
    post1.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    post1.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
  }
}