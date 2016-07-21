.class Lcom/google/android/gms/measurement/internal/zzq$zzc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzTJ:Ljava/lang/String;

.field private final zzaWS:[B

.field private final zzaWT:Lcom/google/android/gms/measurement/internal/zzq$zza;

.field private final zzaWU:Ljava/util/Map;

.field final synthetic zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

.field private final zzzq:Ljava/net/URL;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzq;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/zzq$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzx;->zzcM(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzzq:Ljava/net/URL;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWS:[B

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWT:Lcom/google/android/gms/measurement/internal/zzq$zza;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzTJ:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWU:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    const/4 v5, 0x0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzq;->zzCd()V

    const/4 v4, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzzq:Ljava/net/URL;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzq;->zzc(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWU:Ljava/util/Map;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWU:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/util/Map$Entry;

    move-object v2, v0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v10

    move v9, v4

    move-object v1, v5

    move-object v2, v3

    :goto_1
    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_0
    :goto_2
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzq;->zzCn()Lcom/google/android/gms/measurement/internal/zzv;

    move-result-object v1

    new-instance v6, Lcom/google/android/gms/measurement/internal/zzq$zzb;

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzTJ:Ljava/lang/String;

    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWT:Lcom/google/android/gms/measurement/internal/zzq$zza;

    move-object v11, v5

    move-object v12, v5

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/measurement/internal/zzq$zzb;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq$zza;ILjava/lang/Throwable;[BLcom/google/android/gms/measurement/internal/zzq$1;)V

    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/zzv;->zzg(Ljava/lang/Runnable;)V

    :goto_3
    return-void

    :cond_2
    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWS:[B

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzq;->zzCk()Lcom/google/android/gms/measurement/internal/zzaj;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWS:[B

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzaj;->zzg([B)[B

    move-result-object v2

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzq;->zzAo()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzCK()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v6, "Uploading data. size"

    array-length v7, v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const-string v1, "Content-Encoding"

    const-string v6, "gzip"

    invoke-virtual {v3, v1, v6}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    array-length v1, v2

    invoke-virtual {v3, v1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v1

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_3
    :try_start_5
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v1, v3}, Lcom/google/android/gms/measurement/internal/zzq;->zza(Lcom/google/android/gms/measurement/internal/zzq;Ljava/net/HttpURLConnection;)[B
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v6

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzq;->zzCn()Lcom/google/android/gms/measurement/internal/zzv;

    move-result-object v8

    new-instance v1, Lcom/google/android/gms/measurement/internal/zzq$zzb;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzTJ:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWT:Lcom/google/android/gms/measurement/internal/zzq$zza;

    move-object v7, v5

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/measurement/internal/zzq$zzb;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq$zza;ILjava/lang/Throwable;[BLcom/google/android/gms/measurement/internal/zzq$1;)V

    invoke-virtual {v8, v1}, Lcom/google/android/gms/measurement/internal/zzv;->zzg(Ljava/lang/Runnable;)V

    goto :goto_3

    :catch_1
    move-exception v1

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzq;->zzAo()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzp;->zzCE()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v3

    const-string v4, "Error closing HTTP compressed POST connection output stream"

    invoke-virtual {v3, v4, v1}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :catchall_0
    move-exception v1

    move-object v8, v1

    move-object v3, v5

    move-object v1, v5

    :goto_4
    if-eqz v1, :cond_5

    :try_start_6
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    :cond_5
    :goto_5
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzq;->zzCn()Lcom/google/android/gms/measurement/internal/zzv;

    move-result-object v9

    new-instance v1, Lcom/google/android/gms/measurement/internal/zzq$zzb;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzTJ:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWT:Lcom/google/android/gms/measurement/internal/zzq$zza;

    move-object v6, v5

    move-object v7, v5

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/measurement/internal/zzq$zzb;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq$zza;ILjava/lang/Throwable;[BLcom/google/android/gms/measurement/internal/zzq$1;)V

    invoke-virtual {v9, v1}, Lcom/google/android/gms/measurement/internal/zzv;->zzg(Ljava/lang/Runnable;)V

    throw v8

    :catch_2
    move-exception v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzq$zzc;->zzaWV:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzq;->zzAo()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzp;->zzCE()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v2

    const-string v6, "Error closing HTTP compressed POST connection output stream"

    invoke-virtual {v2, v6, v1}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :catchall_1
    move-exception v1

    move-object v8, v1

    move-object v1, v5

    goto :goto_4

    :catchall_2
    move-exception v2

    move-object v8, v2

    goto :goto_4

    :catch_3
    move-exception v10

    move v9, v4

    move-object v1, v5

    move-object v2, v5

    goto/16 :goto_1

    :catch_4
    move-exception v10

    move v9, v4

    move-object v2, v3

    goto/16 :goto_1
.end method
