package com.pp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.pp.model.LoginDto;

@Component
public class TimeInterceptor  extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {                       
		
		System.out.println("time prehandler");
		
		long l = System.currentTimeMillis();
		System.out.println(l);
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub                                                                                           
		long l2 = System.currentTimeMillis();
		
		System.out.println("Post Timeinterceptor");
		
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub                                   
		
		System.out.println("Post CompletionInterceptor");
		
	}
	

}
