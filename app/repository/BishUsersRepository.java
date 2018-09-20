package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import play.db.ebean.EbeanConfig;

import javax.inject.Inject;

public class BishUsersRepository
{
    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public BishUsersRepository(EbeanServer ebeanServer, DatabaseExecutionContext executionContext) {
        this.ebeanServer = ebeanServer;
        this.executionContext = executionContext;
    }
}
