package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.PutDataRequest;

public final class zzx
  implements DataApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    return zzb.zza(paramGoogleApiClient, zza(paramArrayOfIntentFilter), paramDataListener);
  }
  
  private static zzb.zza zza(IntentFilter[] paramArrayOfIntentFilter)
  {
    return new zzx.8(paramArrayOfIntentFilter);
  }
  
  private void zza(Asset paramAsset)
  {
    if (paramAsset == null) {
      throw new IllegalArgumentException("asset is null");
    }
    if (paramAsset.getDigest() == null) {
      throw new IllegalArgumentException("invalid asset");
    }
    if (paramAsset.getData() != null) {
      throw new IllegalArgumentException("invalid asset");
    }
  }
  
  public final PendingResult addListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener)
  {
    return zza(paramGoogleApiClient, paramDataListener, new IntentFilter[] { zzbn.zzgM("com.google.android.gms.wearable.DATA_CHANGED") });
  }
  
  public final PendingResult addListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener, Uri paramUri, int paramInt)
  {
    if (paramUri != null)
    {
      bool = true;
      com.google.android.gms.common.internal.zzx.zzb(bool, "uri must not be null");
      if ((paramInt != 0) && (paramInt != 1)) {
        break label63;
      }
    }
    label63:
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.zzx.zzb(bool, "invalid filter type");
      return zza(paramGoogleApiClient, paramDataListener, new IntentFilter[] { zzbn.zza("com.google.android.gms.wearable.DATA_CHANGED", paramUri, paramInt) });
      bool = false;
      break;
    }
  }
  
  public final PendingResult deleteDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return deleteDataItems(paramGoogleApiClient, paramUri, 0);
  }
  
  public final PendingResult deleteDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri, int paramInt)
  {
    boolean bool2 = false;
    if (paramUri != null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      com.google.android.gms.common.internal.zzx.zzb(bool1, "uri must not be null");
      if (paramInt != 0)
      {
        bool1 = bool2;
        if (paramInt != 1) {}
      }
      else
      {
        bool1 = true;
      }
      com.google.android.gms.common.internal.zzx.zzb(bool1, "invalid filter type");
      return paramGoogleApiClient.zza(new zzx.5(this, paramGoogleApiClient, paramUri, paramInt));
    }
  }
  
  public final PendingResult getDataItem(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return paramGoogleApiClient.zza(new zzx.2(this, paramGoogleApiClient, paramUri));
  }
  
  public final PendingResult getDataItems(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzx.3(this, paramGoogleApiClient));
  }
  
  public final PendingResult getDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return getDataItems(paramGoogleApiClient, paramUri, 0);
  }
  
  public final PendingResult getDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri, int paramInt)
  {
    boolean bool2 = false;
    if (paramUri != null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      com.google.android.gms.common.internal.zzx.zzb(bool1, "uri must not be null");
      if (paramInt != 0)
      {
        bool1 = bool2;
        if (paramInt != 1) {}
      }
      else
      {
        bool1 = true;
      }
      com.google.android.gms.common.internal.zzx.zzb(bool1, "invalid filter type");
      return paramGoogleApiClient.zza(new zzx.4(this, paramGoogleApiClient, paramUri, paramInt));
    }
  }
  
  public final PendingResult getFdForAsset(GoogleApiClient paramGoogleApiClient, Asset paramAsset)
  {
    zza(paramAsset);
    return paramGoogleApiClient.zza(new zzx.6(this, paramGoogleApiClient, paramAsset));
  }
  
  public final PendingResult getFdForAsset(GoogleApiClient paramGoogleApiClient, DataItemAsset paramDataItemAsset)
  {
    return paramGoogleApiClient.zza(new zzx.7(this, paramGoogleApiClient, paramDataItemAsset));
  }
  
  public final PendingResult putDataItem(GoogleApiClient paramGoogleApiClient, PutDataRequest paramPutDataRequest)
  {
    return paramGoogleApiClient.zza(new zzx.1(this, paramGoogleApiClient, paramPutDataRequest));
  }
  
  public final PendingResult removeListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener)
  {
    return paramGoogleApiClient.zza(new zzx.9(this, paramGoogleApiClient, paramDataListener));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */