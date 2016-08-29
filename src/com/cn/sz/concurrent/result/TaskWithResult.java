package com.cn.sz.concurrent.result;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {

	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "task with result of id:" + id;
	}

}
