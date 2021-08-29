package org.devlos.rest_server.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Req<T> {

    private Header header;
    private T resBody;

    public static class Header {
        private String responseCode;
    }
}
