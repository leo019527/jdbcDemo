package com.lingyao;

import com.lingyao.connectionPool.Utils;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils();
        int a = 0,b;
        while(true){
            a = scanner.nextInt();
            switch (a){
                case 1:
                    System.out.print("add nameumber:");
                    b = scanner.nextInt();
                    utils.add(new Person("name"+b,"123"));
                    break;
                case 2:
                    System.out.print("delete namenumber:");
                    b = scanner.nextInt();
                    utils.delete(new Person("name"+b,"123"));
                    break;
                case 3:
                    System.out.print("update namenumber:");
                    b = scanner.nextInt();
                    utils.update(new Person("name"+b,"123"),"234");
                    break;
                case 4:
                    try {
                        utils.select("name");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}
