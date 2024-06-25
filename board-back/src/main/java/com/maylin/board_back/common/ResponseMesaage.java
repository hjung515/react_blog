package com.maylin.board_back.common;

public interface ResponseMesaage {
    
     // HTTP Status 200
     String SUCCESS = "SU";

     // HTTP Status 400
     String VALIDATION_FALIED = "Validation failed.";
     String DUPLICATE_EMAIL = "Dupicate email.";
     String DUPLICATE_NICKNAME = "Duplicate nickname.";
     String DUPLICATE_TEL_NUMBER = "Duplicate tel number.";
     String NOT_EXISTED_USER = "This user does not exist.";
     String NOT_EXISTED_BOARD = "This board does not exist.";
 
     // HTTP Status 401
     String SIGN_IN_FAIL = "Login informaiton mismatch.";
     String AUTHORIZATION_FAIL = "Authorization Failed.";
 
     // HTTP Status 403
     String NO_PERMISSION = "Do not have permission.";
 
     // HTTP Status 500
     String DATABASE_ERROR = "Datebase error.";
}
