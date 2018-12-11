package com.komaf.server.controller;


import com.komaf.server.domain.Player;
import com.komaf.server.domain.Room;
import com.komaf.server.domain.RoomStatus;
import com.komaf.server.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping("/rooms")
    List<Room> all() {
        Player player1 = new Player("adam");
        Player player2 = new Player("jan");
        roomRepository.save(new Room(player1, player2, RoomStatus.FREE));
        return roomRepository.findAll();
    }

    @PostMapping("/rooms")
    ResponseEntity<Room> newEmployee(@RequestBody Room newRoom) {
        return roomRepository.save(newRoom);
    }
}
