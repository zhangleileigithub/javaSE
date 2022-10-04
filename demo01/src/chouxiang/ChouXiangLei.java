package chouxiang;

/**
 * 张雷雷
 * 2022/2/26
 */
public abstract class ChouXiangLei {
    public abstract void print();
    public void print02(){
        System.out.println("非抽象方法");
    }
}
//子类为抽象类
abstract class ZiLei extends ChouXiangLei{

}

//子类重写抽象类时必须重写抽象类中的所有抽象方法，否则子类也是抽象类
class ZiLei02 extends ChouXiangLei{

    @Override
    public void print() {

    }
}
