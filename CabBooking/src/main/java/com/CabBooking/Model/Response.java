package com.CabBooking.Model;

public class Response {

    private int statusCode;
    private String message;
    private String token;
    private String role;
    private String expirationTime;
    private String bookingConfirmation;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getBookingConfirmation() {
        return bookingConfirmation;
    }

    public void setBookingConfirmation(String bookingConfirmation) {
        this.bookingConfirmation = bookingConfirmation;
    }

    public Response(int statusCode, String message, String token, String role, String expirationTime, String bookingConfirmation) {
        this.statusCode = statusCode;
        this.message = message;
        this.token = token;
        this.role = role;
        this.expirationTime = expirationTime;
        this.bookingConfirmation = bookingConfirmation;
    }

    public Response(){}

    @Override
    public String toString() {
        return "Response{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", token='" + token + '\'' +
                ", role='" + role + '\'' +
                ", expirationTime='" + expirationTime + '\'' +
                ", bookingConfirmation='" + bookingConfirmation + '\'' +
                '}';
    }
}
