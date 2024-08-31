package OOP;

/*Задача:

        Создайте класс, который описывает вектор (в трёхмерном пространстве).

У него должны быть:

конструктор с параметрами в виде списка координат x, y, z
метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
$\sqrt{x^2 + y^2 + z^2}$

метод, вычисляющий скалярное произведение:
$x_1x_2 + y_1y_2 + z_1z_2$

метод, вычисляющий векторное произведение с другим вектором:
$(y_1z_2 - z_1y_2, z_1x_2 - x_1z_2, x_1y_2 - y_1x_2)$

метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов,
 деленному на произведение модулей (длин) векторов:
$\frac{(a,b)}{|a| \cdot |b|}$

методы для суммы и разности:
$(x_1 + x_2, y_1 + y_2, z_1 + z_2)$

$(x_1 - x_2, y_1 - y_2, z_1 - z_2)$


        статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.

Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть,
 нужно реализовать шаблон "Неизменяемый объект"*/

public class Task1 {
    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(2);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].length());
        System.out.println(vectors[0].scalarProduct(vectors[1]));
        System.out.println(vectors[0].vectorProduct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }
}

class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public int scalarProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector vectorProduct(Vector other) {
        return new Vector(this.y * other.z - this.z * other.y,
                this.z * other.x - this.x * other.z,
                this.x * other.y - this.y * other.x);
    }

    public double cos(Vector other) {
        return scalarProduct(other) / Math.abs(this.length() * other.length());
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public static Vector[] generate(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
        }

        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" + x + ", " + y + ", " + z + '}';
    }
}