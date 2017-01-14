public class TestQ3 {

    public static void main(String[] args) {
        Programme programme = new Programme("cs", "Computer Science", "Master");
        Programme programmeCopy = new Programme("cs", "Computer Science", "Master");
        School school = new School("sms", "Sønderskolen", School.JUNIOR_SCHOOL);
        School schoolCopy = new School("sms", "Sønderskolen", School.JUNIOR_SCHOOL);
        School highschool = new School("gs", "Glum skole", School.HIGH_SCHOOL);
        Student lukas = new Student("Lukas", programme);
        Student lukasCopy = new Student("Lukas", programmeCopy);
        Student andreas = new Student("Andreas", school);
        Student hedvig = new Student("Hedvig", highschool);
        StudentList sl = new StudentList();

        //testing the Education class
        System.out.println("Test 1: " + programme.getCode().equals("cs"));
        System.out.println("Test 2: " + school.getTitle().equals("Sønderskolen"));

        //testing the Programme class
        System.out.println("Test 3: " + programme.getLevel().equals("Master"));
        System.out.println("Test 4: " + programme.equals(programmeCopy));

        //testing the School class
        System.out.println("Test 5: " + school.getSchoolType().equals(School.JUNIOR_SCHOOL));
        System.out.println("Test 6: " + school.equals(schoolCopy));

        //testing the Student class
        System.out.println("Test 7: " + lukas.getName().equals("Lukas"));
        System.out.println("Test 8: " + (lukas.getEducation()==programme));
        andreas.changeEducation(schoolCopy);
        System.out.println("Test 9: " + (andreas.getEducation()==schoolCopy));
        System.out.println("Test 10: " + lukas.equals(lukasCopy));

        //testing the StudentList class
        System.out.println("Test 11: " + (sl.getNumberOfStudents()==0));
        sl.addStudent(lukas);
        sl.addStudent(lukasCopy);
        sl.addStudent(andreas);
        sl.addStudent(hedvig);
        System.out.println("Test 12: " + sl.getStudent(0).equals(lukas));
        System.out.println("Test 13: " + (sl.getNumberOfStudentsByEducation(programme)==2));
        System.out.println("Test 14: " + (sl.getStudentsByEducation(school) instanceof Student[]));
        System.out.println("Test 15: " + (sl.getStudentsByEducation(school).length==1));
        System.out.println("Test 16: " + (sl.getNumberOfHighSchoolStudents()==1));
        sl.removeStudent(lukasCopy);
        System.out.println("Test 17: " + (sl.getNumberOfStudents()==3));
    }
}
