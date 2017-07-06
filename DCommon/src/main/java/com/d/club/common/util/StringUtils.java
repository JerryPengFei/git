package com.d.club.common.util;

import com.d.club.common.exception.StringException;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static Boolean isBlank(String str) {
        return org.apache.commons.lang3.StringUtils.isBlank(str);
    }

    public static Boolean isNotBlank(String str) {
        return org.apache.commons.lang3.StringUtils.isNotBlank(str);
    }

    public static Boolean contains(String str, String containsString) {
        return org.apache.commons.lang3.StringUtils.contains(str, containsString);
    }

    public static Boolean startWith(String str, String start) {
        return org.apache.commons.lang3.StringUtils.startsWith(str, start);
    }

    public static Boolean endWith(String str, String start) {
        return org.apache.commons.lang3.StringUtils.endsWith(str, start);
    }

    public static Integer containsCount(String str, String containsString) throws StringException {
        if (isBlank(containsString)) {
            throw new StringException("包含字符串不可以為空");
        } else if (isBlank(str)) {
            throw new StringException("源字符串不可以為空");
        } else {
            Integer count = 0;
            Pattern pattern = Pattern.compile(containsString);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                count++;
            }
            return count;
        }


    }

    public static String[] asArray(String str, String split) throws StringException {
        if (isBlank(str)) {
            throw new StringException("字符串不可以為空");
        } else if (isBlank(split)) {
            throw new StringException("分隔符不可以為空!");
        } else {

            return str.trim().split(split.trim());
        }
    }

    public static List<String> asList(String str, String split) throws StringException {
        String[] array = asArray(str, split);
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
//        System.out.println(isBlank("       "));
//        System.out.println(isNotBlank(null));
//        System.out.println(contains("abc","b1"));
        try {
            System.out.println(containsCount("asdasdfsdfdfasdfsd", "as"));
        } catch (StringException e) {
            e.printStackTrace();
        }
    }
}
