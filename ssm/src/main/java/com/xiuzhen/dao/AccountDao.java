package com.xiuzhen.dao;

import com.xiuzhen.account.Account;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("dao")
public interface AccountDao {

    //@Select("select * from ssm")
    //查询所有
    List<Account> findAll();

    //保存
    //@Insert("insert into ssm values(null,#{username},#{password})")
    //void save(Account account);
    void save(List<Account> list);

    //修改
    //@Update("update ssm set username=#{username} where id = #{id}")
    void update(Account account);

    //删除
    //@Delete("delete from ssm where id = #{id}")
    void delete(Account account);

    //根据id查询
    //@Select("select * from ssm where id=#{id}")
    Account select(Account account);


}
