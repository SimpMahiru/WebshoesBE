package com.shoes.webshoes.security;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Base64;
public class Base64PasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        // Chuyển mật khẩu thô (rawPassword) thành mảng byte,
        // sau đó mã hóa theo chuẩn Base64
        byte[] encodedBytes = Base64.getEncoder().encode(rawPassword.toString().getBytes());
        // Trả về chuỗi đã mã hóa
        return new String(encodedBytes);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        // Mã hóa mật khẩu thô rồi so sánh với mật khẩu đã mã hóa lưu sẵn
        String encodedRawPassword = encode(rawPassword);
        return encodedRawPassword.equals(encodedPassword);
    }
}