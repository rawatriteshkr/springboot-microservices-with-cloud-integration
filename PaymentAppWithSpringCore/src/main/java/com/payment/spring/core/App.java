package com.payment.spring.core;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
    	PaymentEntry pe = (PaymentEntry) factory.getBean("paymentEntry");
    	pe.makePayment(1000);
    }
}
