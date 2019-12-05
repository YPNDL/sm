package demo1;

import com.xiuzhen.account.Account;
import com.xiuzhen.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringMybatis {
  @Autowired
  AccountService accountService;
    @Test
    public void test() {


        //ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //AccountService accountService = (AccountService)ac.getBean("accountServiceImpl");

        //Account account = new Account();
        //查询所有
        //List<Account> all = accountService.findAll();
        //System.out.println(all);
//        根据id查询
//        account.setId(1);
//        Account select = accountService.select(account);

        //根据id修改名字
//        account.setId(1);
//        account.setUsername("张三");
//        accountService.update(account);

        //保存
        //account.setUsername("康路");
        //account.setPassword("123");

        //Date date = new Date();
        //long time = date.getTime();

        //for (int a = 0; a <=10000 ; a++) {
            //accountService.save(account);
        //}

        //Date date2 = new Date();
        //long time2 = date2.getTime();
//        System.out.print("一共用：");
////        System.out.println(time);
////        System.out.println(time2);
        //根据id删除
        //account.setId(1);
        //accountService.delete(account);


        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
       //AccountServiceImpl accountService = (AccountServiceImpl)applicationContext.getBean("accountServiceImpl");

        //AccountServiceImpl accountService = new AccountServiceImpl();
        //accountService.findAll();
        //List<Account> all1 = accountService.findAll();
        //System.out.println(all1);


      //  List<Account> all = accountDao.findAll();

//        for (Account account : all1){
//            System.out.println(account);
//        }



    // 批量插入
        Date date = new Date();
        System.out.println(date.getTime());
        ArrayList<Account> accounts = new ArrayList<>();

        for(int i=0; i<=10000; i++){
            Account account = new Account();
            account.setId(20+i);
            account.setUsername("李四");
            account.setPassword("123456");
            accounts.add(account);
        }
        accountService.save(accounts);
        Date date1 = new Date();
        System.out.println(date1.getTime());
    }
}
