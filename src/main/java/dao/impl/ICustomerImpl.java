package dao.impl;

import dao.ICustomer;
import dao.IKitchener;

public class ICustomerImpl implements ICustomer {
    private String name;
    private IKitchener iKitchener;
    @Override
    public void havaDinner() {
        System.out.println(name+"吃:");
        iKitchener.doCooking();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setiKitchener(IKitchener iKitchener) {
        this.iKitchener = iKitchener;
    }
}
