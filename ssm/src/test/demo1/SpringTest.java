package demo1;

import com.xiuzhen.dao.AccountDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@SpringJUnitWebConfig(SpringJUnit4ClassRunner.class)
public class SpringTest {
    @Autowired
    AccountDao accountDao;
    @Test
    public void test(){

        accountDao.findAll();

    }
}
