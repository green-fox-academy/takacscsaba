public class BlogPost {
  String authorName;
  String publicationDate;
  String title;
  String text;

  public BlogPost() {
    this.authorName = "";
    this.publicationDate = "";
    this.title = "";
    this.text = "";
  }

  public BlogPost(String authorName, String publicationDate, String title, String text) {
    this.authorName = authorName;
    this.publicationDate = publicationDate;
    this.title = title;
    this.text = text;
  }
}