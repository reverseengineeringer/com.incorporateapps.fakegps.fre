.class public Landroid/net/http/DelegatingSSLSession$CertificateWrap;
.super Landroid/net/http/DelegatingSSLSession;


# direct methods
.method public constructor <init>(Ljava/security/cert/Certificate;)V
    .locals 2

    invoke-direct {p0}, Landroid/net/http/DelegatingSSLSession;-><init>()V

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Stub!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public getPeerCertificates()[Ljava/security/cert/Certificate;
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Stub!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
