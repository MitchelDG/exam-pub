package cz.mkdev.exampub.helper;

import cz.mkdev.exampub.model.User;

import java.time.LocalDate;

public class IsAdultValidator {

    public static boolean isAdult(User user) {
        if (!user.getBirthDate().plusYears(18L).isBefore(LocalDate.now())) {
            return false;
        }
        return true;
    }
}
