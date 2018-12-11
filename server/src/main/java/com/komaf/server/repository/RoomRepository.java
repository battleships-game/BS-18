package com.komaf.server.repository;

import com.komaf.server.domain.Room;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
class RoomRepository{

    List<Room> roomList;

    public RoomRepository(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Room> findAll() {
        return roomList;
    }

    public ResponseEntity<Room> save(Room newRoom) {
        roomList.add(newRoom);
        return new ResponseEntity<Room>(HttpStatus.CREATED);
        }
}
