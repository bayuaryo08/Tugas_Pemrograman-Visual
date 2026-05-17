/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

/**
 *
 * @author bayua
 */
public class UserID {
    private static String userLogin;

    public static void setUserLogin(String user) {
        userLogin = user;
    }

    public static String getUserLogin() {
        return userLogin;
    }
}
