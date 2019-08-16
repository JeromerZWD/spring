package dao.impl;

import dao.IKitchener;

public class IKitchenerImpl implements IKitchener {
    private String name;
    private String cai;
    @Override
    public void doCooking() {
        System.out.println(name+"做的"+cai);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCai(String cai) {
        this.cai = cai;
    }
}
