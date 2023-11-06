package practical_works.prac_2.author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Авторов Автор", "author@mail.ru", 'М');

        //System.out.println(author);
        System.out.println("Author's name: " + author.getName());
        System.out.println("Author's email: " + author.getEmail());

        author.setEmail("not_author_anymore@mail.ru");
        System.out.println("New author's email: " + author.getEmail());

        System.out.println("Gender: " + author.getGender());
        System.out.println(author.toString());

    }
}
