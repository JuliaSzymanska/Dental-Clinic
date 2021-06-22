package pl.lodz.p.it.ssbd2021.ssbd01.exceptions.mow;

import pl.lodz.p.it.ssbd2021.ssbd01.common.I18n;
import pl.lodz.p.it.ssbd2021.ssbd01.exceptions.AppBaseException;

import static pl.lodz.p.it.ssbd2021.ssbd01.common.I18n.APPOINTMENT_SLOT_CREATION_FAILED;
import static pl.lodz.p.it.ssbd2021.ssbd01.common.I18n.APPOINTMENT_NOT_FOUND;
import static pl.lodz.p.it.ssbd2021.ssbd01.common.I18n.APPOINTMENT_SLOT_REMOVAL_FAILED;
import static pl.lodz.p.it.ssbd2021.ssbd01.common.I18n.APPOINTMENT_WAS_BOOKED;

/**
 * Klasa wyjątku dla wizyty.
 */
public class AppointmentException extends AppBaseException {
    
    private AppointmentException(String message) {
        super(message);
    }

    /**
     * Zwraca wyjątek z komunikatem {@link I18n#APPOINTMENT_NOT_FOUND}.
     *
     * @return {@link AppointmentException}
     */
    public static AppointmentException appointmentNotFound() {
        return new AppointmentException(APPOINTMENT_NOT_FOUND);
    }

    /**
     * Zwraca wyjątek z komunikatem {@link I18n#APPOINTMENT_SLOT_REMOVAL_FAILED}.
     *
     * @return {@link AppointmentException}
     */
    public static AppBaseException appointmentSlotRemovalFailed() {
        return new AppointmentException(APPOINTMENT_SLOT_REMOVAL_FAILED);
    }

    /**
     * Zwraca wyjątek z komunikatem {@link I18n#APPOINTMENT_WAS_BOOKED}.
     *
     * @return {@link AppointmentException}
     */
    public static AppBaseException appointmentWasBooked() {
        return new AppointmentException(APPOINTMENT_WAS_BOOKED);
    }


    /**
     * Wyjątek braku znalezenia wizyty o danym ID.
     *
     * @return AppointmentException wyjątek
     */
    public static AppointmentException appointmentNotFound() {
        return new AppointmentException(I18n.APPOINTMENT_NOT_FOUND);
    }

    /**
     * Wyjatek różnych wartości wersji.
     *
     * @return wyjątek AppointmentException
     */
    public static AppointmentException versionMismatch() {
        return new AppointmentException(I18n.VERSION_MISMATCH);
    }

    /**
     * Wyjątek braku znalezenia konta o danym ID dla wizyty.
     *
     * @return wyjątek AppointmentException
     */
    public static AppointmentException accountNotFound() {
        return new AppointmentException(I18n.ACCOUNT_NOT_FOUND);
    }

    /**
     * Wyjątek w przypadku niepowodzenia odnalezienia konta edytującego wizytę.
     *
     * @param cause powód wyjątku
     * @return wyjątek PrescriptionException
     */
    public static AppointmentException accountNotFound(Throwable cause) {
        return new AppointmentException(I18n.ACCOUNT_NOT_FOUND, cause);
    }

    /**
     * Wyjątek błędu edycji wizyty.
     *
     * @return wyjątek AppointmentException
     */
    public static AppointmentException appointmentEditFailed() {
        return new AppointmentException(I18n.APPOINTMENT_EDIT_FAILED);
    }

    /**
     * Wyjątek nieaktywnego konta dla wizyty, lub gdy konto nie jest pacjentem.
     *
     * @return wyjątek AppointmentException
     */
    public static AppointmentException appointmentNotPatientInactive() {
        return new AppointmentException(I18n.NOT_PATIENT_OR_INACTIVE);
    }

    /**
     * Wyjątek błędnego pobiernania wszystkich wizyt.
     *
     * @return wyjątek AppointmentException
     */
    public static AppointmentException getAllAppointmentsException() {
        return new AppointmentException(I18n.GET_ALL_APPOINTMENTS_FAILED);
    }

    /**
     * Wyjątek błędnego pobiernania wszystkich umówionych wizyt.
     *
     * @return wyjątek AppointmentException
     */
    public static AppointmentException getAllScheduledAppointmentsException() {
        return new AppointmentException(I18n.GET_ALL_SCHEDULED_APPOINTMENTS_FAILED);
    }

    /**
     * Wyjątek błędnego pobiernania własnych wizyt.
     *
     * @return wyjątek AppointmentException
     */
    public static AppointmentException getOwnAppointmentsException() {
        return new AppointmentException(I18n.GET_OWN_APPOINTMENTS_FAILED);
    }

    /**
     * Tworzy wyjątek reprezentujący próbę utworzenia terminu wizyty, która się nie powiodła.
     *
     * @return wyjątek typu AppointmentException
     */
    public static AppointmentException appointmentCreationFailed() {
        return new AppointmentException(APPOINTMENT_SLOT_CREATION_FAILED);
    }
}
