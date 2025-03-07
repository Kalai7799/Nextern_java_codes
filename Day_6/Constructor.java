class Student{
    String name;
    int roll;
    char grade;

    Student(String name,int roll,char grade){
        this.name=name;
        this.roll=roll;
        this.grade=grade;

    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll no. : "+roll);
        System.out.println("Grade: "+grade);
    }
}
public class Constructor{
    public static void main(String[] args) {
        Student obj= new Student("kalai", 47, 'S');
        obj.display();
    }
}