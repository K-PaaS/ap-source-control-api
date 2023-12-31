package com.scapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sonia.scm.client.RepositoryClientHandler;
import sonia.scm.client.ScmClient;
import sonia.scm.client.ScmClientSession;

/**
 * Created by ijlee on 2017-07-16.
 */
@Service
public class CommonService {


    /**
     * SCM Server connection Session Information
     */
    @Value("${api.base.url}")  private String url;
    @Value("${admin.id}")  private String username;
    @Value("${admin.pwd}")  private String password;

    protected Logger logger = LoggerFactory.getLogger(super.getClass());

    ScmClientSession scmAdminSession(){
        return ScmClient.createSession(url, username, password);
    }

    RepositoryClientHandler createRepositoryClientHandler(){
        return scmAdminSession().getRepositoryHandler();
    }

}
