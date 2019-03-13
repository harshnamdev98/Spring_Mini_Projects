package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		String msg1 = null, msg2 = null, msg3 = null, msg4 = null,msg5=null;
		Locale locale = null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null,btn5=null;
		// create IOC container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get the messages
		locale = new Locale(args[0], args[1]);
		msg1 = ctx.getMessage("btn.cap1", new Object[] {"emp"}, "msg1", locale);
		msg2 = ctx.getMessage("btn.cap2", new Object[] {}, "msg2", locale);
		msg3 = ctx.getMessage("btn.cap3", new Object[] {}, "msg3", locale);
		msg4 = ctx.getMessage("btn.cap4", new Object[] {}, "msg4", locale);
		msg5 = ctx.getMessage("btn.cap1", new Object[] {"emp"}, "msg4", new Locale("hi","IN"));
		// create Frame and buttons
		frame = new JFrame();
		frame.setTitle("I18nTest");
		frame.setLayout(new FlowLayout());
		btn1 = new JButton(msg1);
		btn2 = new JButton(msg2);
		btn3 = new JButton(msg3);
		btn4 = new JButton(msg4);
		btn5=new JButton(msg5);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
