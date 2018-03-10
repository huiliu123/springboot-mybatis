package org.spring.springboot.hessian.invok;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.controller.home.HomeRestController;
import org.spring.springboot.hessian.bean.Info;
import org.springframework.stereotype.Service;

@Service("testFactoryInvoke")
public class TestFactoryInvoke {
	
	protected static final Logger logger = LoggerFactory.getLogger(HomeRestController.class);
	
	public Info invoke(Info info) {
		Info respInfo = new Info();
		logger.info("--invok---ok!");
		return respInfo;
	}
	
}
