public class Student{
    String name;
    char gender;
    String course;
    int[][] boyshostel;
    int[][] girlshostel;

    public Student(String name, char gender, String course) {
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.boyshostel = new int[5][2]; 
        this.girlshostel = new int[5][2]; 
    }
}


