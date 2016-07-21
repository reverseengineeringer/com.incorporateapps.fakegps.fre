.class public interface abstract Lorg/apache/http/client/AuthenticationHandler;
.super Ljava/lang/Object;


# virtual methods
.method public abstract getChallenges(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Ljava/util/Map;
.end method

.method public abstract isAuthenticationRequested(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Z
.end method

.method public abstract selectScheme(Ljava/util/Map;Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/auth/AuthScheme;
.end method
