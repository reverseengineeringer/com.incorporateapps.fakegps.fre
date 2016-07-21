.class public interface abstract Lcom/google/android/gms/wearable/MessageApi;
.super Ljava/lang/Object;


# static fields
.field public static final ACTION_MESSAGE_RECEIVED:Ljava/lang/String; = "com.google.android.gms.wearable.MESSAGE_RECEIVED"

.field public static final FILTER_LITERAL:I = 0x0

.field public static final FILTER_PREFIX:I = 0x1

.field public static final UNKNOWN_REQUEST_ID:I = -0x1


# virtual methods
.method public abstract addListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/MessageApi$MessageListener;)Lcom/google/android/gms/common/api/PendingResult;
.end method

.method public abstract addListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Landroid/net/Uri;I)Lcom/google/android/gms/common/api/PendingResult;
.end method

.method public abstract removeListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/MessageApi$MessageListener;)Lcom/google/android/gms/common/api/PendingResult;
.end method

.method public abstract sendMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;
.end method
