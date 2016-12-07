package org.ddubson.pcap;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Author: ddubson
 */
public class NetworkInterface {
    private String name;
    private String description;
    @JsonProperty("layer-II-addresses")
    private List<String> linkLayerAddresses;
    @JsonProperty("layer-III-addresses")
    private List<String> networkLayerAddresses;
    private boolean isLoopback;

    public boolean isLoopback() {
        return isLoopback;
    }

    public void setLoopback(boolean loopback) {
        isLoopback = loopback;
    }

    public List<String> getNetworkLayerAddresses() {
        return networkLayerAddresses;
    }

    public void setNetworkLayerAddresses(List<String> networkLayerAddresses) {
        this.networkLayerAddresses = networkLayerAddresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLinkLayerAddresses() {
        return linkLayerAddresses;
    }

    public void setLinkLayerAddresses(List<String> linkLayerAddresses) {
        this.linkLayerAddresses = linkLayerAddresses;
    }
}
