package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageApi.MessageListener;

public final class zzaz
  implements MessageApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    return paramGoogleApiClient.zza(new zzaz.zza(paramGoogleApiClient, paramMessageListener, paramGoogleApiClient.zzr(paramMessageListener), paramArrayOfIntentFilter, null));
  }
  
  public final PendingResult addListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener)
  {
    return zza(paramGoogleApiClient, paramMessageListener, new IntentFilter[] { zzbn.zzgM("com.google.android.gms.wearable.MESSAGE_RECEIVED") });
  }
  
  public final PendingResult addListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener, Uri paramUri, int paramInt)
  {
    if (paramUri != null)
    {
      bool = true;
      zzx.zzb(bool, "uri must not be null");
      if ((paramInt != 0) && (paramInt != 1)) {
        break label63;
      }
    }
    label63:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "invalid filter type");
      return zza(paramGoogleApiClient, paramMessageListener, new IntentFilter[] { zzbn.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED", paramUri, paramInt) });
      bool = false;
      break;
    }
  }
  
  public final PendingResult removeListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener)
  {
    return paramGoogleApiClient.zza(new zzaz.2(this, paramGoogleApiClient, paramMessageListener));
  }
  
  public final PendingResult sendMessage(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.zza(new zzaz.1(this, paramGoogleApiClient, paramString1, paramString2, paramArrayOfByte));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */