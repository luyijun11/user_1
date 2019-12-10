package com.woniu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DeptMapper;
import com.woniu.pojo.Dept;
@Service
@Transactional
public class DeptServiceImpl implements IDeptService {
	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public Dept findOne(Integer deptno) {
		// TODO Auto-generated method stub
		return deptMapper.findOne(deptno);
	}

}
