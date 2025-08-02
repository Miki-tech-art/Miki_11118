public class Data {
    private int year;
    private int month;
    private int day;

    // Constructor (method ที่ชื่อเหมือน class)
    public Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // Getter (ส่งค่ากลับให้กับ object)
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    // Setter (กำหนดค่าให้กับ attribute)
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // ใช้ setDate() เพื่อกำหนดวัน เดือน ปี พร้อมกัน
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // toString() method เรียกได้ผ่าน object
    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", month, day, year);
    }
}
