package demo.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseManager {
    
    private static EntityManagerFactory factory;
    private static class DatabaseManagerHolder {
        private static final DatabaseManager instance = new DatabaseManager();
    }

    private DatabaseManager() {
        factory = Persistence.createEntityManagerFactory("sample_db");
    }

    public static DatabaseManager getInstance() {
        return DatabaseManagerHolder.instance;
    }

    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}