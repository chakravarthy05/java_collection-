import java.time.LocalDate;

public class Application {

    public static void main(String [] arg){

       private  UserServices userServ;

     userServ.createUser(1,LocalDate.of(2022, 3, 22), LocalDate.of(2016, 3, 25));
     userServ.createUser(10,LocalDate.of(2022, 4, 22), LocalDate.of(2016, 3, 27));
     userServ.createUser(3,LocalDate.of(2022, 3, 27), LocalDate.of(2016, 3, 29));
     userServ.createUser(2,LocalDate.of(2022, 6, 23), LocalDate.of(2016, 7, 28));

    }

}
