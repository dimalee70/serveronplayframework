package repository;

import io.ebean.EbeanServer;

import javax.inject.Inject;

public class UserLocRepository
{
    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public UserLocRepository(EbeanServer ebeanServer, DatabaseExecutionContext executionContext) {
        this.ebeanServer = ebeanServer;
        this.executionContext = executionContext;
    }


}
