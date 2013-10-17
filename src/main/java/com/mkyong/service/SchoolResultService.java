package com.mkyong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mkyong.dao.SchoolResultDao;
import com.mkyong.model.Result;

public class SchoolResultService {
	@Autowired
	private SchoolResultDao resultDao;

	public List<Result> getResultsBySubject() {
		return resultDao.getResultsBySubject();
	}
}
