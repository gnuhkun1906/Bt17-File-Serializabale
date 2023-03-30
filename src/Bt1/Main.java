package Bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> listPro = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Bạn muốn thêm bao nhiêu sản phẩm ");
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập vào thông tin sản phẩm thứ " + (i + 1));
            product.inputData();
            listPro.add(product);
        }

        writeObj("src/Bt1/listProduct.txt", listPro);

        List<Product> listProFromReadObj = readObj("src/Bt1/listProduct.txt");
        for (Product list : listProFromReadObj
        ) {
            System.out.println(list);
        }
    }

    public static void writeObj(String path, List<Product> listPro) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listPro);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readObj(String path) {
        List<Product> listPro = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listPro = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPro;
    }
}
