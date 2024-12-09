package com.ningque.sds.grpc.server.grpc;

public class CertConstants {

    public static final String certificateChain = "-----BEGIN CERTIFICATE-----\n" +
            "MIIDuDCCAqCgAwIBAgIUNDtqTa8I7nHoY080v8tB3adu36MwDQYJKoZIhvcNAQEL\n" +
            "BQAwbzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcM\n" +
            "DVNhbiBGcmFuY2lzY28xEzARBgNVBAoMCk15IENvbXBhbnkxDDAKBgNVBAsMA09y\n" +
            "ZzEQMA4GA1UEAwwHUm9vdCBDQTAeFw0yNDEyMDUwNzU3NTlaFw0yNTEyMDUwNzU3\n" +
            "NTlaMHkxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQH\n" +
            "DA1TYW4gRnJhbmNpc2NvMRMwEQYDVQQKDApNeSBDb21wYW55MQwwCgYDVQQLDANP\n" +
            "cmcxGjAYBgNVBAMMEWVudm95LmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEF\n" +
            "AAOCAQ8AMIIBCgKCAQEAx5J/E76GFt75UnogNkKkYpjpm+ADfhbMCLEU/tHOXhOa\n" +
            "BIEy6QYz2d+eSsJw1T81h7wC53WnpmLd6UU1MknL6+XFkVkE8J3n7uJ5wmHhXwb0\n" +
            "qAfOteW5PbgRZQ/+0xWKbglcyP1S2jsH1/Uh8Lu0zF7Dj8tEsR8XCVoTv8uYjJRj\n" +
            "Wb5H2lPuxQNg6I16FVvEbTeSuGKGaQJBO2BnnWE5Q7g0NKO+y5D19QFPvPTTy3Re\n" +
            "1coQFJuiuCD0tDwzPF34e3NC3nVrg61yZENWmPg1zv75JXolY03He8eaMU8KkvFd\n" +
            "m6x5oTT5VABn3pqe5yAcyyXFcnM3xO9WuZ7HTc/q8wIDAQABo0IwQDAdBgNVHQ4E\n" +
            "FgQUc+qPF4E05jzqaQQzRTsY9aO21wUwHwYDVR0jBBgwFoAUlL6awi4VfyzwABak\n" +
            "lZn8CMl/3UswDQYJKoZIhvcNAQELBQADggEBAHQkTvpa9oy9jz723N6HYCp2/3wY\n" +
            "3rm++1zhmHhevThkqNLrnBVwaTW3zXKxy5uiQ8lU7r7uGPJ8QbeaVevLLd8Yebcu\n" +
            "WRRD+/JKSRmZ6pxRWKGU+pWZcXDxiRx8Oh6CQDd/SokiDdk336gtxmFexNACDfhx\n" +
            "FTP+Xox+S8Rs71YpuC6h2gTiG/smrCip6QXYmNyaKxi+B5WH29yxTOjh3tjMSzLz\n" +
            "sxgwBlo8SLwCyXE2kl7OURlJO3SN5eVUs4QHlubEmZ2qAnBdApq0RGlG5VOtJKfZ\n" +
            "BDdb1Uah+mqgcvImIHDgyUKMybxXAuGHvvR6THyQi5Xs29iatIAETlYHnio=\n" +
            "-----END CERTIFICATE-----";

