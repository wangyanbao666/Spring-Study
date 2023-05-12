package dependency_injection.Service;

import dependency_injection.userDao.UserDao;
import dependency_injection.userDao.VipDao;

public class Service {

    Service(VipDao vipDao){
        this.vipDao = vipDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;
    private VipDao vipDao;
    public void saveUser(){
        userDao.insert();
    }
}
