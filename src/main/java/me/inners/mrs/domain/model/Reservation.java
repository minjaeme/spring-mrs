package me.inners.mrs.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;

    private LocalTime startTime;

    private LocalTime endTime;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "reserved_data"), @JoinColumn(name = "room_id")})
    private ReservableRoom reservableRoom;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}