    public static final String privateKey = "-----BEGIN PRIVATE KEY-----\n" +
            "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDHkn8TvoYW3vlS\n" +
            "eiA2QqRimOmb4AN+FswIsRT+0c5eE5oEgTLpBjPZ355KwnDVPzWHvALndaemYt3p\n" +
            "RTUyScvr5cWRWQTwnefu4nnCYeFfBvSoB8615bk9uBFlD/7TFYpuCVzI/VLaOwfX\n" +
            "9SHwu7TMXsOPy0SxHxcJWhO/y5iMlGNZvkfaU+7FA2DojXoVW8RtN5K4YoZpAkE7\n" +
            "YGedYTlDuDQ0o77LkPX1AU+89NPLdF7VyhAUm6K4IPS0PDM8Xfh7c0LedWuDrXJk\n" +
            "Q1aY+DXO/vkleiVjTcd7x5oxTwqS8V2brHmhNPlUAGfemp7nIBzLJcVyczfE71a5\n" +
            "nsdNz+rzAgMBAAECggEAEB9rKb6uGYHo9XtNR+TpX9fHo6Kc1Z5k3Fzl+9IaUGpX\n" +
            "+n4vjTjFjpfss1BzCh9BpVYQi/9qzFvXXqWLLyVcFpIo/F2LMx8mohtkx8ndia5H\n" +
            "rJ142yQUa4KH0TjSFt56IPqbptckTuIO96jjlY2shQgw11iOE5sV4tkGmGuLxut/\n" +
            "bZXOumJiB77pqKhpTSRKNI010Pwcb3/Z1gQDrAB0Rf8HYDOU9tPfq+I3HVY82tj1\n" +
            "i+4AQHFEYLjvMoSSo4S4rYz2YBh51p7A5+feHJ0333RDpmWyOyAziPAi0+OM/6PG\n" +
            "+Sq74kBgOp34d34SchmOsh52PeycVYiVoPKNdEQmdQKBgQDs2fuVYZ34sv4UJ6RO\n" +
            "qPYKTQOc/H8M49LvoX5xhUicR1VmKpRSe3a4w2H26LC3ThInxX/oNtm5it3HgRbn\n" +
            "GDEDeDCtHYEhigfXNzpNcfrWOk8AY64D9xTy+lTNOjQzmwyg4Y/VlDjZWCIKMFIm\n" +
            "YhBpoZy8ZTrMdYX7kb0rS8jH3QKBgQDXtPXpOJEADILmH3W7Jbn2t/XC6A/LD4fJ\n" +
            "bIkhJp6uIQvfv8skWGDn1wpTdaXxQkhBUdQenAvNLnTD9r2r371ynkUghXbXvSE9\n" +
            "ulS65TcIqN4klJJLmCcysFFHohuYOOnnyYay2N96L1qaPliflHYYYPabnLyHWPDa\n" +
            "2h9V5/w5DwKBgQDl+kbp5m4wNQS2Z0OISVEV8W/Ht/hZeMGxglq3OZamgDEw0blR\n" +
            "WaaOgtCVoZ0tb7X7Pi8TOGcyXN85v2OQopG877A798ER4uf4Fh0bY8gOyXE6TI+E\n" +
            "NB74Sw+acqCLV0rsz/gMhy6oA4aR5BdwQ5nyJ0V8PMLaEmc1PW60IpLjVQKBgCuA\n" +
            "ikuTpeKNo2SHmbW5gQyZww2gwXahVjAwHGO8JypU7dEdG/njfP+kpad5RZMnW+0Y\n" +
            "dKALtnGV2eSfgVcFU26nLqfFYtdVhDuvtWDP006Cx/I2qF5ofBdD6dB5h/kmGT4u\n" +
            "rWSqSj+ZBzuuMS9VwI9gFrwBWyAstr5cWQ95LqvPAoGAd3do4MzuAoQo6yhG+kLy\n" +
            "KNYggfUWwnoiySNWETmKJtvz74pXV53lBaHKhQyooa32m1PiRwJbZ3Y3Hh8x1Wiz\n" +
            "l8rk5P4J1YYKCnfucrbNuaOUtQ3AiLPtge4fY9jK4rexbvKm4ZHypZVQXvr060hS\n" +
            "M51cyaCMudHASXdy2B/BOkk=\n" +
            "-----END PRIVATE KEY-----";


