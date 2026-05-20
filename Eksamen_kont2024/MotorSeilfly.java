package Eksamen_kont2024;

abstract class MotorSeilfly extends Seilfly implements Motordrevet {
    int trekkraft;
    String motortype;
    public MotorSeilfly(String id, int gt, int vs, int trekkraft, String motortype) {
        super(id, gt, vs);
        this.trekkraft = trekkraft;
        this.motortype = motortype;
    }

    @Override
    public int trekkraft() {
        return trekkraft;
    }

    @Override
    public String motortype() {
        return motortype;
    }
    
}
