import com.es.data.Time;
import com.es.data.UserData;

/**
 * Created by perfection on 16-1-5.
 */
public class test {
    public static void main(String[] args){
//        Time time = new Time();
//        System.out.println(time.getTime());
        UserData userData = new UserData();
        for(int i=0;i<1000;i++){

            System.out.println(userData.getSexData());
        }
    }
}
