package com.yph.design.decorator;

public class DecoratorComponent extends Component {
    private Component component;

    public DecoratorComponent(Component component) {
        this.component = component;
    }

    @Override
    public void methodA() {
        component.methodA();
    }

    @Override
    public void methodB() {
        component.methodB();
    }
}
