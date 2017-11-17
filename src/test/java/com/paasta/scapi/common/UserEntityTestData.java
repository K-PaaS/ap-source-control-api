package com.paasta.scapi.common;
import com.paasta.scapi.entity.ScUser;
import org.springframework.http.HttpStatus;
import sonia.scm.user.User;

import java.util.*;

public final class UserEntityTestData
{

    private static String modifyName = "modifyName";
    private static String modifyMail = "modifyMail@aaa.aa.aa";
    private static boolean modifAdmin = true;
    private static boolean modifyActive = true;
    private static String modifyPassword = "modifyPassword";
    private static String modifyPasswordSet = "modifyPassword";
    private static String modifyDesc = "modifyDesc";


    private UserEntityTestData() {}

    public static ScUser createScUser()
    {
        return new ScUser(MockUtil.userId, MockUtil.userName, MockUtil.userMail, MockUtil.userDesc);
    }
    public static ScUser getScUser()
    {
        return new ScUser(MockUtil.userId, MockUtil.userName, MockUtil.userMail, MockUtil.userDesc);
    }
    public static ScUser getEmptyScUser()
    {
        return null;
    }
    public static User createUser()
    {
        return new User(MockUtil.userId, MockUtil.userName, MockUtil.userMail);
    }
    public static User getUser()
    {
        return new User(MockUtil.userId, MockUtil.userName, MockUtil.userMail);
    }
    public static User modifyeUser()
    {
        return new User(MockUtil.userId, MockUtil.userName, MockUtil.userMail);
    }
    public static List<ScUser> getLstScUser()
    {
        List<ScUser> rtnList = new ArrayList();
        rtnList.add(createScUser());
        return rtnList;
    }

    public static List<User> getLstUser()
    {
        List<User> rtnList = new ArrayList();
        rtnList.add(createUser());
        return rtnList;
    }

    public static LinkedHashMap createModifyUser()
    {
        LinkedHashMap createModifyUser = new LinkedHashMap();

        createModifyUser.put("displayName",modifyName);
        createModifyUser.put("mail",modifyMail);
        createModifyUser.put("admin",modifAdmin);
        createModifyUser.put("active",modifyActive);
        createModifyUser.put("password",modifyPassword);
        createModifyUser.put("PasswordSet",modifyPasswordSet);
        createModifyUser.put("desc",modifyDesc);
        return createModifyUser;
    }

    public static Map getMapUser(){
        Map rspApp = new HashMap();
        rspApp.put("ScUser", getUser());
        rspApp.put("rtnUser",getScUser());
        rspApp.put("status", HttpStatus.OK.value());
        rspApp.put("message", "사용자 정보 조회에 성공하였습니다.");
        return rspApp;
    }
    public static Map getEmptyUser(){
        Map rspApp = new HashMap();
        rspApp.put("ScUser", null);
        rspApp.put("rtnUser",null);
        rspApp.put("status",HttpStatus.NOT_FOUND.value());
        rspApp.put("message","사용자 존재하지 않습니다.");
        return rspApp;
    }
}