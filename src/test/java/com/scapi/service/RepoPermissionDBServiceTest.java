package com.scapi.service;

import com.scapi.common.Constants;
import com.scapi.common.util.DateUtil;
import com.scapi.common.MockUtil;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SEJI on 2017-10-16.
 */
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RepoPermissionDBServiceTest extends CommonServiceTest{
//
//    @Before
//    public void setUp() {
//        setUpMockUtil();
//    }

    @Test
    public void searchPermisionByUserIdAndRepositoryId() throws Exception {

        MockUtil.rtnList = new ArrayList();
        Map map = new HashMap();
        map.put("userId", MockUtil.searchUserId);
        map.put("userName", MockUtil.userName);
        map.put("userEmail", MockUtil.userMail);
        map.put("userPermission", MockUtil.sRepoPermission);
        map.put("userPermissionNo", MockUtil.iRepoNo);
        MockUtil.rtnList.add(map);

       List<Map> mathRtnList = repoPermissionDBService.searchPermisionByUserIdAndRepositoryId(MockUtil.searchUserId, MockUtil.repoScmId);

       Assert.assertEquals(mathRtnList, MockUtil.rtnList);

    }
    @Test
    public void searchPermisionByUserIdAndInstanceId() throws Exception {
        MockUtil.rtnList = new ArrayList<>();
        Map map = new HashMap();
        map.put("no", MockUtil.getInstanceNo);
        map.put("userId", MockUtil.userId);
        map.put("userName", MockUtil.userName);
        map.put("userEmail", MockUtil.userMail);
        map.put("userRepoRole", MockUtil.userRepoRole );
        map.put("userCreateYn", MockUtil.userSearchCreateYn);
        map.put("userPermission", MockUtil.sRepoPermission);
        map.put("userPermissionNo", MockUtil.getPermissionNo);
        map.put("userModifiedDate",  DateUtil.rtnFormatString(Constants.DATE_FORMAT_1, MockUtil.userModifiedDate));
        map.put("userCreatedDate",  DateUtil.rtnFormatString(Constants.DATE_FORMAT_1, MockUtil.userCreatedDate));
        MockUtil.rtnList.add(map);
        List<Map> mathRtnList = repoPermissionDBService.searchPermisionByUserIdAndInstanceId(MockUtil.searchUserId, MockUtil.instanceId, MockUtil.repoScmId);
        Assert.assertEquals(mathRtnList, MockUtil.rtnList);
    }

}
