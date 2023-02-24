public class Main {
    public static void main(String[] args) {

        Author author1=new Author("Aitmatov","aitmatov@gmail.com",'M');
        Author author2=new Author("Hey","hei.luiza@gmail.com",'F');
        Author author3=new Author("Davlatov","davlatov@gmail.com",'M');
        Book book1=new Book("Toolor kulaganda",author1,25.5);
        Book book11=new Book("Ak keme",author1,33.3);
        Book book2=new Book("Blagodarnost",author2,20.3);
        Book book22=new Book("Lyubit sebya",author2,36.6);
        Book book3=new Book("Dengi",author3,40.5);
        Book book33=new Book("Talisman",author3,35.5);

        System.out.println(book1.getAuthor()+book1.toString()+"qty:"+book1.qty+" price:"+book1.price);
        System.out.println(book11.getAuthor()+book11.toString()+book11.qty+"qty:"+book11.qty+" price:"+book11.price);
        System.out.println();
        System.out.println(book2.getAuthor()+book2.toString()+"qty:"+book2.qty+" price:"+book2.price);
        System.out.println(book22.getAuthor()+book22.toString()+"qty:"+book22.qty+" price:"+book22.price);
        System.out.println();
        System.out.println(book3.getAuthor()+book3.toString()+book3.getPrice()+"qty:"+book3.qty+" price:"+book3.price);
        System.out.println(book33.getAuthor()+book33.toString()+"qty:"+book33.qty+" price:"+book33.price);
        //System.out.println(author1.email);
        author1.email("aitmatov@gmail.com");
        author2.email("hei.luiza@gmail.com");
        author3.email("davlatov@gmail.com");
        book1.qty(23);
        book2.qty(32);
        book3.qty(54);







    }
}