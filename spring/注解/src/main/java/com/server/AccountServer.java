package com.server;

import com.dao.IAccountDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class AccountServer implements IAccountServer{
    //业务层实现类,调用持久层
//    @Autowired
//    @Qualifier("accountDao2")
    @Resource(name = "accountDao")//相当于上面俩（直接查找bean的ID）
    private IAccountDao ad;
    public void saveAccount() {
        ad.saveAccount();
    }
}
