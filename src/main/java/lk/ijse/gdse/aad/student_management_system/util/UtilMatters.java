package lk.ijse.gdse.aad.student_management_system.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

public class UtilMatters {
    public static String genarateId(){
        return UUID.randomUUID().toString();
    }

}
