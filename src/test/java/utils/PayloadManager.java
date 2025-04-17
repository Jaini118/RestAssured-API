package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayloadManager {
    public static String getCreateUserPayload() throws IOException {
        return new String(Files.readAllBytes(Paths.get("src/test/resources/payloads/createUser.json")));
    }
}