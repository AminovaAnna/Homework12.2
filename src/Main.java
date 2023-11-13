public class Main {
    public static void main(String[] args) {
        Author fullName1 = new Author("Карлос", "Сафон");
        Author fullName2 = new Author("Лев", "Толстой");
        Book book1 = new Book("Тень ветра", fullName1, 2018);
        Book book2 = new Book("Анна Каренина", fullName2, 2023);
        Book book3 = new Book("Анна Каренина", fullName2, 1873);
        System.out.println(book1.getName() + ", " + book1.getAuthor().getFirstName() +
                " " + book1.getAuthor().getLastName() +" " + book1.getYear());
        System.out.println(book2.getName() + ", " + book2.getAuthor().getFirstName() +
                " " + book2.getAuthor().getLastName() +" " + book2.getYear());
        System.out.println( );
        book2.setYear(1873);
        System.out.println(book2.getName() + ", " + book2.getAuthor().getFirstName() +
                " " + book2.getAuthor().getLastName() +" " + book2.getYear());


        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book2.equals(book3));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }



}