public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author ("Pol", "moe_milo@random.ru", 'M');
        System.out.println(a);
        a.setEmail("pol_milo@gmail.com");
        System.out.println(a);
    }
}