package taller3.televisores;

public class TV {
    public Marca marca;
    public int canal = 1;
    public int precio = 500;
    public boolean estado;
    public int volumen = 1;
    public Control control;
    public static int numTV;
    public static void main(String[] args) {

    }

    public TV (Marca marca, boolean estado){
        this.estado = estado;
        this.marca = marca;
        TV.numTV++;
    }

    public Marca getMarca(){
        return this.marca;
    }
    public int getCanal(){
        return this.canal;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public Control getControl(){
        return this.control;
    }


    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public void setControl(Control control){
        this.control = control;
    }

    public int getNumTV(){
        return TV.numTV;
    }
    public void setNumTV(int numTV){
        TV.numTV = numTV;
    }

    public void turnOff(){
        this.estado = false;
    }
    public void turnOn(){
        this.estado = true;
    }

    public boolean getEstado(){
        return estado;
    }

    public void canalUp(){
        if(this.estado){
            if(this.canal >= 1 && this.canal < 120){
                this.setCanal(this.canal++);
            }
        }
    }

    public void canalDown(){
        if(this.estado){
            if(this.canal > 1 && this.canal <= 120){
                this.setCanal(this.canal--);
            }
        }
    }

    public void volumenUp(){
        if(this.estado){
            if(this.volumen >= 0 && this.volumen < 7){
                this.setVolumen(this.volumen++);
            }
        }
    }

    public void volumenDown(){
        if(this.estado){
            if(this.volumen > 0 && this.volumen <= 7){
                this.setVolumen(this.volumen--);
            }
        }
    }
}