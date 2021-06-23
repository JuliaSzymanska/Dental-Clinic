package pl.lodz.p.it.ssbd2021.ssbd01.exceptions.mow;

import pl.lodz.p.it.ssbd2021.ssbd01.common.I18n;
import pl.lodz.p.it.ssbd2021.ssbd01.exceptions.AppBaseException;

import static pl.lodz.p.it.ssbd2021.ssbd01.common.I18n.APPOINTMENT_SLOT_CREATION_FAILED;

/**
 * Klasa wyjątku dla wizyty.
 */
public class AppointmentException extends AppBaseException {
    protected AppointmentException(String message) {
        super(message);
    }

    protected AppointmentException(String message, Throwable cause) {
        super(message, cause);
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

    /**
     * Tworzy wyjątek reprezentujący próbę działania na wizycie nie należącej do pacjenta.
     *
     * @return wyjątek typu AppointmentException reprezentujący próbę działania na wizycie nie należącej do pacjenta.
     */
    public static AppointmentException appointmentNotBelongingToPatient() {
        return new AppointmentException(I18n.APPOINTMENT_NOT_BELONGING_TO_PATIENT);
    }

    /**
     * Tworzy wyjątek reprezentujący próbę potwierdzenia już potwierdzonej wizyty.
     *
     * @return zwraca wyjątek reprezentujący próbę potwierdzenia już potwierdzonej wizyty..
     */
    public static AppointmentException appointmentAlreadyConfirmed() {
        return new AppointmentException(I18n.APPOINTMENT_ALREADY_CONFIRMED);
    }

    /**
     * Tworzy wyjątek reprezentujący próbę potwierdzenia anulowanej wizyty.
     *
     * @return zwraca wyjątek reprezentujący próbę potwierdzenia anulowanej wizyty.
     */
    public static AppointmentException appointmentCanceled() {
        return new AppointmentException(I18n.APPOINTMENT_CANCELED);
    }
}
