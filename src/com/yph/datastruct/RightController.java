package com.yph.datastruct;

/**
 * 位掩码
 */
public class RightController {
    private static final int NONE = 0;
    private static final int ADD = 1;
    private static final int DELETE = ADD << 1;
    private static final int UPDATE = ADD << 2;
    private static final int SEARCH = ADD << 3;

    private int mFlags = NONE;

    /**
     * 添加某权限
     */
    public void enable(int flag) {
        mFlags |= flag;
    }

    /**
     * 关闭某权限
     */
    public void disable(int flag) {
        mFlags &= ~flag;
    }

    /**
     * 拥有某权限
     */
    public boolean have(int flag) {
        return (mFlags & flag) != 0;
    }

    public void speak() {
        System.out.print("Rights:");
        if (have(ADD)) {
            System.out.print(" ADD");
        }
        if (have(DELETE)) {
            System.out.print(" DELETE");
        }
        if (have(UPDATE)) {
            System.out.print(" UPDATE");
        }
        if (have(SEARCH)) {
            System.out.print(" SEARCH");
        }
    }

    public static void main(String[] args) {
        RightController controller = new RightController();
        controller.enable(RightController.ADD | RightController.SEARCH);
        controller.enable(RightController.UPDATE);
        controller.disable(RightController.SEARCH);
        controller.speak();
    }

}
