package com.gemini.test;

/**
 * @author luao
 * @description 类加载顺序
 * 1。加载父类静态属性和静态方法块，加载子类静态属性和静态方法块
 * 2。加载父类非静态属性和非静态方法块和构造器，加载子类非静态属性和非静态方法块和构造器
 *
 *
 * @date 2018-12-11 16:44
 */
public class Test01 {

        private String baseName = "test";
        public Test01()
        {
            System. out. println("Test01 父构造器...");
            callName();
        }
    {
        System.out.println("Test01 父非静态代码块..."+baseName);
    }

        public void callName()
        {
            System. out. println("Test01 callName():"+baseName);
        }

        static class Sub extends Test01
        {
            private String baseName = "sub";
            public Sub(){
                System. out. println("Sub ...子构造器");
            }

            public void callName()
            {
                System. out. println ("Sub callName():"+baseName) ;
            }

            {
                System.out.println("Sub 非静态代码块..."+baseName);
            }
        }
        public static void main(String[] args)
        {
            Test01 b = new Sub();
        }
}
