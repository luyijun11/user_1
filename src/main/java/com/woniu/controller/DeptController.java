package com.woniu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.service.IDeptService;

@Controller
public class DeptController {
	@Autowired
	private IDeptService deptService;
	@RequestMapping("findOne")
	public String findOne(Integer deptno,HttpServletRequest req){
		req.setAttribute("dept", deptService.findOne(deptno));
		return "index";
	}
}
