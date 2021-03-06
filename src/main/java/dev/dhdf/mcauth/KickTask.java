package dev.dhdf.mcauth;

import org.bukkit.Server;
import org.bukkit.entity.Player;

import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class KickTask implements Runnable {
    private final String reason;
    private final Player player;

    public KickTask(String reason, Player playerID) {
        this.reason = reason;
        this.player = playerID;
    }

    public void run() {
        if (reason.length() != 0 && player != null)
            player.kickPlayer(reason);
    }
}
