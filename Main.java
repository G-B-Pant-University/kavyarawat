class Main {
    public static void main(String[] args) {
        Student student1 = new Student("KAVYA", 'F', "Computer Science");
        Student student2 = new Student("RAHUL", 'M', "Mathematics");
        Student student3 = new Student("PRIYA", 'F', "Physics");
        Student student4 = new Student("ADITYA", 'M', "Chemistry");
        Student student5 = new Student("ANITA", 'F', "Biology");
        Student student6 = new Student("RAJ", 'M', "Economics");
        Student student7 = new Student("SNEHA", 'F', "History");
        Student student8 = new Student("ARJUN", 'M', "Philosophy");
        Student student9 = new Student("MEERA", 'F', "Sociology");
        Student student10 = new Student("VIKRAM ADITYA", 'M', "Political Science");
        Student student11 = new Student("NISHA", 'F', "Anthropology");
        Student student12 = new Student("KARAN", 'M', "Geography");
        Student student13 = new Student("PRIYANKA SAH", 'F', "Psychology");
        Student student14 = new Student("ROHIT", 'M', "Linguistics");
        Student student15 = new Student("ANJALI", 'F', "Philosophy");
        Student student16 = new Student("RAVI", 'M', "History");
        Student student17 = new Student("SNEHA", 'F', "Economics");
        Student student18 = new Student("ARJUN ROY", 'M', "Political Science");
        Student student19 = new Student("MEERA", 'F', "Sociology");
        Student student20 = new Student("VIKRAM", 'M', "Anthropology");
        Student student21 = new Student("NEHA", 'F', "Geography");

        Student[] students = { student1, student2, student3, student4, student5, student6, student7, student8, student9,
                student10, student11, student12, student13, student14, student15, student16, student17, student18,
                student19, student20, student21 };
        AllocateRooms(students);

    }

    public static void AllocateRooms(Student[] students) {

        // Room allocation logic here
        int[] roomNumbers_girls = new int[students.length];
        int[] roomNumbers_boys = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            for (int p = 0; p < 5; p++) {
                for (int q = 0; q < 2; q++) {
                    students[i].girlshostel[p][q] = (p + 1) * 100 + (q + 1);
                    roomNumbers_girls[i] = students[i].girlshostel[p][q];
                    if (students[i].gender == 'F') {
                        System.out.println(students[i].name + " in GIRLS HOSTEL " + " in room number "
                                + students[i].girlshostel[p][q]);
                    } else if (students[i].gender == 'M') {
                        students[i].boyshostel[p][q] = (p + 1) * 100 + (q + 1);
                        roomNumbers_boys[i] = students[i].boyshostel[p][q];
                        System.out.println(students[i].name + " in BOYS HOSTEL " + " in room number "
                                + students[i].boyshostel[p][q]);
                    }

                }
            }

        }
    }
}