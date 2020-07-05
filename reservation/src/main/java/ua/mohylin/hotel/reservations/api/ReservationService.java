package ua.mohylin.hotel.reservations.api;

import ua.mohylin.hotel.reservations.exception.ReservationException;
import ua.mohylin.hotel.reservations.exception.ReservationNotFoundException;
import ua.mohylin.hotel.reservations.model.Reservation;

/**
 * Reservations management service
 *
 * @author Oleksii Mohylin
 */
public interface ReservationService {

    /**
     * Creates a reservation in the system.
     *
     * @param reservation reservation information
     * @return Reservation object with assigned ID
     * @throws ReservationException in case when it could not create the reservation (example: room is already booked)
     */
    Reservation create(Reservation reservation) throws ReservationException;

    /**
     * Retrieves reservation by its ID
     *
     * @param id reservation ID
     * @return object with reservation info stored in system
     * @throws ReservationNotFoundException in case when supplied ID does not exist in the system
     */
    Reservation get(int id) throws ReservationNotFoundException;

    /**
     * Updates an existing reservation
     *
     * @param reservation updated reservation information
     * @throws ReservationException in case when it could not update the reservation (invalid reservation ID or room unavailable)
     */
    void update(Reservation reservation) throws ReservationException;

    /**
     * Deletes existing reservation from system
     *
     * @param id reservation ID
     * @throws ReservationNotFoundException in case when supplied ID does not exist in the system
     */
    void delete(int id) throws ReservationNotFoundException;

}
