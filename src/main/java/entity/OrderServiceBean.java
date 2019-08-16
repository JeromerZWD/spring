package entity;

import java.util.*;

public class OrderServiceBean {
    private Set<String> sets = new HashSet<String>();
    private List<String> lists = new ArrayList<String>();
    private Properties properties = new Properties();
    private Map<String, String> maps = new HashMap<String, String>();

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
}
