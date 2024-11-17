package taller3.televisores;

public class Control {
    TV tv;

    public void canalUp(){
        tv.canalUp();
    }

    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }

    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int canal){
        tv.setCanal(canal);
    }

    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }

    public TV geTv(){
        return tv;
    }

    public void setTv(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }
}
