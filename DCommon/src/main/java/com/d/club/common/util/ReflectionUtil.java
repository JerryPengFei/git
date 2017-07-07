package com.d.club.common.util;

import com.d.club.common.entity.Order;

import java.lang.reflect.Constructor;
import java.lang.reflect.TypeVariable;

/**
 * java反射工具
 */
public class ReflectionUtil {
    public static String getClassFullName(Class clazz){
        return clazz.getCanonicalName();
    }
    public static String getClassName(Class clazz){
        return clazz.getSimpleName();
    }
    public static String getExtends(Class clazz){
        return getClassFullName(clazz.getSuperclass());
    }
    public static Boolean checkInterface(Class clazz,Class impl){
        Class[] arr=clazz.getInterfaces();
        if(arr.length==0){
            return false;
        }else {
            for(int i=0;i<arr.length;i++){
                if(arr[i].getCanonicalName().equals(getClassFullName(impl))){
                    return true;
                }
            }
            return false;
        }
    }
    public static Constructor[] getConstructors(Class clazz){
        return clazz.getConstructors();
    }


    public static void main(String[] args) {
//        System.out.println(getClassFullName(ReflectionUtil.class));
//        System.out.println(getExtends(Order.class));
//        System.out.println(checkInterface(Order.class, Demo.class));
        Constructor[] constructors=getConstructors(Order.class);
        System.out.println(constructors.length);
        for(int i=0;i<constructors.length;i++){
            TypeVariable[] typeVariables=constructors[i].getTypeParameters();
           for(int j=0;j<typeVariables.length;j++){
               System.out.println(typeVariables[j].getName());
           }
        }
    }
}
