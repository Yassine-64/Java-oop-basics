public class Book {
    //hado attributs

    private String title;
    private String author
    private int pagecount;


    // hada constructeur parametrique 
    public Book(String title , String author , int pagecount){
        this.title = title
        this.author = author
        this.pagecount= pagecount
    }


    //les methods void = pas de return 
    public void displayInfo(){
        System.out.println("Book information - title::"+title+",Author:"+author+",Pages:"+pagecount);
    }

    public void read(){
        System.out.println("Reading" +title+ "by" +author+".")
    }

    public void bookmarkPage(int page){
        System.out.println("Page " +page+"bookmarked in "+title+".")
    }
}