    public static final String caCertificateChain = "-----BEGIN CERTIFICATE-----\n" +
            "MIIDzTCCArWgAwIBAgIUD9/fOe2h4U4TO3CRrC5p5YF+PkEwDQYJKoZIhvcNAQEL\n" +
            "BQAwdjELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcM\n" +
            "DVNhbiBGcmFuY2lzY28xEzARBgNVBAoMCk15IENvbXBhbnkxDDAKBgNVBAsMA09y\n" +
            "ZzEXMBUGA1UEAwwOQ2xpZW50IFJvb3QgQ0EwHhcNMjQxMjA1MDc1NzE3WhcNMzQx\n" +
            "MjAzMDc1NzE3WjB2MQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEW\n" +
            "MBQGA1UEBwwNU2FuIEZyYW5jaXNjbzETMBEGA1UECgwKTXkgQ29tcGFueTEMMAoG\n" +
            "A1UECwwDT3JnMRcwFQYDVQQDDA5DbGllbnQgUm9vdCBDQTCCASIwDQYJKoZIhvcN\n" +
            "AQEBBQADggEPADCCAQoCggEBAOEtVf7gTNKc2V51PHiGVwNH+XdkoRFrq5ppL7p5\n" +
            "KCm3J1FIe2VqvjrXGQbNo4DL6ExLzVxcZ/fg8eWOPkMSbyQcn42vORnBVMM9cOxX\n" +
            "OTSfkC91whcJvHshW1xmIPJAg8RriZF6TqyrUvmsejGLBxKOHmdI60a5oeGu11aJ\n" +
            "AyBZI3nu9y47AwZmIMGG2LNKZ0cm1VoFLkRIT6rAOlv0XQIFp2XwwGGV9rXs3Bnc\n" +
            "pcqT6zTXzQFFx63HuWClqRn+WgU4j0DBuPASFQLpIF7p5pn7a6ZUUqY1jVkvFBA8\n" +
            "nYf4VRpDtAPxZiFUcv+5RQHo4B72C8X69aiR0YNu0WMV27UCAwEAAaNTMFEwHQYD\n" +
            "VR0OBBYEFJxaU4P8BfV/cfZsTvN+i6r0HtanMB8GA1UdIwQYMBaAFJxaU4P8BfV/\n" +
            "cfZsTvN+i6r0HtanMA8GA1UdEwEB/wQFMAMBAf8wDQYJKoZIhvcNAQELBQADggEB\n" +
            "AAajnQDqgvpbIEODeVbH1xpREJE6WE3CkX5xsi5glqJvw7g+b84/04JLf7tEWksD\n" +
            "YabAtnYSY1+VyqIlmSizqMHP/vUMICQlX9hmB6Ma6HDAXinGVM27uXbcuneztWbk\n" +
            "2VsnxQzUqpA8dMAdcGldkhQ2FbpF8sXg5YP+72K0GGtO66FRpBVXNv04CBFmxYpc\n" +
            "fPoBQDSeP4xvfTJDIn9hdjkmxq43KtnsDubPEWInjSVWz1Gr4Ha1gMsWBEdt6dHe\n" +
            "tio+S+/kTHvFVXj5LcXazFeSaJ+w7vs7t52t5bB3mqblfFUqdVi30eDDskhkV4yE\n" +
            "qUBouDmeKNeS64Jh3pXeSA4=\n" +
            "-----END CERTIFICATE-----\n" +
            "-----BEGIN CERTIFICATE-----\n" +
            "MIIDwjCCAqqgAwIBAgIUMIaUOkqmt9PrHAkqpvMcpwXWzx8wDQYJKoZIhvcNAQEL\n" +
            "BQAweDELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcM\n" +
            "DVNhbiBGcmFuY2lzY28xEzARBgNVBAoMCk15IENvbXBhbnkxDDAKBgNVBAsMA09y\n" +
            "ZzEZMBcGA1UEAwwQQ2xpZW50IDIgUm9vdCBDQTAeFw0yNDEyMDUwOTM1NDVaFw0y\n" +
            "NTEyMDUwOTM1NDVaMHoxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlh\n" +
            "MRYwFAYDVQQHDA1TYW4gRnJhbmNpc2NvMRMwEQYDVQQKDApNeSBDb21wYW55MQww\n" +
            "CgYDVQQLDANPcmcxGzAZBgNVBAMMEmNsaWVudC5leGFtcGxlLmNvbTCCASIwDQYJ\n" +
            "KoZIhvcNAQEBBQADggEPADCCAQoCggEBAJ5+v5wWjMzcniA6/8VBR/5rlwxsUx6s\n" +
            "04oizUkTWt4+eO3rXHkSgUY+kLlvGAx4q3ZPT+IusZo6nBIn64tfgti1y3fWx/JA\n" +
            "0Bltf7ptixvpj0FU1WExjQqTeRuGFAp1kFzrezP5umdtBUwjzpSn721PuX/Mjl6p\n" +
            "T8T+hcMb7QYdaKWeJezys6yeycGLT0yw+tLZ3FPm2IxcBpDOBENrOXD5KaWw0b9O\n" +
            "oieUrlPRsb+nNr3Wo0WiZPuYxrqluIPbU6glf6Gp8HAUMzTRIS0bTi1TPhlrLY52\n" +
            "H6vJu/aodYPf8yfGAJaEzyCu1NXkG1y9WAItwVyhHbEAG50S2GL0hq8CAwEAAaNC\n" +
            "MEAwHQYDVR0OBBYEFPM/C65tD+f0VMo+HYq8XBBT4G+0MB8GA1UdIwQYMBaAFOk9\n" +
            "zNSvOtMpcOCS22jwiqsakc6bMA0GCSqGSIb3DQEBCwUAA4IBAQChYznl85o0B4iR\n" +
            "I7c371waY4ROYpKeU9P6N5IKx+qIv6qQF8EwE7OAgYWZpa9Ty1DlWVAkVOYJMr0D\n" +
            "/H8zzOTXXhV26SnoUviJLB+7Mx0esCkjmw1053yMyTHbjxsInmD1sv4QpDufm46j\n" +
            "QFcUVO/62xydGROyusxTlGtSgVHQqAcgfhf1kMvMh3asFCv2LU5MVOAuzF5E19vj\n" +
            "sdVpIzcxSkSArzuRaIUaq0xJK6Z94ZSS2lyiGT9dN4KaP8PSHyOyDOnByi+KAi++\n" +
            "l1H+BVl8Z8AnPCFdnQBQ+CD+UndpDF9LBHZw8ewlMTmASp3vN9swygrk/qj5X29/\n" +
            "SFYZCsJG\n" +
            "-----END CERTIFICATE-----";


}
