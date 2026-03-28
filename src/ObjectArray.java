public class ObjectArray {

    public static class Student {
        int rollNo;
        String name;
        int marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Chetan";
        s1.rollNo = 1;
        s1.marks = 75;

        Student s2 = new Student();
        s2.name = "Rohit";
        s2.rollNo = 2;
        s2.marks = 80;

        Student s3 = new Student();
        s3.name = "Shailja";
        s3.rollNo = 3;
        s3.marks = 99;

        Student stud[] = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

//        for (int i=0; i<stud.length; i++) {
//            System.out.println(stud[i].name + ":" + stud[i].marks);
//        }

        for (Student s : stud) {
            System.out.println(s.name + ":" + s.marks);
        }
    }
}
