/**   
 * <p>
 * Description:这里写描述<br />
 * </p>
 * @title Test.java
 * @package org.tht.mongodb.mongodb 
 * @author tanghaitao
 * @version 0.1 2015年12月11日
 */
package org.tht.mongodb.mongodb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;


/**   
 * <p>
 * Description:这里写描述<br />
 * </p>
 * @title Test.java
 * @package org.tht.mongodb.mongodb 
 * @author tanghaitao
 * @version 0.1 2015年12月11日
 */

public class Test {

    /**
     * 
     * <p>
     * Description:随机数+字母混合<br />
     * </p>
     * @author tanghaitao
     * @version 0.1 2015年12月11日
     * @param length 总长度
     * @param charLength 字母长度
     * @param numLength 数字长度
     * @return
     * String
     */
    public String getCharacterAndNumber(int length,int charLength,int numLength)  
    {  
    	int c=0;     
        int n=0;
        String val = "";  
        Random random = new Random();  
        for(int i = 1; i > 0; i++)  
        {  
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; // 输出字母还是数字  
            
            if("char".equalsIgnoreCase(charOrNum)) // 字符串  
            {  
            	if(c<charLength){
            		 int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; //取得大写字母还是小写字母  
                     val += (char) (choice + random.nextInt(26)); 
                     c++;
                }
               
            }  
            else if("num".equalsIgnoreCase(charOrNum)) // 数字  
            {  
            	if(n<numLength){
            		val += String.valueOf(random.nextInt(10)); 
            		n++;
            	}
                 
            }  
            
            if(c==charLength && n==numLength && (c+n)==length){
            	break;
            }
        }  
         
        return val;  
    }  
	
    
    public String judgeSex(String value) {
        value = value.trim();
        if (value == null || (value.length() != 15 && value.length() != 18)) {
            return "";
        }
        if (value.length() == 18) {
            String lastValue = value.substring(value.length() - 2, value.length() - 1);
            int sex = Integer.parseInt(lastValue) % 2;
            return sex == 0 ? "女性" : "男性";
        } else if(value.length() == 15){
        	 String lastValue = value.substring(value.length() - 1, value.length());
             int sex = Integer.parseInt(lastValue) % 2;
             return sex == 0 ? "女性" : "男性";
        }else{
            return "";
        }
    }
    
    
    
	public String getSexByIdNumber(String idCardNo) {
		String c = null;
		if(idCardNo.length() == 15){
			c=idCardNo.substring(14);
		}else if(idCardNo.length()==18){
			c=idCardNo.substring(16,17);
		}else{
			return null;
		}
		return String.valueOf((Integer.parseInt(c))%2);
	}
    
	static List<Employee> list =new ArrayList<Employee>();
	
	static Map<String,Object> map = new HashMap<String,Object>();
	
	
	public static void main(String[] args) {
		/*int a= (int) (Math.random()*9000+1000);
		System.out.println(a);
		String chars = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(chars.charAt((int)(Math.random() * 26)));*/
		/*Test t=new Test();
		String s=t.getCharacterAndNumber(6,2,4);
		System.out.println(s);*/
		//System.out.println((char) (77));
		/*System.out.println(t.judgeSex("429004199310114234"));
		System.out.println(t.getSexByIdNumber("429004199310114234"));*/
		
		Employee employee = new Employee();
		employee.setEmpid(3);
		map.put("a", employee);
		System.out.println(map.size());
		 for (Entry<String, Object> entry : map.entrySet()) {
			   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
			   Employee employee2=(Employee) entry.getValue();
			   System.out.println(employee2.getEmpid());
			   map.remove(entry.getKey());
			  }
		 
		 String ss="sd";
		 try {
			 Integer ds=Integer.parseInt(ss);
		} catch (Exception e) {
			System.out.println(map.size());
		}
		
	}

}
