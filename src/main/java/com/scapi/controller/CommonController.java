package com.scapi.controller;

import com.scapi.common.Common;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class CommonController extends Common {

    final Logger logger = LoggerFactory.getLogger(getClass());
}
