package com.zqy.demo.common_modular.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gxt
 * @date 2020/4/29 10:33
 */
public class DateUtil {

    private final static String FORMAT_DATE_ONE = "yyyy-MM-dd";

    /**
     * 格式化时间
     * @param date
     * @param format
     * @return
     */
    public static String getDateFormat(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}
