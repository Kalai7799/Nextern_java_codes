public class EmailEx {
    public static void sendemail(String name ,String company){
        String emaildraft="dear "+name+" Welcome to "+company;
        System.out.println(emaildraft);
    }
    public static void main(String[] args){
        sendemail("kalai", "nexturn");
    }
}
