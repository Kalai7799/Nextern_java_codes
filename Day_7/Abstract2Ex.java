
abstract class Database{
    abstract void connecting();
    void disconnet(){
        System.out.println("disconnected");

    }

}
class Mydata extends Database{
    void connecting(){
        System.out.println("connected to database");
    }
}

public class Abstract2Ex{
    public static void main(String[] args){
        Mydata db=new Mydata();
        db.connecting();
        db.disconnet();
    }
}