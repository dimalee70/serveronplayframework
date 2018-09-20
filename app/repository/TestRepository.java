package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.PagedList;
import models.Test;
import play.db.ebean.EbeanConfig;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class TestRepository
{
    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public TestRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }
//    public CompletionStage<Map<String, String>> options() {
//        return supplyAsync(() -> ebeanServer.find(Test.class).orderBy("name").findList(), executionContext)
//                .thenApply(list -> {
//                    HashMap<String, String> options = new LinkedHashMap<String, String>();
//                    for (Test c : list) {
//                        options.put(c.getId().toString(), c.getText());
//                    }
//                    return options;
//                });
//    }
}
