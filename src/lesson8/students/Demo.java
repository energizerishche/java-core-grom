package lesson8.students;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(createHighestParent().toString());
        System.out.println(createLowestChild().toString());
    }

    public static Student createHighestParent(){
        Course[] courses = {createNewCourse()};

        return new Student("FirstName", "LastName", 1, courses);
    }

    public static Student createLowestChild(){
        return new SpecialStudent("FirstName", "LastName", 1, null, 124, "test@mail.com");
    }

    public static Course createNewCourse() {
        return new Course(new Date(0), "First Course", 100, "Mr. Teacher", null);
    }
}
