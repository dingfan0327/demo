//package com.yy.config;
//
//import javax.servlet.ServletException;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.*;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//
///**
// * 开启Mvc,自动注入spring容器。 WebMvcConfigurerAdapter：配置视图解析器
// * 当一个类实现了这个接口（ApplicationContextAware）之后，这个类就可以方便获得ApplicationContext中的所有bean
// *
// * @author xiangze
// *
// */
//@Configuration
//// 等价于<mvc:annotation-driven/>
//@EnableWebMvc
//public class MvcConfiguration   implements WebMvcConfigurer {
//	// Spring容器
//	private ApplicationContext applicationContext;
//
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		this.applicationContext = applicationContext;
//	}
//
////	/**
////	 * 静态资源配置
////	 *
////	 * @param registry
////	 */
////	@Override
////	public void addResourceHandlers(ResourceHandlerRegistry registry) {
////		// registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/resources/");
////		registry.addResourceHandler("/upload/**").addResourceLocations("file:/Users/baidu/work/image/upload/");
////	}
//
//	/**
//	 * 定义默认的请求处理器
//	 */
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		configurer.enable();
//	}
//
//	/**
//	 * 添加拦截器配置
//	 */
////	@Override
////	public void addInterceptors(InterceptorRegistry registry) {
////		/** customer拦截部分 **/
////		String interceptPath = "list.html";
////		// 注册拦截器
//////		InterceptorRegistration loginIR = registry.addInterceptor(new LoginInterceptor());
////		// 配置拦截的路径
//////		loginIR.addPathPatterns(interceptPath);
////		//排除拦截路径
//////		loginIR.excludePathPatterns("/user/*");
//////	loginIR.excludePathPatterns("/index.html");
////	}
//
//}
