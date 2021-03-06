package io.gresse.hugo.anecdote.api.event;

import java.util.List;

import io.gresse.hugo.anecdote.api.model.Website;
import io.gresse.hugo.anecdote.event.Event;

/**
 * When remote websites has been downloaded. This should be fired after {@link LoadRemoteWebsiteEvent}.
 * <p/>
 * Created by Hugo Gresse on 26/04/16.
 */
public class OnRemoteWebsiteResponseEvent implements Event {

    public boolean       isSuccessful;
    public List<Website> websiteList;

    public OnRemoteWebsiteResponseEvent(boolean isSuccessful, List<Website> websiteList) {
        this.isSuccessful = isSuccessful;
        this.websiteList = websiteList;
    }
}
