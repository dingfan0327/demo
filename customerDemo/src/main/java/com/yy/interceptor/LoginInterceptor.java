package com.yy.interceptor;

import java.io.PrintWriter;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yy.entity.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	/**
	 * 主要做事前拦截，即用户操作发生前，改写preHandle里的逻辑，进行拦截
	 */
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		// 从session中取出用户信息来
//		Object userObj = request.getSession().getAttribute("user");
//		if (userObj != null) {
//			// 若用户信息不为空则将session里的用户信息转
//			User user = (User)userObj;
//			// 做空值判断，确保userId不为空
//			if (user != null && user.getUid() != null)
//				// 若通过验证则返回true,拦截器返回true之后，用户接下来的操作得以正常执行
//				return true;
//		}
//		response.sendError(401);
//		throw new RuntimeException();
//	}

	static void sort(int []arr){
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if (arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}
	public static void main(String[] args){
		int[] arr={12,32,1,-1,43,2};
		sort(arr);
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//
//		}
		for(int str:arr){
            System.out.println(str+"11111111111");
        }
	}


}
