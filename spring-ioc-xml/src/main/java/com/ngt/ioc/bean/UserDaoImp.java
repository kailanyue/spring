package com.ngt.ioc.bean;

import lombok.extern.log4j.Log4j2;

/**
 * 2023-07-29 17:22
 * @author 696292
 */


@Log4j2
public class UserDaoImp implements UserDao {
    @Override
    public void run() {
        log.info("{}: run.....", this.getClass().getName());
    }
}
