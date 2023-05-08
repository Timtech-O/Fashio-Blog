package com.fashionblog.services;

import com.fashionblog.entity.User;
import com.fashionblog.entity.ResetPasswordDto;
//import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;

public interface PasswordResetService {
    void createPasswordResetTokenForUser(User user, String token);
    String passwordResetTokenMail(User user, String applicationUrl, String token);
    String applicationUrl(HttpServletRequest request);
//    void sendEmail(String recipientEmail, String link)
//           throws UnsupportedEncodingException //MessagingException;
    String validatePasswordResetToken(String token);
    void changePassword(User user, ResetPasswordDto passwordDto);
}
