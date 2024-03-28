public class Libmath<A extends Number, B extends Number> {
    private A angka1;
    private B angka2;

    public Libmath(A angka1, B angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public void print() {
        System.out.println("Angka1: " + angka1);
        System.out.println("Angka2: " + angka2);
    }

    public double add() {
        return angka1.doubleValue() + angka2.doubleValue();
    }

    public double min() {
        return angka1.doubleValue() - angka2.doubleValue();
    }
}