package com.qx.consumer.controller;

import com.qx.consumer.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	private static Logger logger = LoggerFactory.getLogger(DemoController.class);
	@Autowired 
	private DemoService demoService;

	/**
	 *
	 * @param postData
	 * @return
	 */
	@RequestMapping(value = "/demo", method = RequestMethod.POST)
	@ResponseBody
	public String demo(@RequestBody String postData){
			return demoService.demo().toString();
	}
}
