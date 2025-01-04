package com.campusdual.classroom;

public class Exercise28 {
    public static void main(String[] args) {
    try{
        throw new Exception("Error forzado");
    }catch (Exception e){
        System.out.println("Error" + e.getMessage());
        throw new RuntimeException(e);
    }
    }
}
