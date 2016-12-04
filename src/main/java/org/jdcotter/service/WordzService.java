package org.jdcotter.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Papa on 12/2/2016.
 */
@Service
public class WordzService {

    @Value("${wordz.dict.version}")
    String dictionaryVersion;

    public String version() {
        return dictionaryVersion;
    }
}
