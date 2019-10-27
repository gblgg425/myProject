package com.hqyj.factory;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hqyj.entity.Menu;
import com.hqyj.entity.Role;
import com.hqyj.service.MenuService;

public class MyShiroFilterFactoryBean extends ShiroFilterFactoryBean{

	//{0}为占位符  ROLE_STRING是用于字符串拼接
		private static final String ROLE_STRING = "roles[{0}]";
		//默认权限
		public static  String filterChainDefinitions="";
		//注入
		@Autowired
		private MenuService ms;
		
	    @Override
	    public void setFilterChainDefinitions(String definitions) {
	    	//System.out.println("$$$$$$$$$$$$$$");
	    	//每次都付给filterChainDefinitions
	    	filterChainDefinitions = definitions;
	        Ini ini = new Ini();
	        ini.load(definitions);
	        //did they explicitly state a 'urls' section?  Not necessary, but just in case:
	        Ini.Section section = ini.getSection(IniFilterChainResolverFactory.URLS);
	        if (CollectionUtils.isEmpty(section)) {
	            //no urls section.  Since this _is_ a urls chain definition property, just assume the
	            //default section contains only the definitions:
	            section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
	        }
	        Map<String,String[]> permsMap = new HashMap<String, String[]>();
	       //开始从数据库中取查询每个url所对应到的角色
	        List<Menu> menus = ms.findMenuAll();
	        //遍历查询出来的菜单
	        for (Menu menu : menus) {
				//获取每个菜单所对应的角色
	        	List<Role> rs = menu.getRoles();
	        	/*for (Role role : rs) {
					System.out.println(role+"***********");
				}*/
	        	
	        	//创建字符串数组用来存放角色名
	        	String[] roleNames = new String[rs.size()];
	        	for(int i=0;i<rs.size();i++) {
	        		//将每个rolename取出放到roleNames里面
	        		roleNames[i]=rs.get(i).getrName();
	        		
	        		
	        	}
	        	permsMap.put(menu.getmLink(), roleNames);
			}
	        for(String url : permsMap.keySet()) {
	        	//通过路径取得角色
	        	String[] roles = permsMap.get(url);
	        	
	        	StringBuilder sb = new StringBuilder();
	        	for(String role : roles) {
	        		sb.append(role).append(",");
	        	}
	        	//admin,test,guest
	        	//截取最后一个
	        	String str = sb.substring(0,sb.length()-1);
	        	 //System.out.println("str:"+str+"%%%%%%%%%%%");
				 //System.out.println(permsMap+"************");
				 //把对应的路径以及权限放到section中， MessageFormat.format(ROLE_STRING, str) 替换占位符{0}  
				 //System.out.println("MessageFormat.format(ROLE_STRING, str):"+MessageFormat.format(ROLE_STRING, str));
				 section.put(url, MessageFormat.format(ROLE_STRING, str));
	        	
	        }
	        section.put("/**", "authc");
	        setFilterChainDefinitionMap(section);
	        /**/
	    }
}
