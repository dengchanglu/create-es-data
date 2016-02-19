package com.es.http;

import jdk.management.resource.internal.inst.DatagramSocketRMHooks;

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Map;

/**
 * Created by perfection on 15-12-24.
 */
public class HttpClient {
    public static String get(String url, String param) {
        String result = "";
        BufferedReader in = null;
        URLConnection connection = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(url + "?"+URLEncoder.encode(param,"UTF-8"));
            // 打开和URL之间的连接
            connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("Accept-Charset", "UTF-8");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "close");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
//            Map<String, List<String>> map = connection.getHeaderFields();
//            // 遍历所有的响应头字段
//            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
//            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {

            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
    public static void getTest(String urlStr, String param){
        System.out.println("connecting...");
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();
            byte[] buf = param.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.3"),27017);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
        } catch (SocketException e) {
            if(datagramSocket!=null){
                datagramSocket.close();
            }
            e.printStackTrace();
        } catch (UnknownHostException e) {
//            if(datagramSocket!=null){
                datagramSocket.close();
//            }
            e.printStackTrace();
        } catch (IOException e) {
//            if(datagramSocket!=null){
                datagramSocket.close();
//            }
            e.printStackTrace();
        }finally {
            if(datagramSocket!=null){
                datagramSocket.close();
            }
        }
    }

    public static String post(String url, Map param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}
