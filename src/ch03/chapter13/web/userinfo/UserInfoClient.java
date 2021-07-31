package ch03.chapter13.web.userinfo;

import ch03.chapter13.domain.userinfo.UserInfo;
import ch03.chapter13.domain.userinfo.dao.UserInfoDao;
import ch03.chapter13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch03.chapter13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");


        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setUserName("imslw96");
        userInfo.setPassword("787574");


        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDao= new UserInfoMySqlDao();
        }
        else {
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
