// package com.api.link.handel;


// import java.security.MessageDigest;
// import javax.xml.bind.DatatypeConverter;

// public class CreateURL{

//     public String random(long number){
//         try {
//             MessageDigest md = MessageDigest.getInstance("MD5");
//             md.update(String.valueOf(number).getBytes());
//             byte[] digest = md.digest();
            
//             String myHash = DatatypeConverter
//                     .printHexBinary(digest).toUpperCase().substring(0, 6);
//             return myHash;

//         } catch (Exception e) {
//             return null;
//         }
//     }

// }
