package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface ChannelApi
{
  public static final String ACTION_CHANNEL_EVENT = "com.google.android.gms.wearable.CHANNEL_EVENT";
  
  public abstract PendingResult addListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener);
  
  public abstract PendingResult openChannel(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2);
  
  public abstract PendingResult removeListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener);
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.ChannelApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */