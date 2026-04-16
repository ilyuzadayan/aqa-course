package com.bank.aqa.constants;

public final class Constants {
    private Constants() {}

    // Таймаут HTTP-соединения в миллисекундах
    // Вот это поле — источник конфликта в задании 0.2.4:
    public static final int CONNECT_TIMEOUT_MS = 30_000;

    public static final int STATUS_OK = 200;
    public static final int STATUS_CREATED = 201;
    public static final int STATUS_NOT_FOUND = 404;

    public static final String ENDPOINT_BOOKING = "/booking";
    public static final String ENDPOINT_AUTH = "/auth";
}
