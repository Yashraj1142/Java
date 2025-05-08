// A university library system allows multiple students to borrow books from a shared collection of 5 books.
// •	Implement a program with two student threads, each trying to borrow and return books using a synchronized method.
// •	Ensure that if no books are available, the thread waits, and once a book is returned, the waiting thread gets notified to proceed.

class LibrarySystem extends Thread{
    int availableBooks = 5;

    synchronized public void borrowBook(int studId){
        while(availableBooks == 0){
            try{
                wait();
                System.out.println("No books available");
                System.out.println("----------");
            } catch(Exception e){
                System.out.println(e);
            }
        }

        availableBooks--;
        System.out.println("Book borrowed by student: " + studId);
        System.out.println("Avaialable books: " + availableBooks);
        System.out.println("-----------");
    }

    synchronized public void returnBook(int studId){
        availableBooks++;
        System.out.println("Book returned by student: " + studId);
        System.out.println("Avaialable books: " + availableBooks);
        System.out.println("-----------");
        notify();
    }
}

class Student extends Thread{
    int studId;
    LibrarySystem lib;

    Student(LibrarySystem lib, int studId){
        this.lib = lib;
        this.studId = studId;
    }

    public void run(){
        lib.borrowBook(studId);
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }

        lib.returnBook(studId);
    }
}

public class Ques7 {
    public static void main(String[] args) {
        LibrarySystem lib = new LibrarySystem();

        Student s1 = new Student(lib, 1);
        Student s2 = new Student(lib, 2);

        s1.start();
        s2.start();
    }
}
