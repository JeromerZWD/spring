package factory;

import entity.Bean;

public class BeanFactory {
    public static Bean getBean(){
        return new Bean();
    }
}
