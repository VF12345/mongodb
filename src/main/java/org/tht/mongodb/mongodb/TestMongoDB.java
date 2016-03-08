package org.tht.mongodb.mongodb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Field;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;



public class TestMongoDB {

	  public static void main(String[] args) {
		  
		    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mongodb.xml");
		 
		    MongoTemplate mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");
		    
		    GridFsTemplate gridFsTemplate=(GridFsTemplate) ctx.getBean("gridFsTemplate");
		    
		  /*  DBObject metaData = new BasicDBObject();
			metaData.put("extra1", "anything 1");
			metaData.put("extra2", "anything 2");
		    
			
			
			
			InputStream inputStream = null;
			try {
				inputStream = new FileInputStream("C://ZipTest/20150702163702.jpg");
				gridFsTemplate.store(inputStream, "20150702163702.jpg", "image/jpg", metaData);
		 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				if (inputStream != null) {
					try {
						inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			*/
			
		GridFSDBFile list=gridFsTemplate.findOne(new Query(Criteria.where("filename").is("20150702163702.jpg")));
			
			try {
				System.out.println(list.writeTo(new File("D:\\test\\tht.jpg")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//GridFSDBFile list=gridFsTemplate.findOne(new Query(Criteria.where("filename").is("20150702163702.jpg")));
			/*InputStream file=list.getInputStream();
			try {
				OutputStream outputStream=new FileOutputStream("");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		   /* User user=new User();
			user.setId(2);    
			user.setName("tht");
			user.setAge(22);
			mongoTemplate.save(user);*/
			
			/*User user=mongoTemplate.findOne(new Query(Criteria.where("id").is(1)), User.class, "user");
			System.out.println(user.getName());*/
			
			
			//mongoTemplate.upsert(new Query(Criteria.where("id").is(1)), Update.update("name", "VF"), User.class, "user");
			
			/*User user=mongoTemplate.findOne(new Query(Criteria.where("id").is(2)).addCriteria(new Criteria().where("name").is("tht")), User.class, "user");
			System.out.println(user.getName());
			*/
			//mongoTemplate.remove(new Query(Criteria.where("id").is(1)), User.class, "user");
		 /*  List<User> user= mongoTemplate.findAll(User.class);
		   Query query=new Query();
		   query.with(new Sort(Sort.Direction.ASC,"id"));
		   mongoTemplate.find(query, User.class);
		   System.out.println(user.size());*/
		    
		    
		    
		  /*  Employee employee=new Employee();
		    employee.setFirstname("zhangs");
		    employee.setLastname("lis");
		    employee.setEmpid(1);
		    mongoTemplate.save(employee, "employee2");*/
		   
		 /*  List<Employee> employee=mongoTemplate.findAll(Employee.class,"employee2");
		   for (Employee employee2 : employee) {
			System.out.println(employee2.getId());
		}*/
		    
		   
		   
		 /*  try {
			   String filename = "20150702163702.jpg";
			   File file1=new File("C://ZipTest/20150702163702.jpg");
	            DB db = mongoTemplate.getDb();
	            // 存储fs的根节点
	            GridFS gridFS = new GridFS(db, "file");
	            GridFSInputFile gfs = gridFS.createFile(file1);
	            gfs.put("aliases", "a");
	            gfs.put("filename", "20150702163702.jpg");
	            gfs.put("contentType", filename.substring(filename.lastIndexOf(".")));
	            gfs.save();
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("存储文件时发生错误！！！");
	        }*/
		   
		   
	  }
	
}
