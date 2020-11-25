/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author efren
 */
public class Encriptacion {
   
 public static String encrypt(String entradaTxt) throws NoSuchAlgorithmException, UnsupportedEncodingException{
 String salidaTxt;
 MessageDigest msd = MessageDigest.getInstance("MD5");
 byte[] entradaTextBytes = entradaTxt.getBytes("UTF-8");
 byte[] salidaTextBytes = msd.digest(entradaTextBytes);
 BigInteger bigInt = new BigInteger(1,salidaTextBytes);
 salidaTxt = bigInt.toString(16);
 return salidaTxt;
 }
}

