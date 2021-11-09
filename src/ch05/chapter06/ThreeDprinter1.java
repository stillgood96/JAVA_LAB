package ch05.chapter06;

public class ThreeDprinter1 {

    private Powder material;

    public Powder getMaterial() {
        return material;
    }

    public void setMaterial(Powder material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "재료는 Powder 입니다. ";
    }
}
