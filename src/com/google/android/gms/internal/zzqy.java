package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.model.moments.Moment;

public final class zzqy
  implements Moments
{
  public final PendingResult load(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzqy.1(this, paramGoogleApiClient));
  }
  
  public final PendingResult load(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    return paramGoogleApiClient.zza(new zzqy.2(this, paramGoogleApiClient, paramInt, paramString1, paramUri, paramString2, paramString3));
  }
  
  public final PendingResult remove(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new zzqy.4(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult write(GoogleApiClient paramGoogleApiClient, Moment paramMoment)
  {
    return paramGoogleApiClient.zzb(new zzqy.3(this, paramGoogleApiClient, paramMoment));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */