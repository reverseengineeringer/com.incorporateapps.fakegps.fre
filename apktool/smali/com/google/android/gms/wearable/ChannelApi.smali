.class public interface abstract Lcom/google/android/gms/wearable/ChannelApi;
.super Ljava/lang/Object;


# static fields
.field public static final ACTION_CHANNEL_EVENT:Ljava/lang/String; = "com.google.android.gms.wearable.CHANNEL_EVENT"


# virtual methods
.method public abstract addListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)Lcom/google/android/gms/common/api/PendingResult;
.end method

.method public abstract openChannel(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end method

.method public abstract removeListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)Lcom/google/android/gms/common/api/PendingResult;
.end method
