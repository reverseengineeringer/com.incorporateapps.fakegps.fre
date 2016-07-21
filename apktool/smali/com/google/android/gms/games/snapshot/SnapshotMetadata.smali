.class public interface abstract Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/google/android/gms/common/data/Freezable;


# static fields
.field public static final PLAYED_TIME_UNKNOWN:J = -0x1L

.field public static final PROGRESS_VALUE_UNKNOWN:J = -0x1L


# virtual methods
.method public abstract getCoverImageAspectRatio()F
.end method

.method public abstract getCoverImageUri()Landroid/net/Uri;
.end method

.method public abstract getCoverImageUrl()Ljava/lang/String;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getDescription(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract getDeviceName()Ljava/lang/String;
.end method

.method public abstract getGame()Lcom/google/android/gms/games/Game;
.end method

.method public abstract getLastModifiedTimestamp()J
.end method

.method public abstract getOwner()Lcom/google/android/gms/games/Player;
.end method

.method public abstract getPlayedTime()J
.end method

.method public abstract getProgressValue()J
.end method

.method public abstract getSnapshotId()Ljava/lang/String;
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract getUniqueName()Ljava/lang/String;
.end method

.method public abstract hasChangePending()Z
.end method
