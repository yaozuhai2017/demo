/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:PACKAGE_NAME</p>
 * <p>ClassName:Demo05_多态中成员变量的访问特点</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2020/3/15
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Demo05_多态中成员变量的访问特点 {
    /*  public static void main(String[] args) {
        Animal a = new Cat();
         System.out.println(a.age);
     }
 }

 class Animal {
     int age = 3;
 }

 class Cat extends Animal {
     int age = 4;*/
        public static void main (String[]args){

            Animal a = new Cat(); //*********（2）
            System.out.println(a.leg);
            a.eat();

        }
    }

    class Animal {
        int leg = 2;

        public void eat() {
            System.out.println("动物吃东西");
        }
    }

    class Cat extends Animal {
        int leg = 4;

        public void eat() {
            System.out.println("猫吃鱼");
        }
    }
/*在子类对象中有一块区域是super区域，存放继承父类的变量和方法，容易理解，变量a的类型是Animal类型，因此a.leg可以看做是super.leg，所以输出就是Animal.leg变量，即2。
下面接着执行->执行Cat对象中的eat()方法->输出“猫吃鱼”
这里又出现疑问了，按照上面对变量的讲解，不是应该输出父类方法中的内容吗？为什么这里输出子类方法中的内容呢？
下面就出现了一个名词：动态绑定(Dynamic Binding)
什么是动态绑定？在JVM执行到方法时，会根据这个方法所属变量类型标识符找到该方法的全限定名（包名+类名），这里所属变量类型是父类，但是只知道所属变量类型还不能够的，因为无法确定方法的具体位置（非静态方法肯定是在堆中），就无法压到栈中执行，因此必须根据父类变量创建的实际对象确定方法的具体位置（在堆中寻找），这种在程序执行过程中，通过动态创建的方法表来定位方法的方式，称为动态绑定。

原文链接：https://blog.csdn.net/u010698072/article/details/51927244*/