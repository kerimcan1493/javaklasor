package StudentİnformationService;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String branch,String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }
    void print(){
        System.out.println("Adı\t:"+this.name);
        System.out.println("Branş\t:"+this.branch);
        System.out.println("Tel\t:"+this.mpno);
    }
}
