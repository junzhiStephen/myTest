import com.ssmdemo.Account;
import com.ssmdemo.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestA {
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
    AccountDao accountDao = classPathXmlApplicationContext.getBean(AccountDao.class);
    @Test
    public void test(){

        List<Account> all = accountDao.findAll();
        System.out.println("all = " + all);
    }
    @Test
    public void test2(){
        Account account = new Account(null, "zzz", "sdf", 100.0);
        accountDao.insertAccount(account);

    }
}
