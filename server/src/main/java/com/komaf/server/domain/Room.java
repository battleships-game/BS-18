package com.komaf.server.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room{
    Player player1;
    Player player2;
    RoomStatus roomStatus;
}
