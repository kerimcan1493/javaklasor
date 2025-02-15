package ObjectOrientedProgramming;

public class StudentİnformationService {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kerim Can", "Spor", "123");
        Teacher t2 = new Teacher("Ahmet", "Fizik", "222");
        Teacher t3 = new Teacher("Mehmet", "Kimya", "333");

        Course sport = new Course("Beden Eğitimi", "101", "SPR", t1);
        Course physic = new Course("Fizik", "101", "FZK", t2);
        Course chemistry = new Course("Kimya", "101", "KMY", t3);

        Student s1 = new Student("Ecem Sena", "1090", "3", sport, physic, chemistry);
        s1.addBulkNoteExam(100,70,80);
        s1.isPass();
        s1.printNote();
        Student s2 = new Student("Murat Kaman", "4242", "4", sport, physic, chemistry);
        s2.addBulkNoteExam(90,90,25);
        s2.isPass();
        s2.printNote();
        Student s3 = new Student("Refiye Kaman", "0707", "4", sport, physic, chemistry);
        s3.addBulkNoteExam(74,98,88);
        s3.isPass();
        s3.printNote();


    }
}
