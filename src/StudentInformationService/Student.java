package StudentInformationService;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double averageExam;
    double averageVerbal;
    double totalAverage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        this.averageExam = 0.0;
        this.averageVerbal = 0.0;
        this.totalAverage = 0.0;
    }

    void addBulkNoteExam(int examNote1, int examNote2, int examNote3) {
        if (examNote1 >= 0 && examNote1 <= 100) {
            c1.note = examNote1;
        }
        if (examNote2 >= 0 && examNote2 <= 100) {
            c2.note = examNote2;
        }
        if (examNote3 >= 0 && examNote3 <= 100) {
            c3.note = examNote3;
        }
    }

    void addVerbalExam(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.verbalNote = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.verbalNote = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            c3.verbalNote = note3;
        }

    }

    void printNote() {
        System.out.println(c1.name + " Notu\t :" + c1.note);
        System.out.println(c2.name + " Notu\t :" + c2.note);
        System.out.println(c3.name + " Notu\t :" + c3.note);
    }

    void isPass() {
        System.out.println("==============");
        this.averageExam = (c1.note + c2.note + c3.note) / 3.0;
        this.averageVerbal = (c1.verbalNote + c2.verbalNote + c3.verbalNote) / 3.0;
        this.totalAverage =(this.averageExam*0.8)+(this.averageVerbal*0.2);
        System.out.println("Öğrenci Adı : " + this.name);
        System.out.println("Ortalamanız : " + this.totalAverage);
        if (this.totalAverage > 55) {
            System.out.println("Sınıfı Geçtiniz.");
        } else {
            System.out.println("Sınıfta Kaldınız.");
        }
        System.out.println("===============");
    }
}
