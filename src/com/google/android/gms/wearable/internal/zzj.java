package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;

public class zzj
  implements CapabilityApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    return zzb.zza(paramGoogleApiClient, zza(paramArrayOfIntentFilter), paramCapabilityListener);
  }
  
  private static zzb.zza zza(IntentFilter[] paramArrayOfIntentFilter)
  {
    return new zzj.5(paramArrayOfIntentFilter);
  }
  
  public PendingResult addCapabilityListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "capability must not be null");
      zzj.zzb localzzb = new zzj.zzb(paramCapabilityListener, paramString);
      IntentFilter localIntentFilter = zzbn.zzgM("com.google.android.gms.wearable.CAPABILITY_CHANGED");
      paramCapabilityListener = paramString;
      if (!paramString.startsWith("/")) {
        paramCapabilityListener = "/" + paramString;
      }
      localIntentFilter.addDataPath(paramCapabilityListener, 0);
      return zza(paramGoogleApiClient, localzzb, new IntentFilter[] { localIntentFilter });
    }
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, Uri paramUri, int paramInt)
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
      return zza(paramGoogleApiClient, paramCapabilityListener, new IntentFilter[] { zzbn.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", paramUri, paramInt) });
      bool = false;
      break;
    }
  }
  
  public PendingResult addLocalCapability(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzj.3(this, paramGoogleApiClient, paramString));
  }
  
  public PendingResult getAllCapabilities(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramInt != 0) {
      if (paramInt != 1) {
        break label37;
      }
    }
    label37:
    for (bool1 = bool2;; bool1 = false)
    {
      zzx.zzac(bool1);
      return paramGoogleApiClient.zza(new zzj.2(this, paramGoogleApiClient, paramInt));
    }
  }
  
  public PendingResult getCapability(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramInt != 0) {
      if (paramInt != 1) {
        break label41;
      }
    }
    label41:
    for (bool1 = bool2;; bool1 = false)
    {
      zzx.zzac(bool1);
      return paramGoogleApiClient.zza(new zzj.1(this, paramGoogleApiClient, paramString, paramInt));
    }
  }
  
  public PendingResult removeCapabilityListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    return paramGoogleApiClient.zza(new zzj.zzf(paramGoogleApiClient, new zzj.zzb(paramCapabilityListener, paramString), null));
  }
  
  public PendingResult removeListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    return paramGoogleApiClient.zza(new zzj.zzf(paramGoogleApiClient, paramCapabilityListener, null));
  }
  
  public PendingResult removeLocalCapability(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzj.4(this, paramGoogleApiClient, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */