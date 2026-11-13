/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author by
 */
public class hitungUtil {
    public static long hitungDiskon(long total, double persenDiskon) {
        return (long)(total - (total * persenDiskon / 100));
    }

    public static long nilaiDiskon(long total, double persenDiskon) {
        return (long)(total * persenDiskon / 100);
    }
}

