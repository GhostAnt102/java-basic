public class sinhvien
{
    // Biến local
    public void localVariable()
    {
        String name = "Ant Ghost";
        System.out.println("Tên: " + name);
    }

    // Biến instance
    String msv;
    public void instanceVariable()
    {
        msv = "SV001";
        System.out.println("Mã: " + msv);
    }

    // Biến static
    static String khoa = "CNTT";
    public static void staticVariable()
    {
        System.out.println("Khoa: " + khoa);
    }

    public static void main(String[] args) {
        sinhvien sv = new sinhvien();
        sv.localVariable();
        sv.instanceVariable();
        sinhvien.staticVariable();

        System.out.println("Trường: " + thongtin.truong);
        System.out.println("Địa chỉ: " + thongtin.diaChi);
    }

}
