package schedularDB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;
@Service
public class UserService {

    Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao dao;

//    // schedule a job to add object in database in every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void add2DBJob()
    {
        User user = new User();
        user.setName("iphone" + new Random().nextInt(374483));
        dao.save(user);
        System.out.println("added object in database at :"+  new Date().toString());
    }

    // 2nd schedile to fetch data from database in every 15 seconds
    @Scheduled(cron ="0/15 * * * * *")
    public void fetchDBJob()
    {
        List<User> users = dao.findAll();
        System.out.println("fetched  object from database at :"+  new Date().toString());
        System.out.println("no of records :"+  users.size());
        log.info("Users: {}", users);

    }
}
