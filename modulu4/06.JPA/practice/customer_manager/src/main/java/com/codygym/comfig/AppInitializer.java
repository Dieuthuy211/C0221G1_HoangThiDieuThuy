package com.codygym.comfig;

import com.codygym.model.repository.CustomerRepository;
import com.codygym.model.repository.ICustomerRepository;
import com.codygym.model.service.CustomerService;
import com.codygym.model.service.ICustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
//    @Bean
//    public ICustomerRepository customerRepository() {
//        return new CustomerRepository();
//    }
//
//    @Bean
//    public ICustomerService customerService() {
//        return new CustomerService();
//    }
}
