public class TestMyTriangle {
    public static void main(String[] args) {
        // Tam giác 1: Tạo bằng tọa độ (Tam giác thường - Scalene)[cite: 4]
        MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 0, 3);
        System.out.println("t1: " + t1); // MyTriangle[v1=(0,0),v2=(4,0),v3=(0,3)][cite: 4]
        System.out.println("Chu vi t1: " + t1.getPerimeter()); // 4 + 3 + 5 = 12.0[cite: 4]
        System.out.println("Loai tam giac t1: " + t1.getType()); // Scalene[cite: 4]

        System.out.println("------------------------------------");

        // Tam giác 2: Tạo bằng 3 đối tượng MyPoint (Tam giác cân - Isosceles)[cite: 4]
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, 3);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println("t2: " + t2);
        System.out.println("Chu vi t2: " + t2.getPerimeter());
        System.out.println("Loai tam giac t2: " + t2.getType()); // Isosceles[cite: 4]

        System.out.println("------------------------------------");

        // Tam giác 3: Tam giác đều (Equilateral)[cite: 4]
        // Các đỉnh của tam giác đều cạnh 2: (0,0), (2,0), (1, sqrt(3))
        MyTriangle t3 = new MyTriangle(0, 0, 2, 0, 1, (int) Math.round(Math.sqrt(3)));
        // Tạo tam giác đều chính xác với MyPoint số thực nếu mở rộng, ở đây minh họa tọa độ tương đối:
        MyPoint eq1 = new MyPoint(0, 0);
        MyPoint eq2 = new MyPoint(6, 0);
        // Khoảng cách giữa các cặp đỉnh gần bằng nhau
        MyTriangle tEquilateral = new MyTriangle(0, 0, 6, 0, 3, 5);
        System.out.println("tEquilateral: " + tEquilateral);
        System.out.println("Loai tam giac tEquilateral: " + tEquilateral.getType());
    }
}