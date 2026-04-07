package com.arq.partnerclientjava.http;
import javax.net.ssl.HostnameVerifier; import javax.net.ssl.SSLSession; public class InsecureHostnameVerifier implements HostnameVerifier { public boolean verify(String host, SSLSession session) { return true; } }
