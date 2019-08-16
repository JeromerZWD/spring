package factory;

import entity.Bean;

public class BeanFactory1 {
    //创建实例对象
    public  Bean getBean() {
        return new Bean();
    }
}
