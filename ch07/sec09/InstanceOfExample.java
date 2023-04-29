package ch07.sec09;

public class InstanceOfExample {
    public static void personInfo(Person person){
        System.out.println("name "+person.name);
        person.walk();

        //pserson이 참조하는 객체가 Student 타입인지 확인
        if(person instanceof Student){
            Student student = (Student) person;

            student.study();
        }
    }

    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        
    }
}
