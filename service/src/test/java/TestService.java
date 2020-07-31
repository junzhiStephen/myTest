
import com.ssmdemo.Account;
import com.ssmdemo.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestService {
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
    AccountService accountService = (AccountService) classPathXmlApplicationContext.getBean("accountServiceImp");
    @Test
    public void test(){

        List<Account> all = accountService.findAll();
        System.out.println("all = " + all);
    }
    @Test
    public void test1(){
        Account account = new Account(null, "ewr", "yjuhj", 200);
        accountService.insert(account);
    }
}
