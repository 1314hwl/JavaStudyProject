package com.cn.sz.concurrent.result;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo001 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Future<String>> results = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			results.add(exec.submit(new TaskWithResult(i)));
		}

		for (Future<String> f : results) {
			try {
				System.out.println("--->"+f.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e);
			} catch (ExecutionException e) {
				e.printStackTrace();
				System.out.println(e);
			} finally {
				exec.shutdown();
			}
		}
	}

}
