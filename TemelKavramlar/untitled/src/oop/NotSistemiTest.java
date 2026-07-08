package oop;

public class NotSistemiTest {
    static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "+09500000000", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "5555554444", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "101", "BIO");

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNotes(100, 78, 50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNotes(10,20,30);
        s2.isPass();
    }
}
