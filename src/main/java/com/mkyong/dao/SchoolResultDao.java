package com.mkyong.dao;

import java.util.ArrayList;
import java.util.List;

import com.mkyong.model.Result;

public class SchoolResultDao {
	public List<Result> getResultsBySubject() {
		List<Result> result = new ArrayList<Result>();
		Result rs1 = new Result();
		rs1.setSchool("AAAA");
		rs1.setSubject("Maths");
		rs1.setLatestY3("2.1");
		rs1.setLatestY5("2.1");
		rs1.setLatestY7("2.3");

		Result rs2 = new Result();
		rs2.setSchool("BBBB");
		rs2.setSubject("Maths");
		rs2.setLatestY3("2.2");
		rs2.setLatestY5("3.1");
		rs2.setLatestY7("2.4");

		result.add(rs1);
		result.add(rs2);

		return result;
	}
}
