
abstract  class Trainer{
    abstract  void Teach();
    //abstract dont have implementation details (methods)

}
class Student extends Trainer{
    //child class only having the implementations(methods)
    void Teach(){
        System.out.println("training is going on");
    }
}

class AbstactEx{
    public static void main(String[] args){
        Student obj=new Student();
        obj.Teach();
    }
}