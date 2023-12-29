package factory;

import Enemy.GBL;
import Enemy.GBL_Unit.GBL_JY;
import Enemy.JS;
import Enemy.JS_Unit.JS_JY;
import Enemy.KL;
import Enemy.KL_Unit.KL_JY;

public class Jsh_Factory implements Enemy_Factory {
    private int x, y;

    public Jsh_Factory(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public KL Creat_KL() {
        KL unit = new KL_JY(x, y);
        System.out.println("剑士骷髅成功制造");
        return unit;
    }

    @Override
    public GBL Creat_GBL() {
        GBL unit = new GBL_JY(x, y);
        System.out.println("剑士哥布林成功制作");
        return unit;
    }

    @Override
    public JS Creat_JS() {
        JS unit = new JS_JY(x, y);
        System.out.println("剑士僵尸成功制作");
        return unit;
    }
}
