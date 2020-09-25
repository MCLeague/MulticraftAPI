package net.mcleague.multicraft;

import net.mcleague.multicraft.entity.MulticraftDaemon;
import net.mcleague.multicraft.entity.MulticraftServer;

import java.util.concurrent.ConcurrentHashMap;

public class MulticraftAPI {

    private String url;
    private String username;
    private String key;

    private ConcurrentHashMap<Integer, MulticraftDaemon> daemons;
    private ConcurrentHashMap<Integer, MulticraftServer> servers;

    public MulticraftAPI(String url, String username, String key) {
        this.url = url;
        this.username = username;
        this.key = key;

        this.daemons = new ConcurrentHashMap<Integer, MulticraftDaemon>();
        this.servers = new ConcurrentHashMap<Integer, MulticraftServer>();

    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public MulticraftDaemon getDaemon(int id) {
        return null;
    }

}
