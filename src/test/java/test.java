import com.es.data.Time;
import com.es.data.UserData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by perfection on 16-1-5.
 */
public class test {
    public static void main(String[] args){
//        Time time = new Time();
//        System.out.println(time.getTime());
//        UserData userData = new UserData();
//        for(int i=0;i<1000;i++){
//
//            System.out.println(userData.getSexData());
//        }

//            String times = "2015-12-"+(new Random().nextInt(31)+1)+" "+(new Random().nextInt(23))+":"+(new Random().nextInt(59))+":00";
        String times = "2015-12-2 0:0:00";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = null;
            try {
                date = simpleDateFormat.parse(times);
                System.out.println(date.getTime()/1000);
//                return date.getTime()/1000;
            } catch (ParseException e) {
                e.printStackTrace();
            }

    }
}
