package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.panorama.PanoramaApi;

public class zzqq
  implements PanoramaApi
{
  private static void zza(Context paramContext, Uri paramUri)
  {
    paramContext.revokeUriPermission(paramUri, 1);
  }
  
  private static void zza(Context paramContext, zzqp paramzzqp, zzqo paramzzqo, Uri paramUri, Bundle paramBundle)
  {
    paramContext.grantUriPermission("com.google.android.gms", paramUri, 1);
    paramzzqo = new zzqq.3(paramContext, paramUri, paramzzqo);
    try
    {
      paramzzqp.zza(paramzzqo, paramUri, paramBundle, true);
      return;
    }
    catch (RemoteException paramzzqp)
    {
      paramContext.revokeUriPermission(paramUri, 1);
      throw paramzzqp;
    }
    catch (RuntimeException paramzzqp)
    {
      paramContext.revokeUriPermission(paramUri, 1);
      throw paramzzqp;
    }
  }
  
  public PendingResult loadPanoramaInfo(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return paramGoogleApiClient.zza(new zzqq.1(this, paramGoogleApiClient, paramUri));
  }
  
  public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return paramGoogleApiClient.zza(new zzqq.2(this, paramGoogleApiClient, paramUri));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */