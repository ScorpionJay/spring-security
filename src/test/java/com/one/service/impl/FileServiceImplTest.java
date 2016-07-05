//package com.one.service.impl;
//
//import static org.junit.Assert.fail;
//
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.one.app.Application;
//import com.one.service.FileService;
//
///**
//* @author	jay
//* @since	2016年7月1日
//*/
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
//public class FileServiceImplTest {
//
//	@Autowired
//	private FileService fileService;
//	
//	@Test
//	public void testSave() throws Exception{
//		
//		File file = new File("logo_og.png");
//		
//		InputStream input = null;
//		try {
//			input = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
//        byte[] b = new byte[1000];  
//        int n;  
//        while ((n = input.read(b)) != -1) {  
//            bos.write(b, 0, n);  
//        }  
//        input.close();  
//        bos.close();  
//        
//		String str = file.getName().substring(file.getName().lastIndexOf('.')+1);
//		fileService.save(bos.toByteArray(), file.getName(),str);
//		
//	}
//
//	@Test
//	public void testGetByName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetById() {
//		HttpServletResponse res = null;
//		fileService.getById("577606bb8cda23ce7a0369ff",res);
//	}
//
//}
