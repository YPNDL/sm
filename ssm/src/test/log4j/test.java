package log4j;

import com.xiuzhen.account.Account;
import com.xiuzhen.dao.AccountDao;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
    private static final Logger logger = Logger.getLogger(test.class);
    @Autowired
    AccountDao accountDao;
    @Test
    public void demo(){
       List <Account>account=accountDao.findAll();
        logger.info("account is==============="+account);
    }
}
