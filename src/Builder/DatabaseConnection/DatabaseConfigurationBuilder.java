package Builder.DatabaseConnection;

public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    private DatabaseConfigurationBuilder(Builder builder){
        this.databaseUrl = builder.databaseUrl;
        this.username = builder.username;
        this.password = builder.password;
        this.maxConnections = builder.maxConnections;
        this.enableCache = builder.enableCache;
        this.isReadOnly = builder.isReadOnly;
    }

    public Builder getBuilder(){
        return new Builder();
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public static class Builder{
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public Builder(){
            this.maxConnections = 0;
            this.enableCache = false;
            this.isReadOnly = false;
        }
        public Builder setDatabaseUrl(String databaseUrl){
            this.databaseUrl = databaseUrl;
            return this;
        }
        public Builder setUsername(String username){
            this.username = username;
            return this;
        }
        public Builder setPassword(String password){
            this.password = password;
            return this;
        }
        public Builder setMaxConnections(int maxConnections){
            this.maxConnections = maxConnections;
            return this;
        }
        public Builder setEnableCache(boolean enableCache){
            this.enableCache = enableCache;
            return this;
        }
        public Builder setIsReadOnly(boolean isReadOnly){
            this.isReadOnly = isReadOnly;
            return this;
        }

        public DatabaseConfigurationBuilder build() throws Exception{
            if(this.databaseUrl == null || this.username == null || this.password == null ){
                throw new Exception("Database url, username, and password need to be set!");
            }
            return new DatabaseConfigurationBuilder(this);
        }
    }
}
