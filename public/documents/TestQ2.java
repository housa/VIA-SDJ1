public class TestQ2 {

    public static void main(String[] args) {
        EBook eb1 = new EBook("www.acd.org/sis", "A Study in Scarlett", "ow84ety7f");
        EBook eb2 = new EBook("www.acd.org/sis", "A Study in Scarlett", "ow84ety7f");
        PrintedBook pb1 = new PrintedBook("A Study in Scarlett", "hfgpæiwut", true);
        PrintedBook pb2 = new PrintedBook("A Study in Scarlett", "lie8yg64h", false);
        PrintedBook pb3 = new PrintedBook("A Study in Scarlett", "lie8yg64h", false);
        BookList bl = new BookList();
        BookList b2 = new BookList();

        //testing the EBook class
        System.out.println("Test 1: " +(eb1.getUrl().equals("www.acd.org/sis")));
        System.out.println("Test 2: " +(eb1.getBookType().equals("E-book")));
        System.out.println("Test 3: " +(eb1.equals(eb2)));

        //testing the PrintedBook class
        System.out.println("Test 4: " +(pb1.isPaperBack()==true));
        System.out.println("Test 5: " +(pb2.isPaperBack()==false));
        System.out.println("Test 6: " +(pb1.getBookType().equals("Paperback")));
        System.out.println("Test 7: " +(pb2.getBookType().equals("Hard cover")));
        System.out.println("Test 8: " +(pb2.equals(pb3)));

        //testing the book class
        System.out.println("Test 9: " + (eb1.getTitle().equals("A Study in Scarlett")));
        System.out.println("Test 10: " +(pb1.getIsbn().equals("hfgpæiwut")));

        //testing the BookList class
        System.out.println("Test 11: " +(bl.getNumberOfBooks()==0));
        bl.addBook(eb1);
        bl.addBook(eb2);
        bl.addBook(pb1);
        bl.addBook(pb2);
        bl.addBook(pb3);
        System.out.println("Test 12: " +(bl.getNumberOfBooks()==5));
        System.out.println("Test 13: " +(bl.getBook(3).equals(pb2)));
        System.out.println("Test 14: " +(bl.getBook("hfgpæiwut").equals(pb1)));
        System.out.println("Test 15: " +(bl.removeBook(4)).equals(pb3));
        System.out.println("Test 16: " +(bl.getNumberOfBooks()==4));
        System.out.println("Test 17: " +(bl.getIndexOfFirstPrintedBook()==2));
        System.out.println("Test 18: " +(bl.getNumberOfBooksByType("E-book")==2));
        System.out.println("Test 19: " +(bl.getNumberOfBooksByType("Paperback")==1));
        System.out.println("Test 20: " +(bl.getNumberOfBooksByType("Hard cover")==1));
        System.out.println("Test 21: " +(bl.getBooksByType("E-book").length==2));
        System.out.println("Test 22: " +(bl.getBooksByType("E-book") instanceof Book[]));
        System.out.println("Test 23: " +(bl.getBooksByType("Hard cover")[0].equals(pb2)));
        System.out.println("Test 24: " +(bl.getAllEBooks().length==2));
        System.out.println("Test 25: " +(bl.getAllEBooks() instanceof EBook[]));
        b2.addBook(eb1);
        b2.addBook(eb2);
        b2.addBook(pb1);
        b2.addBook(pb2);
        System.out.println("Test 26: " +(bl.equals(b2)));
    }
}
