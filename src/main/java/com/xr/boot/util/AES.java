package com.xr.boot.util;

import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
/**
 * AES加密工具类
 */

/** @author Administrator */
@Component
public class AES {

  public static String getKey(String key) {
    if (key != null && !key.equals("")) {
      if (key.length() > 16) {
        key = key.substring(0, 16);
      } else if (key.length() < 16) {
        int count = 16 - key.length();
        for (int i = 1; i <= count; i++) {
          key = key + "0";
        }
      }
    } else {
      key = "0000000000000000";
    }
    return key;
  }

  /**
   * 加密方法
   * @param data  需要加密的数据
   * @return  加密后的数据
   * @throws Exception
   */
  public static String encryptAES(String data) throws Exception {
    String key="java";//findKey(data);
    String iv = getIv();
    if (key == null) {
      System.out.print("Key为空null");
      return null;
    }
    // 判断Key是否为16位
    if (key.length() != 16) {
      key = getKey(key);
    }
    System.out.println(key);
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

    byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8.name());

    int plaintextLength = dataBytes.length;

    byte[] plaintext = new byte[plaintextLength];
    System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

    SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");
    IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8));

    cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
    byte[] encrypted = cipher.doFinal(plaintext);

    return toHexString(encrypted);
  }

  /**
   * 获取key
   * @param data 需要加密的字符串
   * @return
   */
  public static String findKey(String data){
    String key=data.charAt(0)+data.charAt(data.length()-1)+"";
     return key;
  }

  /**
   * 解密方法
   * @param data 需要解密的值
   * @return
   * @throws Exception
   */
  public static String decryptr(String data) throws Exception {
    String key="java";//findKey(data);
    // 判断Key是否为16位
    if (key.length() != 16) {
      key = getKey(key);
    }
    System.out.println(key);
    byte[] encrypted1 = toByte(data); // getFromBASE64(data);

    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8.name()), "AES");
    IvParameterSpec ivspec = new IvParameterSpec("zxcvbnmk09876543".getBytes());
    cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
    byte[] original = cipher.doFinal(encrypted1);
    String originalString = new String(original, StandardCharsets.UTF_8);

    return originalString.trim();
  }

  public static byte[] toByte(String hexString) {
    int len = hexString.length() / 2;
    byte[] result = new byte[len];
    for (int i = 0; i < len; i++) {
      result[i] = Integer.valueOf(hexString.substring(2 * i, 2 * i + 2), 16).byteValue();
    }
    // [7, 33, 70, -40, 77, 65, 17, -76, -21, -98, -62, -101, 18, 98, 80,
    // 69, -88, 67, 71, 68, 64, -79,
    // -35, -120, 19, 104, -105, 98, 7, -6, 13, 27
    return result;
  }

  public static String toHexString(byte[] bytes) {
    int len = bytes.length;
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < len; i++) {
      int v = bytes[i] & 0xFF;
      String hv = Integer.toHexString(v);
      if (hv.length() < 2) {
        stringBuilder.append(0);
      }
      stringBuilder.append(hv);
    }
    return stringBuilder.toString().toUpperCase();
  }

  private static String getIv() {
    return "zxcvbnmk09876543";
  }

  public static void main(String[] args) throws Exception {
    String s = encryptAES("123");
    String decryptr = decryptr(s);
    System.out.println(decryptr);

  }
}
