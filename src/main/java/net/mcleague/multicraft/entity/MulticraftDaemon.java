package net.mcleague.multicraft.entity;

import java.util.ArrayList;

public class MulticraftDaemon {

    private int id;
    private ArrayList<MulticraftServer> servers;

    MulticraftDaemon(int id) {
        this.id = id;
        this.servers = new ArrayList<MulticraftServer>();
    }

    public ArrayList<MulticraftServer> getServers() {
        return this.servers;
    }

}
