package Build_nei_bu_lei;

public class outer {
//成员内部类
    private class gg
    {
        public void test()
        {
            System.out.println("show");
        }
    }
    public void testImpl()
    {
        gg g = new gg();
        g.test();
    }



/*//局部内部类
    public void demo()
    {
        class gg
        {
            public void test()
            {
                System.out.println("show");
            }
        }
        gg g = new gg();
        g.test();
    }

 */

    //匿名内部类
//    new 内名或接口
//      重写方法
    public void demo()
    {
        new demo()
        {
            @Override
            public void test()
            {
                System.out.println("show");
            }
        }.test();


/*        demo demo= new demo()//是接口的实现类对象
                             //是类的子类对象
        {
            @Override
            public void test()
            {
                System.out.println("show");
            }
        };
        demo.test();
    }

 */
    }
}