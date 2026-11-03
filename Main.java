
class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Student("KAVYA", 'F', "Computer Science"),
                new Student("RAHUL", 'M', "Mathematics"),
                new Student("PRIYA", 'F', "Physics"),
                new Student("ADITYA", 'M', "Chemistry"),
                new Student("ANITA", 'F', "Biology"),
                new Student("RAJ", 'M', "Economics"),
                new Student("SNEHA", 'F', "History"),
                new Student("ARJUN", 'M', "Philosophy"),
                new Student("MEERA", 'F', "Sociology"),
                new Student("VIKRAM ADITYA", 'M', "Political Science"),
                new Student("NISHA", 'F', "Anthropology"),
                new Student("KARAN", 'M', "Geography"),
                new Student("PRIYANKA SAH", 'F', "Psychology"),
                new Student("ROHIT", 'M', "Linguistics"),
                new Student("ANJALI", 'F', "Philosophy"),
                new Student("RAVI", 'M', "History"),
                new Student("SNEHA", 'F', "Economics"),
                new Student("ARJUN ROY", 'M', "Political Science"),
                new Student("MEERA", 'F', "Sociology"),
                new Student("VIKRAM", 'M', "Anthropology"),
                new Student("NEHA", 'F', "Geography")
        };

        AllocateRooms(students);
    }

    public static void AllocateRooms(Student[] students) {

        int girlsCount = 0;
        int boysCount = 0;

        for (int i = 0; i < students.length; i++) {

            Student s = students[i];

            if (s.gender == 'F') {

                int room = (girlsCount / 2) + 101;
                girlsCount++;

                System.out.println(
                        s.name + " | " + s.course +
                                " | GIRLS HOSTEL | Room " + room);

            } else if (s.gender == 'M') {

                int room = (boysCount / 2) + 101;
                boysCount++;

                System.out.println(
                        s.name + " | " + s.course +
                                " | BOYS HOSTEL | Room " + room);

            }
        }
    }
}
