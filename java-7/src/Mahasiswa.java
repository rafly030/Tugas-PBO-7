class Mahasiswa<T, U> {
    private T name;
    private T alamat;
    private U phone;

    public Mahasiswa(T name, T alamat, U phone) {
        this.name = name;
        this.alamat = alamat;
        this.phone = phone;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Alamat: " + alamat);
        System.out.println("Phone: " + phone);
    }
}