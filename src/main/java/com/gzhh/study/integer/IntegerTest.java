package com.gzhh.study.integer;

/**
 * @author gengzhenhua
 *
 * @description: 自动拆/装箱
 * 
 */
public class IntegerTest {
    
    public static void main(String[] args) {

        Integer a = 1;
        
        Integer b = 2;
        
        Integer c = 3;
        
        Integer d = 3;
        
        Integer e = 321;
        
        Integer f = 321;
        
        Long g = 3L;
        
        System.out.println(c == d);//true
        System.out.println(e == f);//false
        System.out.println(c == (a + b));//true
        System.out.println(c.equals(a + b));//true
        System.out.println(g == (a + b));//true
        System.out.println(g.equals(a + b));//false

//       编译后的class文件
//        Integer a = Integer.valueOf(1);
//
//        Integer b = Integer.valueOf(2);
//
//        Integer c = Integer.valueOf(3);
//
//        Integer d = Integer.valueOf(3);
//
//        Integer e = Integer.valueOf(321);
//
//        Integer f = Integer.valueOf(321);
//
//        Long g = Long.valueOf(3L);
//
//        System.out.println(c == d);
//        System.out.println(e == f);
//        System.out.println(c.intValue() == a.intValue() + b.intValue());
//        System.out.println(c.equals(Integer.valueOf(a.intValue() + b.intValue())));
//        System.out.println(g.longValue() == a.intValue() + b.intValue());
//        System.out.println(g.equals(Integer.valueOf(a.intValue() + b.intValue())));
        
//        包装类的"==" 运算在不遇到算术运算的情况下不会自动拆箱，以及他们的equals() 方法不处理数据转型的关系
        
    }

}
