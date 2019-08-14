package com.gupaoedu.vip.pattern.observer;

import com.google.common.eventBus.EventBus;
import com.google.common.eventBus.Subscribe;

public class ObserverTest {
	public static void main(String[] args) {

		EventBus eventBus = new EventBus();
		eventBus.register(new Question1());
		eventBus.post("线程池怎么配置");

		eventBus.register(new Teacher1());
		eventBus.post("回答问题");

		
		static class Question1 {
			@Subscribe
			public void question(String s) {
				System.out.println(s);
			}
		}

		static class Teacher1 {
			@Subscribe
			public void question(String s) {
				System.out.println(s);
			}
		}

	}

}
