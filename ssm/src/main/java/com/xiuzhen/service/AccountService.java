package com.xiuzhen.service;

import com.xiuzhen.account.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountService {

    //查询所有
    List<Account> findAll();

    //保存
    void save(List<Account> list);

    //修改
    @Update("update ssm set username=#{}")
    void update(Account account);

    //删除
    @Delete("delete from ssm where id = #{}")
    void delete(Account account);

    //根据id查询
    @Select("select * from ssm where id=#{id}")
    Account select(Account account);
}
