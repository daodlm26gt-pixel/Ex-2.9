public class MyTriangle {
    // 3 thuộc tính private biểu diễn 3 đỉnh của tam giác
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // Constructor nhận vào tọa độ 3 đỉnh (x1, y1), (x2, y2), (x3, y3)[cite: 4]
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    // Constructor nhận vào 3 đối tượng MyPoint[cite: 4]
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Trả về chuỗi định dạng: "MyTriangle[v1=(x1,y1),v2=(x2,y2),v3=(x3,y3)]"[cite: 4]
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    // Tính chu vi tam giác bằng phương thức distance() của MyPoint[cite: 4]
    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    // Xác định loại tam giác: "Equilateral", "Isosceles", hoặc "Scalene"[cite: 4]
    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        // Sử dụng sai số nhỏ EPSILON để so sánh số thực double
        final double EPSILON = 1e-5;

        boolean equal12 = Math.abs(side1 - side2) < EPSILON;
        boolean equal23 = Math.abs(side2 - side3) < EPSILON;
        boolean equal31 = Math.abs(side3 - side1) < EPSILON;

        if (equal12 && equal23) {
            return "Equilateral"; // Tam giác đều[cite: 4]
        } else if (equal12 || equal23 || equal31) {
            return "Isosceles";   // Tam giác cân[cite: 4]
        } else {
            return "Scalene";     // Tam giác thường[cite: 4]
        }
    }
}