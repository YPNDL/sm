package com.xiuzhen.service.impl;

import com.xiuzhen.account.Account;
import com.xiuzhen.dao.AccountDao;
import com.xiuzhen.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {

    @Resource(name = "dao")
    private AccountDao accountDao;

    //查询所有
    public List<Account> findAll() {
        System.out.println("AccountServiceImpl,findAll");
        List<Account> all = accountDao.findAll();
        return all;
    }

    //保存
    public void save(List<Account> list) {
        //System.out.println("AccountServiceImpl,save");
        accountDao.save(list);
    }

    //修改
    //@Update("update ssm set username=#{}")
    public void update(Account account){
        accountDao.update(account);
    }

    //删除
    //@Delete("delete from ssm where id = #{}")
    public void delete(Account account){
        accountDao.delete(account);
    }

    //根据id查询
    //@Select("select * from ssm where id=#{id}")
    public Account select(Account account){
        Account select = accountDao.select(account);
        return select;
    }
}
