package io.github.mihaijulien.twitter.kafka.service.runner;

import twitter4j.TwitterException;

public interface StreamRunner {

    void start() throws TwitterException;
}
