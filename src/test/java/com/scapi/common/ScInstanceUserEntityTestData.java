package com.scapi.common;

import com.scapi.entity.ScInstanceUser;

import java.util.ArrayList;
import java.util.List;

public final class ScInstanceUserEntityTestData
{

    private ScInstanceUserEntityTestData() {}

    public static ScInstanceUser createScInstanceUser()
    {
        ScInstanceUser scInstanceUser = new ScInstanceUser(MockUtil.instanceId, MockUtil.userId, MockUtil.userRepoRole, MockUtil.userCreateYn);
        scInstanceUser.setNo(MockUtil.getPermissionNo);
        scInstanceUser.setCreatedDate(MockUtil.userCreatedDate);
        scInstanceUser.setModifiedDate(MockUtil.userModifiedDate);
        return scInstanceUser;
    }
    public static ScInstanceUser searchScInstanceUser()
    {
        ScInstanceUser scInstanceUser = new ScInstanceUser(MockUtil.instanceId, MockUtil.userId, MockUtil.userRepoRole, MockUtil.userSearchCreateYn);
        scInstanceUser.setNo(MockUtil.getPermissionNo);
        scInstanceUser.setCreatedDate(MockUtil.userCreatedDate);
        scInstanceUser.setModifiedDate(MockUtil.userModifiedDate);
        return scInstanceUser;
    }
    public static List<ScInstanceUser> getLstScInstanceUser()
    {
        List<ScInstanceUser> rtnList = new ArrayList();
        rtnList.add(createScInstanceUser());
        return rtnList;
    }
    public static List<ScInstanceUser> getSearchScInstanceUser()
    {
        List<ScInstanceUser> rtnList = new ArrayList();
        rtnList.add(searchScInstanceUser());
        return rtnList;
    }

}