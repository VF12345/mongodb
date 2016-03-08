package org.tht.mongodb.mongodb;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2697704955906769680L;

	private Integer id;
	
	private String name;
	
	private Integer age;

	
	
	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	//type=3 押3付3
	//order 期数
	if(type=3){
		order=limit%3;
		a=limit/3;
		if(order==0){
			order=a;
		}else{
			if(order<=1){
				order=a+1;
			}else if(order<=2){
				order=a+2;
			}
		}
	}
	
	//Interest 本期利息
	//InterestSum 总利息
	//生成收款计划
	Interest=
	for(int i=1;i<=order;i++){
		Interest=
	}
}
	
	
	
