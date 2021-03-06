package com.cn.sz.meiju;
/**
 * 
 * @author HuWeiLiang
 * @desc 枚举类的使用  
 * @date 2017年6月6日
 * @time 上午10:39:54 
 * @email huweiliang@tydic.com
 */
public class Person {

    public enum PersonEnum {

        Chinese("老毛", 90), Amrican("华盛顿", 79);

        private String name;

        private int age;

        private PersonEnum(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        
        
    }
    
    public static void main(String[] args) {
        
    }

}
