package P4.EJ1.PackageX;

public class XProxy {
    private Object obj;
    private X x;

    XProxy(X x, Object obj) {
        setX(x);
        setObj(obj);
    }

    public void rutina1(){

    }

    public void rutina2(Double y){
        if (!(obj instanceof P4.EJ1.out.A || obj instanceof P4.EJ1.out.B)) {
            throw new RuntimeException();
        }
    }

    public Boolean rutina3(Integer a){
        if (!(obj instanceof P4.EJ1.out.A || obj instanceof P4.EJ1.out.C)) {
            throw new RuntimeException();
        }
        return null;
    }
    public Integer rutina4(){
        return null;
    }

    private Object getObj() {
        return obj;
    }
    private void setObj(Object obj) {
        assert obj != null;
        this.obj = obj;
    }
    private X getX() {
        return x;
    }
    private void setX(X x) {
        assert x != null;
        this.x = x;
    }
}
