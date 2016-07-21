package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import org.json.JSONObject;

public class RemoteMediaPlayer
  implements Cast.MessageReceivedCallback
{
  public static final int RESUME_STATE_PAUSE = 2;
  public static final int RESUME_STATE_PLAY = 1;
  public static final int RESUME_STATE_UNCHANGED = 0;
  public static final int STATUS_CANCELED = 2101;
  public static final int STATUS_FAILED = 2100;
  public static final int STATUS_REPLACED = 2103;
  public static final int STATUS_SUCCEEDED = 0;
  public static final int STATUS_TIMED_OUT = 2102;
  private final zzm zzabE = new RemoteMediaPlayer.1(this, null);
  private final RemoteMediaPlayer.zza zzabF = new RemoteMediaPlayer.zza(this);
  private RemoteMediaPlayer.OnPreloadStatusUpdatedListener zzabG;
  private RemoteMediaPlayer.OnQueueStatusUpdatedListener zzabH;
  private RemoteMediaPlayer.OnMetadataUpdatedListener zzabI;
  private RemoteMediaPlayer.OnStatusUpdatedListener zzabJ;
  private final Object zzpV = new Object();
  
  public RemoteMediaPlayer()
  {
    zzabE.zza(zzabF);
  }
  
  private void onMetadataUpdated()
  {
    if (zzabI != null) {
      zzabI.onMetadataUpdated();
    }
  }
  
  private void onPreloadStatusUpdated()
  {
    if (zzabG != null) {
      zzabG.onPreloadStatusUpdated();
    }
  }
  
  private void onQueueStatusUpdated()
  {
    if (zzabH != null) {
      zzabH.onQueueStatusUpdated();
    }
  }
  
  private void onStatusUpdated()
  {
    if (zzabJ != null) {
      zzabJ.onStatusUpdated();
    }
  }
  
  private int zzbf(int paramInt)
  {
    MediaStatus localMediaStatus = getMediaStatus();
    int i = 0;
    while (i < localMediaStatus.getQueueItemCount())
    {
      if (localMediaStatus.getQueueItem(i).getItemId() == paramInt) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  public long getApproximateStreamPosition()
  {
    synchronized (zzpV)
    {
      long l = zzabE.getApproximateStreamPosition();
      return l;
    }
  }
  
  public MediaInfo getMediaInfo()
  {
    synchronized (zzpV)
    {
      MediaInfo localMediaInfo = zzabE.getMediaInfo();
      return localMediaInfo;
    }
  }
  
  public MediaStatus getMediaStatus()
  {
    synchronized (zzpV)
    {
      MediaStatus localMediaStatus = zzabE.getMediaStatus();
      return localMediaStatus;
    }
  }
  
  public String getNamespace()
  {
    return zzabE.getNamespace();
  }
  
  public long getStreamDuration()
  {
    synchronized (zzpV)
    {
      long l = zzabE.getStreamDuration();
      return l;
    }
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo)
  {
    return load(paramGoogleApiClient, paramMediaInfo, true, 0L, null, null);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, 0L, null, null);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, null, null);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, JSONObject paramJSONObject)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, null, paramJSONObject);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, long[] paramArrayOfLong, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.12(this, paramGoogleApiClient, paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, paramArrayOfLong, paramJSONObject));
  }
  
  public void onMessageReceived(CastDevice paramCastDevice, String paramString1, String paramString2)
  {
    zzabE.zzcf(paramString2);
  }
  
  public PendingResult pause(GoogleApiClient paramGoogleApiClient)
  {
    return pause(paramGoogleApiClient, null);
  }
  
  public PendingResult pause(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.17(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject));
  }
  
  public PendingResult play(GoogleApiClient paramGoogleApiClient)
  {
    return play(paramGoogleApiClient, null);
  }
  
  public PendingResult play(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.19(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject));
  }
  
  public PendingResult queueAppendItem(GoogleApiClient paramGoogleApiClient, MediaQueueItem paramMediaQueueItem, JSONObject paramJSONObject)
  {
    return queueInsertItems(paramGoogleApiClient, new MediaQueueItem[] { paramMediaQueueItem }, 0, paramJSONObject);
  }
  
  public PendingResult queueInsertAndPlayItem(GoogleApiClient paramGoogleApiClient, MediaQueueItem paramMediaQueueItem, int paramInt, long paramLong, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.6(this, paramGoogleApiClient, paramGoogleApiClient, paramMediaQueueItem, paramInt, paramLong, paramJSONObject));
  }
  
  public PendingResult queueInsertAndPlayItem(GoogleApiClient paramGoogleApiClient, MediaQueueItem paramMediaQueueItem, int paramInt, JSONObject paramJSONObject)
  {
    return queueInsertAndPlayItem(paramGoogleApiClient, paramMediaQueueItem, paramInt, -1L, paramJSONObject);
  }
  
  public PendingResult queueInsertItems(GoogleApiClient paramGoogleApiClient, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.5(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfMediaQueueItem, paramInt, paramJSONObject));
  }
  
  public PendingResult queueJumpToItem(GoogleApiClient paramGoogleApiClient, int paramInt, long paramLong, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.15(this, paramGoogleApiClient, paramInt, paramGoogleApiClient, paramLong, paramJSONObject));
  }
  
  public PendingResult queueJumpToItem(GoogleApiClient paramGoogleApiClient, int paramInt, JSONObject paramJSONObject)
  {
    return queueJumpToItem(paramGoogleApiClient, paramInt, -1L, paramJSONObject);
  }
  
  public PendingResult queueLoad(GoogleApiClient paramGoogleApiClient, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, long paramLong, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.4(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfMediaQueueItem, paramInt1, paramInt2, paramLong, paramJSONObject));
  }
  
  public PendingResult queueLoad(GoogleApiClient paramGoogleApiClient, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, JSONObject paramJSONObject)
  {
    return queueLoad(paramGoogleApiClient, paramArrayOfMediaQueueItem, paramInt1, paramInt2, -1L, paramJSONObject);
  }
  
  public PendingResult queueMoveItemToNewIndex(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.16(this, paramGoogleApiClient, paramInt1, paramInt2, paramGoogleApiClient, paramJSONObject));
  }
  
  public PendingResult queueNext(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.11(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject));
  }
  
  public PendingResult queuePrev(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.10(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject));
  }
  
  public PendingResult queueRemoveItem(GoogleApiClient paramGoogleApiClient, int paramInt, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.14(this, paramGoogleApiClient, paramInt, paramGoogleApiClient, paramJSONObject));
  }
  
  public PendingResult queueRemoveItems(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.8(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfInt, paramJSONObject));
  }
  
  public PendingResult queueReorderItems(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt, int paramInt, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.9(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfInt, paramInt, paramJSONObject));
  }
  
  public PendingResult queueSetRepeatMode(GoogleApiClient paramGoogleApiClient, int paramInt, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.13(this, paramGoogleApiClient, paramGoogleApiClient, paramInt, paramJSONObject));
  }
  
  public PendingResult queueUpdateItems(GoogleApiClient paramGoogleApiClient, MediaQueueItem[] paramArrayOfMediaQueueItem, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.7(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfMediaQueueItem, paramJSONObject));
  }
  
  public PendingResult requestStatus(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.23(this, paramGoogleApiClient, paramGoogleApiClient));
  }
  
  public PendingResult seek(GoogleApiClient paramGoogleApiClient, long paramLong)
  {
    return seek(paramGoogleApiClient, paramLong, 0, null);
  }
  
  public PendingResult seek(GoogleApiClient paramGoogleApiClient, long paramLong, int paramInt)
  {
    return seek(paramGoogleApiClient, paramLong, paramInt, null);
  }
  
  public PendingResult seek(GoogleApiClient paramGoogleApiClient, long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.20(this, paramGoogleApiClient, paramGoogleApiClient, paramLong, paramInt, paramJSONObject));
  }
  
  public PendingResult setActiveMediaTracks(GoogleApiClient paramGoogleApiClient, long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {
      throw new IllegalArgumentException("trackIds cannot be null");
    }
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.2(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfLong));
  }
  
  public void setOnMetadataUpdatedListener(RemoteMediaPlayer.OnMetadataUpdatedListener paramOnMetadataUpdatedListener)
  {
    zzabI = paramOnMetadataUpdatedListener;
  }
  
  public void setOnPreloadStatusUpdatedListener(RemoteMediaPlayer.OnPreloadStatusUpdatedListener paramOnPreloadStatusUpdatedListener)
  {
    zzabG = paramOnPreloadStatusUpdatedListener;
  }
  
  public void setOnQueueStatusUpdatedListener(RemoteMediaPlayer.OnQueueStatusUpdatedListener paramOnQueueStatusUpdatedListener)
  {
    zzabH = paramOnQueueStatusUpdatedListener;
  }
  
  public void setOnStatusUpdatedListener(RemoteMediaPlayer.OnStatusUpdatedListener paramOnStatusUpdatedListener)
  {
    zzabJ = paramOnStatusUpdatedListener;
  }
  
  public PendingResult setStreamMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return setStreamMute(paramGoogleApiClient, paramBoolean, null);
  }
  
  public PendingResult setStreamMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.22(this, paramGoogleApiClient, paramGoogleApiClient, paramBoolean, paramJSONObject));
  }
  
  public PendingResult setStreamVolume(GoogleApiClient paramGoogleApiClient, double paramDouble)
  {
    return setStreamVolume(paramGoogleApiClient, paramDouble, null);
  }
  
  public PendingResult setStreamVolume(GoogleApiClient paramGoogleApiClient, double paramDouble, JSONObject paramJSONObject)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      throw new IllegalArgumentException("Volume cannot be " + paramDouble);
    }
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.21(this, paramGoogleApiClient, paramGoogleApiClient, paramDouble, paramJSONObject));
  }
  
  public PendingResult setTextTrackStyle(GoogleApiClient paramGoogleApiClient, TextTrackStyle paramTextTrackStyle)
  {
    if (paramTextTrackStyle == null) {
      throw new IllegalArgumentException("trackStyle cannot be null");
    }
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.3(this, paramGoogleApiClient, paramGoogleApiClient, paramTextTrackStyle));
  }
  
  public PendingResult stop(GoogleApiClient paramGoogleApiClient)
  {
    return stop(paramGoogleApiClient, null);
  }
  
  public PendingResult stop(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.zzb(new RemoteMediaPlayer.18(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */