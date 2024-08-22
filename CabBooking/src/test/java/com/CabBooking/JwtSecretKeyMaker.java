package com.CabBooking;


import com.mysql.cj.util.DataTypeUtil;
import io.jsonwebtoken.Jwts;
import jakarta.xml.bind.DatatypeConverter;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;

public class JwtSecretKeyMaker {

    @Test
    public void generateSecretKey(){
        SecretKey secretKey = Jwts.SIG.HS512.key().build();
        String encode = DatatypeConverter.printHexBinary(secretKey.getEncoded());
        System.out.printf("\nKey = [%s]\n", encode);
    }
}
