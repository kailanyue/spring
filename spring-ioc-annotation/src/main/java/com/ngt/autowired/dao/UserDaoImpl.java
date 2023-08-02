package com.ngt.autowired.dao;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.stereotype.Repository;

/**
 * 2023-08-03 0:51
 */
@Log4j2
@Repository
public class UserDaoImpl implements UserDao{
	@Override
	public void add() {
		log.info("Dao 层执行了...");

	}
}
