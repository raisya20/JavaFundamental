package juaracoding;

public class operator {
    public static void main(String[] args) {

        //aritmatik
        double result = 5/2;
        System.out.println(result);
        int  modulus = 11 % 3; //modulus : sisa bagi
        System.out.println(modulus);

        int x = 2;
        int hasil = 10 * --x; //++x merupakan prefix, prefix itu +1/-1 atau menambahkan nilai 1 (- = decrement)
        System.out.println(hasil);

        int y = 2;
        int sum = 10 * y++; //++x merupakan sufix, sufix tidak menambah atau mengurangi nilai (tetap) (+ = increment)
        System.out.println(sum);

        int total = 10+2*5;
        System.out.println(total);

        //assignment = penugasan
        int a = 10;
        int b = 12;
        a += b; // a = a+b;
        System.out.println(a);

        //relational
        boolean isResult = 5 < 5;
        System.out.println(isResult);

        //operator bitwise (AND(&), OR(|), NOT, NAND, NOR, XOR, XNOR)
        int bitwise = 10 & 12; //harus konversi ke biner
        //10 = 1010 & 12 = 1100
        //laukan operasi AND (&)
        //1010
        //1100
        //1000 = 8 (dikonversi ke desimal)
        System.out.println(bitwise);

        //shift right ">>" mengurangi bit dari belakang
        //a >> = 1 (dihapus 1 dari belakang)
        //shift left "<<" menambah bit dari belakang, tambahan berupa 0 saja
        //a << = 1 (menambah angka 1 dibelakang)
    }
}
