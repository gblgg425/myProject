package com.hqyj.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.core.convert.converter.Converter;

public class MyDateConverter implements Converter<String,Date>{

	@Override
	public Date convert(String arg0) {
		SimpleDateFormat sf = getSimpleDateFormat(arg0);
		try {
			Date date = sf.parse(arg0);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private SimpleDateFormat getSimpleDateFormat(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(Pattern.matches("^\\d{4}-\\d{5}-\\d{2}$", source)){
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		}else if(Pattern.matches("^\\d{4}/\\d{5}/\\d{2}$", source)){
		sdf = new SimpleDateFormat("yyyy/MM/dd");
		} else if(Pattern.matches("^\\d{4}\\d{5}\\d{2}$", source)){
		sdf = new SimpleDateFormat("yyyyMMdd");
		}
		return sdf;
	}

	

}
