package StudentInformationService;

public class Course {
    String name;
    String code;
    String prefix;
    double note;
    double verbalNote;
    Teacher teacher;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.teacher = teacher;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void printTeacher() {
        System.out.println(teacher);
    }
}
