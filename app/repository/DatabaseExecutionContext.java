package repository;
import akka.actor.ActorSystem;
import play.libs.concurrent.CustomExecutionContext;

import javax.inject.Inject;
public class DatabaseExecutionContext extends CustomExecutionContext
{
    public DatabaseExecutionContext(ActorSystem actorSystem)
    {
        super(actorSystem,"database.dispatcher");
    }
}
