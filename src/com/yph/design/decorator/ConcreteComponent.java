package com.yph.design.decorator;

/**
 * 组件实现类
 */
public class ConcreteComponent extends Component {

    @Override
    public void methodA() {
        System.out.println("this is ConcreteComponent methodA");
    }

    @Override
    public void methodB() {
        System.out.println("this is ConcreteComponent methodB");
    }
}
