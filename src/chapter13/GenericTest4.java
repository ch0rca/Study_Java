package chapter13;

class Person {}
class Worker extends Person {}
class Student extends Person {}
class HighStudent extends Student {}
class MiddleStudent extends Student {}
class Animal {}

// 🔹 Applicant<T>: 어떤 타입의 지원자든 담을 수 있는 제네릭 클래스
class Applicant<T> {
    public T kind;
    public Applicant(T kind) { this.kind = kind; }
}

class Course {

    // 🔹 <?> (Unbounded 와일드카드): 어떤 타입의 Applicant든 모두 허용
    //    Animal, Person, Worker, Student, HighStudent 등 모두 가능
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
    }

    // 🔹 <? extends Student> (Upper Bounded): 상한 제한
    //    Student 자신 + 하위(HighStudent, MiddleStudent)만 허용
    // ⚠️ Person, Worker, Animal은 컴파일 에러 — Student 계층이 아님
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2를 등록함");
    }

    // 🔹 <? super Worker> (Lower Bounded): 하한 제한
    //    Worker 자신 + 상위(Person)만 허용
    // ⚠️ Student, HighStudent, MiddleStudent는 컴파일 에러 — Worker 상위 계층 아님
    // 💡 "직장인 이상(Worker, Person)만 등록 가능한 과정"을 타입으로 표현
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
    }
}

public class GenericTest4 {
    public static void main(String[] args) {

        // 🔹 Course1: <?> — 모든 타입 허용
        Course.registerCourse1(new Applicant<Animal>(new Animal()));
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // 🔹 Course2: <? extends Student> — Student 계열만 허용
//      Course.registerCourse2(new Applicant<Animal>(new Animal()));   // ❌
//      Course.registerCourse2(new Applicant<Person>(new Person()));   // ❌
//      Course.registerCourse2(new Applicant<Worker>(new Worker()));   // ❌
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // 🔹 Course3: <? super Worker> — Worker + 상위(Person)만 허용
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
//      Course.registerCourse3(new Applicant<Student>(new Student()));      // ❌
//      Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); // ❌
//      Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); // ❌
    }
}